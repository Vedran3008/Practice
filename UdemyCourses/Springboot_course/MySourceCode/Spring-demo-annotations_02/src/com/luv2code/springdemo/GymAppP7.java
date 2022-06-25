package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GymAppP7 {

    public static void main(String[] args) {

        //read spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GymConfigP7.class);

        //get the bean from spring containter
        Coach myCoach = context.getBean("gymCoachP7", GymCoachP7.class);

        //call a method on the bean
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
