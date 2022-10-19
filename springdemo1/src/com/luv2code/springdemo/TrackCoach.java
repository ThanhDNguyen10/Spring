package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	public TrackCoach () {}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: doMyStartupStuff");
	}
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: doMyCleanupStuff");
	}
}
