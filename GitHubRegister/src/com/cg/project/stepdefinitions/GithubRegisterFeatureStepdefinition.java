package com.cg.project.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubRegisterFeatureStepdefinition {
	private WebDriver driver;
@Given("^user is on github home page and user select 'sign up' option$")
public void user_is_on_github_home_page_and_user_select_sign_up_option() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://github.com/");
	 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[2]")).click();
}

@When("^user select 'sign up' option$")
public void user_select_sign_up_option() throws Throwable {
	 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[2]")).click();
}

@Then("^user need to be taken to github 'sign up' page$")
public void user_need_to_be_taken_to_github_sign_up_page() throws Throwable {
   String actualElement= driver.getTitle();
   String expectedElement="Join GitHub · GitHub";
   Assert.assertEquals(expectedElement, actualElement);
}

@When("^user enter valid details and select 'create an account'$")
public void user_enter_valid_details_and_select_create_an_account() throws Throwable {
	 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/span/div/a[2]")).click();
	 WebElement username= driver.findElement(By.id("user_login"));
	 WebElement emailId= driver.findElement(By.id("user_email"));
	 WebElement password= driver.findElement(By.id("user_password"));
	 username.sendKeys("abcgdhjkfdsfwsdkgk");
	 emailId.sendKeys("dgtfsddwnnzxdsfsfd455g@gmail.com");
	 password.sendKeys("jdnhnvfgb7u7u7o");
	 password.submit();
	// driver.findElement(By.id("setup_organization")).click();
	 
	 WebElement clickMe= driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div/form/div[3]/button"));
	clickMe.submit();
	driver.findElement(By.id("answers_98_choice_475")).click();
	driver.findElement(By.id("answers_99_choice_466")).click();
	driver.findElement(By.id("answers_99_choice_464")).click();
	driver.findElement(By.id("answers_99_choice_467")).click();
	driver.findElement(By.id("answers_100_choice_470")).click();
	WebElement interested= driver.findElement(By.id("question-input-101"));
	interested.sendKeys("java");
	WebElement clickMe1= driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div/form/input[3]"));
	clickMe1.submit();
}

@Then("^user created account successfully$")
public void user_created_account_successfully() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/summary/span")).click();
	driver.findElement(By.xpath("//*[@id=\"user-links\"]/li[3]/details/details-menu/ul/li[1]/a/strong")).click();
 String actualElement= driver.getTitle();
	String expectedElement="abcgdhjkfdsfwsdkgk";
  Assert.assertEquals(expectedElement, actualElement);
}
}
