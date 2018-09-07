package com.cg.project.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		glue= {"com.cg.project.stepDefinition"}
		)
public class TestRunner {

}
