package com.example.spring_boot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

// @RestController combines @Controller and @ResponseBody in 1 step
@RestController
public class HelloWorldController {

    static class ReturnObjectBean implements Serializable {
        private final String message;

        public ReturnObjectBean() {
            this.message = "Hello, World!";
        }

        public String getMessage() {
            return message;
        }
    }

    @RequestMapping("/hello/world")
    private ReturnObjectBean getGreeting() {
        return new ReturnObjectBean();
    }
}

