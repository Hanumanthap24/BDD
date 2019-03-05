package com.test.testcases;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features ="C:\\Users\\deeksha.sharma\\git\\BDD\\BDD\\src\\test\\java\\feature\\Login2.feature",
@CucumberOptions(features ="C:\\Users\\deeksha.sharma\\git\\BDD\\BDD\\src\\test\\java\\feature\\login.feature",
glue= {"com.testDefinition"},
format = {"pretty", "html:target/Destination"} ,
strict=true,
dryRun=false)
public class RunCukesTest {
	
	
	
}




