package com.example.cat_service.user.controller;


import com.example.cat_service.user.dto.JoinDTO;
import com.example.cat_service.user.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class JoinController {

    private final JoinService joinService;

    @PostMapping("join")
    public String joinProcess(@RequestBody JoinDTO joinDto){
        joinService.joinProcess(joinDto);
        return "hello";
    }
}
