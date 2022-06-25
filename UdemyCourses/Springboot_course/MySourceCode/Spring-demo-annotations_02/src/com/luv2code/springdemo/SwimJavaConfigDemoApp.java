package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);

        //get the bean from spring containter
        SwimCoach myCoach = context.getBean("swimCoach", SwimCoach.class);

        //call a method on the bean
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        System.out.println("Team:" + myCoach.getTeam() + "  Email:" + myCoach.getEmail());
        //close the context
        context.close();
    }
}
