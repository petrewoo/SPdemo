package com.pomatory.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeWorldController {
    @GetMapping
    public String bye(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Bye %s!", name);
    }
}
