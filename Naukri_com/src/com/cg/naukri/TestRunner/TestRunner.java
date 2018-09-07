package com.cg.naukri.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		glue= {"com.cg.naukri.stepDefinition"},
		tags= {"@execute"}
		)
public class TestRunner {

}
