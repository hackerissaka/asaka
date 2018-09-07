package com.cg.redBus.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		glue= {"com.cg.redBus.stepdefinition"},
		tags= {"@execute"}
		)
public class TestRunner {

}
