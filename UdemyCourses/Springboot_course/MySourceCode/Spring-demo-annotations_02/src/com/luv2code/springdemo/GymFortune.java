package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class GymFortune implements FortuneService{

    @Value("${foo.fortune}")
    private String fortune;
    @Override
    public String getFortune() {
        return fortune;
    }
}
