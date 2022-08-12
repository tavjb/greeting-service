package com.tav.greetingservice.feignclient;

import com.tav.greetingservice.dto.TimeOfDayWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("time-of-day-service")
public interface TimeOfDayClient {
    @GetMapping("/time-of-day")
    TimeOfDayWrapper getTimeOfDay();
}
