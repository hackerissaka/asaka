package com.cg.github.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		glue= {"com.cg.github.stepDefinition"},
		tags= {"@execute"}
		)
public class TestRunner {

}
