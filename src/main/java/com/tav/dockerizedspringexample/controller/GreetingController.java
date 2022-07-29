package com.tav.dockerizedspringexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("greet")
@RestController
public class GreetingController {
    @GetMapping("{name}")
    public GreetingWrapper greet(@PathVariable final String name) {
        return new GreetingWrapper(name);
    }
}

class GreetingWrapper {
    private final String greeting;

    public GreetingWrapper(final String name) {
        this.greeting = "hello " + name;
    }

    public String getGreeting() {
        return greeting;
    }
}