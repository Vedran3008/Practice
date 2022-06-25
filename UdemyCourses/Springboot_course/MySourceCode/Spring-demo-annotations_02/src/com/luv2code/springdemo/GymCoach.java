package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "One more rep";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
