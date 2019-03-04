package com.testDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		System.out.println("i m here");
	
	}

	@When("^Titleis CRM$")
	public void titleis_CRM() throws Throwable {
		System.out.println("i m here");
	}

	@Then("^User enters username$")
	public void user_enters_username() throws Throwable {
		System.out.println("i m here");
	}

	@Then("^enters the pasword$")
	public void usepassword() throws Throwable {
		System.out.println("i m here");
	}


}
