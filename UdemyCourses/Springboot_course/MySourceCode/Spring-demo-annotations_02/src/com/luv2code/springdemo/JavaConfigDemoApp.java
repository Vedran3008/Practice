package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);

        //get the bean from spring containter
        Coach myCoach = context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
