package com.tav.dockerizedspringexample.controller;

import com.tav.dockerizedspringexample.configclient.GreetingConfig;
import com.tav.dockerizedspringexample.dto.GreetingWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("greeting")
@RestController
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingConfig config;

    @GetMapping("{name}")
    public GreetingWrapper greetByName(@PathVariable final String name) {
        return new GreetingWrapper(config.getGreetPrefix() + " " + name);
    }
}