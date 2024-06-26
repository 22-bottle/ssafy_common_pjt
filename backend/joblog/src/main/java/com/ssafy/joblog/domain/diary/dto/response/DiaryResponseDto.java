package com.ssafy.joblog.domain.diary.dto.response;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiaryResponseDto {
    private int diaryId;
    private int userId;
    private String content;
    @JsonFormat(pattern = "MM월 dd일")
    private LocalDateTime createdDate;
}