package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//explicit bean id @Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	//field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//Config dependence injection with Autowired
	//Autowired is not needed if there is only 1 constructor
/*	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
*/
	public TennisCoach() {
		System.out.println("Constructor");
	}
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("doMyStartupStuff");
	}
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("doMyCleanupStuff");
	}
	
	
	
	//setter method
	//setter instead of constructor
/*	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("setter fortuneservice");
		fortuneService = theFortuneService;
	}
*/	
	@Override
	public String getDailyWorkout() {
		return "Practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
