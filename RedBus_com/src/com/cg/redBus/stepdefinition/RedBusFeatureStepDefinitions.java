package com.cg.redBus.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusFeatureStepDefinitions {
	private WebDriver driver;
	@Given("^User is on 'RedBus Home Page'$")
	public void user_is_on_RedBus_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.redbus.in/");
	}

	@When("^User provides \"([^\"]*)\" and \"([^\"]*)\" as source and destination points$")
	public void user_provides_and_as_source_and_destination_points(String arg1, String arg2) throws Throwable {
	   WebElement source= driver.findElement(By.id("src"));
	   source.sendKeys(arg1);
	   source.sendKeys(Keys.ENTER);
	   WebElement destination = driver.findElement(By.id("dest"));
	   destination.sendKeys(arg2);
	   destination.sendKeys(Keys.ENTER);
	   
	   driver.findElement(ByXPath.xpath("//*[@id=\"search\"]/div/div[3]/div")).click();
		driver.findElement(ByXPath.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[5]")).click();
		
	 
	}

	@When("^select journey date$")
	public void select_journey_date() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
	}

	@Then("^Book ticket for the corresponding details$")
	public void book_ticket_for_the_corresponding_details() throws Throwable {
	   
	}

	@Then("^'Enter person details'$")
	public void enter_person_details() throws Throwable {
	   
	}
}
