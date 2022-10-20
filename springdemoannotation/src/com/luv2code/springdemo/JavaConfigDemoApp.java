package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext; 

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring configuration java c;ass
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//get bean from spring container
		//tennisCoach is the name of the class but first letter is lowercase
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
                