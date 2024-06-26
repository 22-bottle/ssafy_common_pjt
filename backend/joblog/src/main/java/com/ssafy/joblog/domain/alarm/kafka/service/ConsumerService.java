package com.ssafy.joblog.domain.alarm.kafka.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.joblog.domain.alarm.kafka.repository.EmitterRepository;
import com.ssafy.joblog.domain.alarm.kafka.vo.AlarmVo;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.Map;

import static com.ssafy.joblog.domain.alarm.kafka.controller.EmitterController.DEFAULT_TIMEOUT;

@Service
@RequiredArgsConstructor
public class ConsumerService {

    private final EmitterRepository emitterRepository;

    private void sendToClient(SseEmitter emitter, String emitterId, Object data) {
        try {
            emitter.send(SseEmitter.event()
                    .id(emitterId)
                    .data(data));
        } catch (IOException e) {
            emitterRepository.deleteById(emitterId);
        }
    }

    public SseEmitter addEmitter(String userId, String lastEventId) {
        String emitterId = userId + "_" + System.currentTimeMillis();
        SseEmitter emitter = emitterRepository.save(emitterId, new SseEmitter(DEFAULT_TIMEOUT));

        emitter.onCompletion(() -> {
            emitterRepository.deleteById(emitterId);
        });
        emitter.onTimeout(() -> {
            emitterRepository.deleteById(emitterId);
        });

        sendToClient(emitter, emitterId, "connected");
        if (!lastEventId.isEmpty()) {
            Map<String, Object> events = emitterRepository.findAllEventCacheStartWithById(userId);
            events.entrySet().stream()
                    .filter(entry -> lastEventId.compareTo(entry.getKey()) < 0)
                    .forEach(entry -> sendToClient(emitter, entry.getKey(), entry.getValue()));
        }
        return emitter;
    }

    public AlarmVo createAlarmVo(String message) {
        ObjectMapper mapper = new ObjectMapper();
        AlarmVo alarm = null;
        try {
            alarm = mapper.readValue(message, AlarmVo.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return alarm;
    }

    public void listenAndSend(String message) {
        AlarmVo alarm = createAlarmVo(message);
        String userId = alarm.getUserId();
        Map<String, SseEmitter> sseEmitters = emitterRepository.findAllEmitterStartWithById(userId);
        sseEmitters.forEach((key, emitter) -> {
            emitterRepository.saveEventCache(key, alarm);
            sendToClient(emitter, key, alarm);
        });
    }

    @KafkaListener(topics = "chat", groupId = "chat")
    public void listenChatAlarm(String message) {
        listenAndSend(message);
    }

    @KafkaListener(topics = "schedule", groupId = "schedule")
    public void listenScheduleAlarm(String message) {
        listenAndSend(message);
    }

    @KafkaListener(topics = "myRecruit", groupId = "myRecruit")
    public void listenMyRecruitAlarm(String message) {
        listenAndSend(message);
    }

    @KafkaListener(topics = "selection", groupId = "selection")
    public void listenSelectionAlarm(String message) {
        listenAndSend(message);
    }

}
