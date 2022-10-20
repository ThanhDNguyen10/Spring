package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//read spring configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				//get bean from spring container
				//tennisCoach is the name of the class but first letter is lowercase
				Coach theCoach = context.getBean("tennisCoach", Coach.class);
				Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

				//check if theyre the same
				boolean result = (theCoach == alphaCoach);
				System.out.println(result);
				System.out.println("Memory location for theCoach "+theCoach);
				System.out.println("Memory location for alphaCoach "+theCoach);

				//close the context
				context.close();
	}

}
