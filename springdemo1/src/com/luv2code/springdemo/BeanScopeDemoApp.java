package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		//retrieve from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		//will be false of the scope is prototype; true if no scope declared
		boolean result = (theCoach == alphaCoach);
		
		//call methods on the bean
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		
		//close context	
		context.close();
	}

}
