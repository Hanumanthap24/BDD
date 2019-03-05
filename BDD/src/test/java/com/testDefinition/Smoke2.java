package com.testDefinition;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoke2 {
	
	WebDriver driver;

	@Given("^User is in login page$")
	public void user_is_in_login_page() throws Throwable {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deeksha.sharma\\git\\AutomationPOM\\Automation_POM\\Library\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	//	System.setProperty("webdriver.gecko.driver", "G:\\Software\\selenium\\geckodriver.exe");
	//	 driver=new FirefoxDriver();
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
	}

	@When("^user enters Wrong user name and password$")
	public void user_enters_Wrong_user_name(DataTable data) throws Throwable {
		for(Map<String, String> testData: data.asMaps(String.class, String.class)) {
//			driver.findElement(By.xpath("//*[@id='login1']")).sendKeys(testData.get("name"));
//			driver.findElement(By.xpath("//*[@id='password']")).sendKeys(testData.get("password"));
			System.out.println(testData.get("name"));
			System.out.println(testData.get("password"));
			
		}	    
		
	}


	@Then("^login failed mesage diasplayed$")
	public void login_failed_mesage_diasplayed(DataTable data) throws Throwable {
		for(Map<String, String> testData: data.asMaps(String.class, String.class)) {
			System.out.println(testData.get("mesage"));
			System.out.println(testData.get("diasplayed"));
			
		}	  

		
	driver.quit();
	}


	
	
	
}
