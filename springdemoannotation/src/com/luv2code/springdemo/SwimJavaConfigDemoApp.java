package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext; 

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring configuration java c;ass
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//get bean from spring container
		//tennisCoach is the name of the class but first letter is lowercase
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		//call swim coach methods
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();
	}

}
                