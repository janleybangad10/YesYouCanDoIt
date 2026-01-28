package com.example.just_try.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustTryController {

    @GetMapping("/PBB_Team")
    public String hello() {
        return "Hello mga 20's ng 25th floor";
    }
}
