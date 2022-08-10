package com.tav.greetingservice.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GreetingWrapper {
    @Getter
    private final String greeting;
}
