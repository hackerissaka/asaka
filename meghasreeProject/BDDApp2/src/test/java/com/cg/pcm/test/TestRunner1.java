package com.cg.pcm.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue= {"com.cg.pcm.stepDefinitions"},
		tags= {"@execute"})
public class TestRunner1 {

}
