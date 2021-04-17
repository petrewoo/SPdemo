package com.pomatory.demo.controller;

import com.pomatory.demo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello %s!";
    private static final String template1 = "Bye %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name, boolean flag) {
        if (flag == true) {
            return new Greeting(counter.incrementAndGet(), String.format(template, name));
        } else {
            return new Greeting(counter.incrementAndGet(), String.format(template1, name));
        }
    }
}
