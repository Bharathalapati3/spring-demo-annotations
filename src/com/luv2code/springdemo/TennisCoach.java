package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	//define a default constructor
	
	public TennisCoach() {
		System.out.println("Inside Tennis Coach Default Contructor");
	}
	
	//define a setter method
	
	/* (non-Javadoc)
	 * @see com.luv2code.springdemo.Coach#getDailyWorkout()
	 */
	
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("Inside Tennis Coach setter method");
		fortuneService = theFortuneService;
	}*/
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		
	this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		 
		return "Practice your Backend volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
