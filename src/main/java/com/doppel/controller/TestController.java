package com.doppel.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/getTestString")
    public String getTestString(String input) {
        return input;
    }

    @PostMapping("/testException")
    public String testException(String input) {
        return String.valueOf(1/0);
    }


}
