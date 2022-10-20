package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String emai;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;  
	}
	
	@Override
	public String getDailyWorkout() {
		return "Warm up swim";
	}

	@Override
	public String getDailyFortune() { 
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return emai;
	}

	public String getTeam() {
		return team;
	}
	
	
}
