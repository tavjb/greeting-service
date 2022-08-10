package com.tav.dockerizedspringexample.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GreetingWrapper {
    @Getter
    private final String greeting;
}
