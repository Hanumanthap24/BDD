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

	@Then("^User enters \"(.*)\"$")
	public void user_enters_username(String username) throws Throwable {
		System.out.println(username+ "username");
	}

	@Then("^enters the \"(.*)\"$")
	public void usepassword(String pass) throws Throwable {
		System.out.println(pass+"Password");
	}


}
