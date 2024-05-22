package com.doppel.controller;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {

    @PostMapping("/getTestString")
    public String getTestString(String input) {
        return input;
    }

    @PostMapping("/testException")
    public String testException(String input) {
        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 5);
        return String.valueOf(1/0);
    }


}
