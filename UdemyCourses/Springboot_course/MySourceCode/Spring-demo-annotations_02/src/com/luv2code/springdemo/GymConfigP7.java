package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class GymConfigP7 {

    @Bean
    public FortuneService gymFortune(){
        return new GymFortune();
    }

    @Bean
    public Coach gymCoachP7(){
        return new GymCoachP7(gymFortune());
    }
}
