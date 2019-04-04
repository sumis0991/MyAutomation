package com.tt.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"features"},
		glue = {"com.tt.steps"}
		
		
	)
public class TestngTestRunner extends AbstractTestNGCucumberTests{
	

}
