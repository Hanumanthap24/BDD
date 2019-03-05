package com.test.runner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
//@CucumberOptions(features ="C:\\Users\\deeksha.sharma\\git\\BDD\\BDD\\src\\test\\java\\feature\\Login2.feature",
@CucumberOptions(features ="C:\\Users\\deeksha.sharma\\git\\BDD\\BDD\\src\\test\\java\\feature",
glue= {"com.testDefinition"},
format = {"pretty", "html:target/Destination"} ,
strict=true,
dryRun=true)
public class RunCukesTest {
	 
	private TestNGCucumberRunner testNGCucumberRunner;
	
	TestNGCucumberRunner testCucumberRunner;
	@BeforeClass
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		testNGCucumberRunner.finish();
	}
	
}




