package com.cg.github.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.bean.GithubBean;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubStepDefinition {
	
	private WebDriver driver;
	private GithubBean githubBean;
	@Before(order=1)
	public void setUpEnv1() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	}
	
	@Given("^User is on 'Github\\.com' website$")
	public void user_is_on_Github_com_website() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://github.com/");
		githubBean= new GithubBean();
		PageFactory.initElements(driver, githubBean);
		
	}

	@When("^user selects 'Sign In'$")
	public void user_selects_Sign_In() throws Throwable {
		githubBean.SignInButton();
		
	}

	@Then("^Github Registration should display$")
	public void github_Registration_should_display() throws Throwable {
		
	   Assert.assertEquals("Create your personal account", githubBean.getActualErrorMessageForSignIn());
	}

	@When("^user provides all required details And Enter submit$")
	public void user_provides_all_required_details_And_Enter_submit() throws Throwable {
	   githubBean.setUsername("dfsafagsretbgjkj");
	   githubBean.setEmailId("adfdfrhfgadjh@gmail.com");
	   githubBean.setPassword("aaicgfgrr54127890");
	   githubBean.createAnAccount();
	   githubBean.continueButton();
	   githubBean.totalNewProgrammerButton();
	   Thread.sleep(2000);
	   githubBean.researchButton();
	   Thread.sleep(2000);
	   githubBean.schoolProjectButton();
	   Thread.sleep(2000);
	   githubBean.developmentButton();
	   Thread.sleep(2000);
	   githubBean.imaHobbyistButton();
	   Thread.sleep(2000);
	   githubBean.setWhatAreUInterestedIn("java");
	   Thread.sleep(2000);
	   
	   
	  
	}

	@Then("^User account is created\\.$")
	public void user_account_is_created() throws Throwable {
		 githubBean.submitButton();
	}
}
