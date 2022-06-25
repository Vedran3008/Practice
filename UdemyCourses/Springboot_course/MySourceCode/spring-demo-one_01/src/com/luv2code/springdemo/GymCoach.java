package com.luv2code.springdemo;

public class GymCoach implements Coach{


    private FortuneService fortuneService;

    public GymCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "One more rep";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
