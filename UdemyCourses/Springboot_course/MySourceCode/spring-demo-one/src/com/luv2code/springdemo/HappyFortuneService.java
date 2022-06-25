package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is going to be a great day!";
    }
}
