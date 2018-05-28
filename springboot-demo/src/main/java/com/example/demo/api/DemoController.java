package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello")
public class DemoController {

    @GetMapping
    public String hello() {
        return "static/hello";
    }
}
