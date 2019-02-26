package com.test.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver  CreateBrowserInstance() {
		WebDriver driver=null;
		ResourceBundle config=ResourceBundle.getBundle("config");
		if(config.getString("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("wedriver.chrome.driver", "./Driver/chromedriver.exe");
			 driver=new ChromeDriver();			
		}
		
		driver.get(config.getString("Url"));	
		return driver;				
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

	
	
}
