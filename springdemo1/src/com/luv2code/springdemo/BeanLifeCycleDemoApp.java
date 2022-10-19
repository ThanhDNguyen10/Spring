package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		//retrieve from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		//if scope declared as prototype then only doMyStartupStuff printed out
		System.out.println(theCoach.getDailyWorkout());
		
		//close context	
		context.close();
	}

}
