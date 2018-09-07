package com.cg.RegistrationForm.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.RegistrationForm.bean.EducationalDetailsPage;
import com.cg.RegistrationForm.bean.PersonalDetailsPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationFormStepDefinition {
	
	/**
	 * Class Name : RegistrationFormStepDefinition;
	 * Method: Test Case written for EducationalDetailsPage.java and PersonalDetailsPage.java
	 * Purpose: Automation Testing of each webelement present in PersonalDetails.html and EducationalDetails.html
	 * 
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification : 24-august-2018;
	 */
	private WebDriver driver;
	private PersonalDetailsPage personal;
	private EducationalDetailsPage educational;
	/**
	 * Feature: Hook for cucumber
	 * Method: setUpStepEnv()
	 * Annotation: @Before
	 * purpose: To execute before every scenario
	 * 
	 */
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe" );
	}
	/**
	 * Feature: for Given Statement
	 * Name of Method: user_is_on_personal_details_registration_page()
	 * 
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018
	 * 
	 * Last Date Of Modification : 24-august-2018
	 * 
	 * purpose: To open chrome driver for performing automation
	 */
	
	@Given("^user is on personal details registration page$")
	public void user_is_on_personal_details_registration_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("C:\\BDD workspace(use this)part-2\\TestAutomation\\src\\WebPages_Set 3\\WebPages_Set 3\\PersonalDetails.html");
		personal = PageFactory.initElements(driver, PersonalDetailsPage.class);
		educational = PageFactory.initElements(driver, EducationalDetailsPage.class);
	      
	}
	/**
	 * Feature: for Then 
	 * Name of Method: personal_details_registration_page_should_load_with_title_Personal_Details()
	 * 
	 * Return Type: Assert Statement
	 * 
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check expected title matches actual title
	 */
	@Then("^personal details registration page should load with title 'Personal Details'$")
	public void personal_details_registration_page_should_load_with_title_Personal_Details() throws Throwable {
		String expectedTitle="Personal Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	      
	}

	@Then("^'Step (\\d+): Personal Details' text should display$")
	public void step_Personal_Details_text_should_display(int arg1) throws Throwable {
		String expectedTitle="Step 1: Personal Details";
		Assert.assertEquals(expectedTitle, personal.getActualText());
	      
	}
	
	/**
	 * Feature: When user click on next without entering first Name 
	 * Name of Method: user_will_click_on_next_without_entering_First_Name()
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check without entering first name whether we can go to next page or not
	 */
	@When("^user will click on next without entering First Name$")
	public void user_will_click_on_next_without_entering_First_Name() throws Throwable {
	     
		personal.setFirstName("");
		personal.clickNext();
	      
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}
	/**
	 * Feature: When user click on next without entering last Name 
	 * Name of Method: user_will_click_on_next_without_entering_Last_Name()
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check without entering Last name whether we can go to next page or not
	 */
	@When("^user will click on next without entering Last Name$")
	public void user_will_click_on_next_without_entering_Last_Name() throws Throwable {
		personal.setFirstName("Rohan");
		personal.clickNext();
	      
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}
	/**
	 * Feature: When user click on next without entering email 
	 * Name of Method: user_will_click_on_next_without_entering_Email()
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check without entering email whether we can go to next page or not
	 */
	@When("^user will click on next without entering Email$")
	public void user_will_click_on_next_without_entering_Email() throws Throwable {
	     personal.setLastName("Singh");
	     personal.clickNext();
	      
	}

	@Then("^'Please fill the Email' message should display$")
	public void please_fill_the_Email_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}
	/**
	 * Feature: When user click on next without entering contactNo 
	 * Name of Method: user_will_click_on_next_without_entering_Contact_no()
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check without entering contactNo whether we can go to next page or not
	 */
	@When("^user will click on next without entering Contact no\\.$")
	public void user_will_click_on_next_without_entering_Contact_no() throws Throwable {
		personal.setEmail("rohansingh@gmail.com");
		personal.clickNext();
	      
	}

	@Then("^'Please fill the Contact No\\.' message should display$")
	public void please_fill_the_Contact_No_message_should_display() throws Throwable {
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}
	/**
	 * Feature: When user click on next without entering valid contactNo 
	 * Name of Method: user_will_click_on_next_withot_entering_valid_Contact_no()
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check without entering valid contactNo whether we can go to next page or not
	 */
	@When("^user will click on next withot entering valid Contact no\\.$")
	public void user_will_click_on_next_withot_entering_valid_Contact_no() throws Throwable {
		personal.setContactNo("9000");
		personal.clickNext();
	      
	}

	@Then("^'Please enter valid Contact no\\.' message should display$")
	public void please_enter_valid_Contact_no_message_should_display() throws Throwable {
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}
	/**
	 * Feature: When user click on next without entering valid contactNo 
	 * Name of Method: user_will_click_on_next_without_entering_Address_line(int arg1)
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check without entering Address Line 1 whether we can go to next page or not
	 */

	@When("^user will click on next without entering Address line (\\d+)$")
	public void user_will_click_on_next_without_entering_Address_line(int arg1) throws Throwable {
		personal.setContactNo("417627");
		personal.clickNext();
	      
	}

	@Then("^'Please fill the address line (\\d+)' message should display$")
	public void please_fill_the_address_line_message_should_display(int arg1) throws Throwable {
		String expectedMessage="Please fill the address line 1";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}
	/**
	 * Feature: When user click on next without entering address line 2
	 * Name of Method: user_will_click_on_next_without_entering_Address_line(int arg1)
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check without entering Address Line 2 whether we can go to next page or not
	 */
	@When("^user will click on next without entering in Address line (\\d+)$")
	public void user_will_click_on_next_without_entering_in_Address_line(int arg1) throws Throwable {
		 personal.setAddressLine1("kurwaha");
	     personal.clickNext();
	}

	@Then("^'Please fill the address line (\\d+)' message should be display$")
	public void please_fill_the_address_line_message_should_be_display(int arg1) throws Throwable {
		String expectedMessage="Please fill the address line 2";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}

	/**
	 * Feature: When user click on next without entering city
	 * Name of Method: user_will_click_on_next_without_selecting_City()
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check without entering city whether we can go to next page or not
	 */
	@When("^user will click on next without selecting City$")
	public void user_will_click_on_next_without_selecting_City() throws Throwable {
		personal.setAddressLine2("Maha Market");
	     personal.clickNext();
	      
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	      
	}
	/**
	 * Feature: When user click on next without entering state
	 * Name of Method: user_will_click_on_next_without_selecting_State()
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check without entering state whether we can go to next page or not
	 */
	@When("^user will click on next without selecting State$")
	public void user_will_click_on_next_without_selecting_State() throws Throwable {
		personal.setCity("Pune");
		   personal.clickNext();
	      
	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() throws Throwable {
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}

	/**
	 * Feature: When user click on next by entering all valid details
	 * Name of Method: user_will_click_on_next_by_entering_all_valid_details()
	 *
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification :24-august-2018;
	 * 
	 * purpose: To check alert text box text matches to expected String and whether we can go to next page or not
	 */
	@When("^user will click on next by entering all valid details$")
	public void user_will_click_on_next_by_entering_all_valid_details() throws Throwable {
		 personal.setState("Maharashtra");
		   personal.clickNext();
	      
	}

	@Then("^'Personal details are validated and accepted successfully\\.' message should display$")
	public void personal_details_are_validated_and_accepted_successfully_message_should_display() throws Throwable {
		String expectedMessage="Personal details are validated and accepted successfully.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
	      
	}

	@Then("^navigates to the Educational details page$")
	public void navigates_to_the_Educational_details_page() throws Throwable {
		driver.switchTo().alert().dismiss();
	      
	}

	@When("^user is on Education details page$")
	public void user_is_on_Education_details_page() throws Throwable {
	     
	      
	}

	@Then("^personal details registration page should load with  with title 'Educational Details'$")
	public void personal_details_registration_page_should_load_with_with_title_Educational_Details() throws Throwable {
		String expectedTitle="Educational Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	      
	}

	@Then("^'Step (\\d+): Educational Details' text should display$")
	public void step_Educational_Details_text_should_display(int arg1) throws Throwable {
	     String expected = "Step 2: Educational Details";
	     Assert.assertEquals(expected, educational.getActualTextEdu());
	      
	}

	@When("^user clicks on Register Me without selecting Graduation$")
	public void user_clicks_on_Register_Me_without_selecting_Graduation() throws Throwable {
	     
		educational.clickRegisterMe();
	      
	}

	@Then("^'Please select Graduation' message should display$")
	public void please_select_Graduation_message_should_display() throws Throwable {
		String expectedMessage="Please Select Graduation";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}

	@When("^user clicks on Register Me without entering Percentage$")
	public void user_clicks_on_Register_Me_without_entering_Percentage() throws Throwable {
		educational.setGraduation("BE");
		   educational.clickRegisterMe();
	      
	}

	@Then("^'Please fill Percentage details' message should display$")
	public void please_fill_Percentage_details_message_should_display() throws Throwable {
		String expectedMessage="Please fill Percentage detail";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}

	@When("^user clicks on Register Me without entering Passing Year$")
	public void user_clicks_on_Register_Me_without_entering_Passing_Year() throws Throwable {
	     educational.setPercentage("68");
	     educational.clickRegisterMe();
	      
	}

	@Then("^'Please fill Passing Year' message should display$")
	public void please_fill_Passing_Year_message_should_display() throws Throwable {
		String expectedMessage="Please fill Passing Year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}

	@When("^user clicks on Register Me without entering Project Name$")
	public void user_clicks_on_Register_Me_without_entering_Project_Name() throws Throwable {
	     educational.setPassingYear("2018");
	     educational.clickRegisterMe();
	      
	}

	@Then("^'Please fill Project Name' message should display$")
	public void please_fill_Project_Name_message_should_display() throws Throwable {
		String expectedMessage="Please fill Project Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}

	@When("^user will click on Register Me without selecting Technologies used$")
	public void user_will_click_on_Register_Me_without_selecting_Technologies_used() throws Throwable {
	     educational.setProjectName("Online shopping Site");
	     educational.clickRegisterMe();
	      
	}

	@Then("^'Please Select Technologies Used' message should display$")
	public void please_Select_Technologies_Used_message_should_display() throws Throwable {
		String expectedMessage="Please Select Technologies Used";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      
	}

	@When("^user will click on Register Me without entering otherTechnologies in case of 'other' option selected$")
	public void user_will_click_on_Register_Me_without_entering_otherTechnologies_in_case_of_other_option_selected() throws Throwable {
		educational.setTechnologiesUsed("Java");
		educational.setTechnologiesUsed("Other");
	      educational.clickRegisterMe();
	}

	@Then("^'Please fill other Technologies Used' message should display$")
	public void please_fill_other_Technologies_Used_message_should_display() throws Throwable {
		String expectedMessage="Please fill other Technologies Used";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	      
	}

	@When("^user clicks on Register Me with valid details$")
	public void user_clicks_on_Register_Me_with_valid_details() throws Throwable {
	     educational.setOtherTechnologies("Hibernate");
	     educational.clickRegisterMe();
	      
	}

	@Then("^'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!' message should display$")
	public void your_Registration_Has_succesfully_done_Plz_check_you_registerd_email_for_account_activation_link_message_should_display() throws Throwable {
		String expectedMessage="Your Registration Has succesfully done Plz check you registerd email for account activation link !!!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	      driver.close();
	}
}
