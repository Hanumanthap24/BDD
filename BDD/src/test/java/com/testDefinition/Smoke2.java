package com.testDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoke2 {
	
	WebDriver driver;

	@Given("^User is in login page$")
	public void user_is_in_login_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "G:\\Software\\selenium\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("^user enters Wrong user \"(.*)\"$")
	public void user_enters_Wrong_user_name(String username) throws Throwable {
	    
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys(username);
		
	}

	@When("^user enters Wrong \"(.*)\"$")
	public void user_enters_Wrong_password(String password) throws Throwable {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	
	}

	@Then("^login failed mesage diasplayed$")
	public void login_failed_mesage_diasplayed() throws Throwable {
		driver.findElement(By.xpath("//*[@id='password']")).submit();
	System.out.println("wrog message iapled");	
	driver.quit();
	}


	
	
	
}
