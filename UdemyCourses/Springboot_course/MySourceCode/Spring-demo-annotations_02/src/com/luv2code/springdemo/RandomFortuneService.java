package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    public String[] data = new String[]{
            "Good fortune",
            "Bad fortune",
            "Same old fortune"};

    Random randomG = new Random();
    @Override
    public String getFortune() {
        //return random string from data
        return data[randomG.nextInt(data.length)];
    }
}
