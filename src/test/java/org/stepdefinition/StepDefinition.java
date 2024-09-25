package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	
	@Given("User have to launch the Facebook application through chrome browser")
	public void user_have_to_launch_the_Facebook_application_through_chrome_browser() {
		launchBrowser();
		loadUrl("https://www.facebook.com/");

	}



	@When("User have to enter the invalid username and valid  password")
	public void user_have_to_enter_the_invalid_username_and_valid_password() {



		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Smart");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("12345678");

	}
	
	@When("User have to enter the invalid <{string}> and invalid  <{string}>")
	public void user_have_to_enter_the_invalid_and_invalid(String string, String string2) {
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(string);

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(string2);
	
	}


	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() {
		WebElement submit = driver.findElement(By.name("login"));
		submit.click();
	}

	@Then("User have to reach the invalid credential page")
	public void user_have_to_reach_the_invalid_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("privacy_mutation_token")) {
			
			System.out.println("User reach the invalid credential page");
			
		} else {
			System.out.println("User not reach the invalid credential page");
		}
		toClose();
	}



}
