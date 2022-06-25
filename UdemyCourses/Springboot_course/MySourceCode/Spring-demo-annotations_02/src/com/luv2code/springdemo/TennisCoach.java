package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService=theFortuneService;
    }

    */

    public TennisCoach() {
        System.out.println(">>TenisCoach: Inside default constructor");
    }


    /*
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside autowired setter");
        this.fortuneService = fortuneService;
    }
    */
    @Override
    public String getDailyWorkout() {
        return "Practice your serve";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    /*
    @Autowired
    public void doSomeStuff(FortuneService theFortuneService){
        System.out.println("Doing some autowired method stuff");
        System.out.println(theFortuneService.getFortune());

    }
    */

    /*@PostConstruct
    public void doStartup(){
        System.out.println("Hi");
    }
    @PreDestroy
    public void beforeDestroying(){
        System.out.println("See you tomorrow");
    }*/
}
