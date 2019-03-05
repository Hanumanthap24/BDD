package com.testDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\deeksha.sharma\\git\\BDD\\BDD\\src\\test\\java\\feature\\Login2.feature",
glue= {"com.testDefinition"},
format = {"pretty", "html:target/Destination"} ,
strict=true,
dryRun=true)
public class Test {
	
}
