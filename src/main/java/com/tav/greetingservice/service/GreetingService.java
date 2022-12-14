package com.tav.greetingservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tav.greetingservice.config.GreetingConfig;
import com.tav.greetingservice.dto.GreetingWrapper;
import com.tav.greetingservice.dto.TimeOfDayWrapper;
import com.tav.greetingservice.feignclient.TimeOfDayClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {
    private final GreetingConfig config;
    private final TimeOfDayClient timeOfDayClient;

    @HystrixCommand(fallbackMethod = "defaultGreeting")
    public GreetingWrapper greetByName(final String name) {
        final String prefix = config.getGreetPrefix();
        final TimeOfDayWrapper timeOfDayWrapper = timeOfDayClient.getTimeOfDay();
        return new GreetingWrapper(
                String.format("%s %s and good %s!", prefix, name, timeOfDayWrapper.getTimeOfDay())
        );
    }

    private GreetingWrapper defaultGreeting(final String name) {
        return new GreetingWrapper(String.format("%s %s", config.getGreetPrefix(), name));
    }
}
