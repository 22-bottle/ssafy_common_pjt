package com.ssafy.joblog.domain.user.controller;

import com.ssafy.joblog.domain.user.dto.request.UserUpdateRequestDto;
import com.ssafy.joblog.domain.user.dto.response.UserResponseDto;
import com.ssafy.joblog.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponseDto> findUser(@PathVariable(value = "userId") int userId) {
        return ResponseEntity.ok(userService.findUser(userId));
    }

    @PatchMapping("/update")
    public ResponseEntity<Void> update(@RequestBody UserUpdateRequestDto userUpdateRequestDto) {
        userService.update(userUpdateRequestDto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<Void> delete(@PathVariable(value = "userId") int userId) {
        userService.delete(userId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}