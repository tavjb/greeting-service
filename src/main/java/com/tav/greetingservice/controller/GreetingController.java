package com.tav.greetingservice.controller;

import com.tav.greetingservice.config.GreetingConfig;
import com.tav.greetingservice.dto.GreetingWrapper;
import com.tav.greetingservice.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("greeting")
@RestController
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingService service;

    @GetMapping("{name}")
    public GreetingWrapper greetByName(@PathVariable final String name) {
        return service.greetByName(name);
    }
}