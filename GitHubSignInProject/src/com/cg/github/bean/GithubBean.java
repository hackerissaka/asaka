package com.cg.github.bean;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GithubBean {
	
	@FindBy(how=How.XPATH,xpath="/html/body/div[1]/header/div/div[2]/div/span/div/a[2]")
	private WebElement signIn;

	@FindBy(how=How.XPATH,xpath="//*[@id=\"signup-form\"]/h2")
	private WebElement actualErrorMessageForSignIn;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"user_login\"]")
	private WebElement username;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"user_email\"]")
	private WebElement emailId;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"user_password\"]")
	private WebElement password;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"answers_98_choice_461\"]")
	private WebElement totalNewProgrammer;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"answers_99_choice_467\"]")
	private WebElement research;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"answers_99_choice_468\"]")
	private WebElement schoolProject;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"answers_99_choice_464\"]")
	private WebElement development;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"answers_100_choice_471\"]")
	private WebElement imaHobbist;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"question-input-101\"]")
	private WebElement WhatAreUInterestedIn; 
	@FindBy(how=How.XPATH,xpath="//*[@id=\"tag-popup-option-1\"]")
	private WebElement java;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"tag-popup-option-0\"]")
	private WebElement algorithm;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"signup_button\"]")
	private WebElement createAnAccount;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"js-pjax-container\"]/div[1]/div[2]/div[1]/div/form/div[3]/button")
	private WebElement continueButton;
	@FindBy(how=How.XPATH,xpath="//*[@id=\"js-pjax-container\"]/div/div[2]/div/form/input[3]")
	private WebElement submitButton;
	
	public String getUsername() {
		return username.getAttribute("value");
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public String getEmailId() {
		return emailId.getAttribute("value");
	}

	public void setEmailId(String emailId) {
		this.emailId.sendKeys(emailId);
	}

	public String getPassword() {
		return password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}


	public String getActualErrorMessageForSignIn() {
		return actualErrorMessageForSignIn.getText();
	}

	public void setActualErrorMessageForSignIn(WebElement actualErrorMessageForSignIn) {
		this.actualErrorMessageForSignIn = actualErrorMessageForSignIn;
	}

	public void SignInButton() {
		signIn.click();
	}
	
	public void totalNewProgrammerButton() {
		totalNewProgrammer.click();
	}
	
	public void researchButton() {
		research.click();
	}
	
	public void schoolProjectButton() {
		schoolProject.click();
	}
	public void developmentButton() {
		development.click();
	}
	public void imaHobbyistButton() {
		imaHobbist.click();
	}
	
	public void algorithmButton() {
		algorithm.click();
	}
	
	public void createAnAccount() {
		createAnAccount.click();
	}
	
	public void continueButton() {
		continueButton.click();
		
	}
	public void submitButton() {
		submitButton.click();
	}
}
