package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

public class GymCoachP7 implements Coach{

    private FortuneService fortuneService;

    public GymCoachP7(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Yeeeah Buddy";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
