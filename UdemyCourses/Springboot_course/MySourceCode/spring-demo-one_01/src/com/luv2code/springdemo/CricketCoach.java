package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private String emailAdress;
    private String team;
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("INSIDE CRICKET COACH CONSTRUCTOR");
    }

    @Override
    public String getDailyWorkout() {
        return "Wtf is cricket?";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("INSIDE CRICKET COACH SETTER");
        this.fortuneService = fortuneService;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getTeam() {
        return team;
    }
}
