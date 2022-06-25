package com.luv2code.springdemo;

import java.util.Random;

public class MyFortuneService implements FortuneService{

    private String[] data = {
            "Beware of your enemy",
            "Today is going to be a good day",
            "No u"
    };
    private Random myRandom= new Random();
    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        //return random fortune
        return data[index];
    }
}
