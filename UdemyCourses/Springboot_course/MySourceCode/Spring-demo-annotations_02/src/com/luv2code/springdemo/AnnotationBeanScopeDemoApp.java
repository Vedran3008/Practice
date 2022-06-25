package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.converter.json.GsonBuilderUtils;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring
        Coach myCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (myCoach == alphaCoach);
        //call methods

        System.out.println("Coaches are the same object:" + result);
        //close config
        context.close();
    }
}
