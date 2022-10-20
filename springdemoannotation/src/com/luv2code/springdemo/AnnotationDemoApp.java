package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
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
