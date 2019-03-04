package com.test.testcases;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\HP\\gitSelenium\\BDD\\src\\test\\java\\feature\\Login2.feature",
glue= {"com.testDefinition"},
format = {"pretty", "html:target/Destination"} ,
strict=true,
dryRun=true)
public class RunCukesTest {
	
	
	
}




