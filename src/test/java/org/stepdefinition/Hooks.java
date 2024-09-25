package org.stepdefinition;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before(order=1)
	private void before3() {
		System.out.println("countdown 3");
	}
	
	@Before(order=1)
	private void before2() {
		System.out.println("countdown 2");
	}
	
	@Before(order=1)
	private void before1() {
		System.out.println("countdown 1");
	}
	
	


}
