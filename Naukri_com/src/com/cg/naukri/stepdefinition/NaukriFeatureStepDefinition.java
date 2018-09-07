package com.cg.naukri.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NaukriFeatureStepDefinition {
	private WebDriver driver;
	@Given("^User is on 'naukri home page' and select 'register with us'$")
	public void user_is_on_naukri_home_page_and_select_register_with_us() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id=\"p0widget\"]/div/div[1]/div/input")).click();
		
	}

	@When("^User provide valid details and click 'continue'$")
	public void user_provide_valid_details_and_click_continue() throws Throwable {
	   driver.findElement(By.xpath("//*[@id=\"flowBifurcation\"]/div[2]/form/div[1]/div/div")).click();
	   WebElement username= driver.findElement(By.id("fname"));
	   
	    WebElement emailId= driver.findElement(By.id("email"));
		 WebElement password= driver.findElement(By.name("password"));
		 WebElement mobile= driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[4]/div[1]/div/input[2]"));
		 
		 username.sendKeys("dogggy");
			Thread.sleep(2000);
			 emailId.sendKeys("dakasuki@gmail.com");
			 Thread.sleep(2000);
			 password.sendKeys("AlapuchiDakasuki11$");
			 Thread.sleep(2000);
			 mobile.sendKeys("9291212345");
			 Thread.sleep(2000);
		 
			 WebElement source= driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input"));
			 
			   source.sendKeys("Chandigarh");
			   source.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 WebElement clickMe= driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[5]/div/div/div[2]/button"));
			clickMe.submit();
	}

	@Then("^User account has been created$")
	public void user_account_has_been_created() throws Throwable {
	    
	}
}
