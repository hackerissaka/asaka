package com.cg.RegistrationForm.bean;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetailsPage {
	
	/**
	 * Class Name : PersonalDetailsPage;
	 * Name of Method : getter setter for all WebElements which is present in personalDetails.html
	 * Purpose: Declaration of xpath,id or name for each webelement
	 * 
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification : 24-august-2018;
	 */

	@FindBy(how=How.NAME, name="txtFN")
	private WebElement firstName;
	
	@FindBy(how=How.NAME, name="txtLN")
	private WebElement lastName;
	
	@FindBy(how=How.NAME, name="Email")
	private WebElement email;
	
	@FindBy(how=How.NAME, name="Phone")
	private WebElement contactNo;
	
	@FindBy(how=How.NAME, name="address1")
	private WebElement addressLine1;
	
	@FindBy(how=How.NAME, name="address2")
	private WebElement addressLine2;
	
	@FindBy(name="city")
	private List<WebElement> city;
	
	@FindBy(name="state")
	private List<WebElement> state;
	
	@FindBy(how=How.XPATH, xpath="/html/body/form/table/tbody/tr[11]/td/a")
	private WebElement next;

	@FindBy(how=How.XPATH, xpath= "/html/body/h4")
	private WebElement actualText;
	
	public String getActualText() {
		return actualText.getText();
	}

	public void setActualText(WebElement actualText) {
		this.actualText = actualText;
	}
	
	
	public PersonalDetailsPage() {
		super();
		
	}
	public String getFirstName() {
		return this.firstName.getAttribute("firstName");
		
	}
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public String getLastName() {
		return this.lastName.getAttribute("lastName");
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public String getEmail() {
		return this.email.getAttribute("email");
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public String getContactNo() {
		return this.contactNo.getAttribute("contactNo");
	}
	public void setContactNo(String contactNo) {
		this.contactNo.sendKeys(contactNo);
	}
	public String getAddressLine1() {
		return this.addressLine1.getAttribute("addressLine1");
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1.sendKeys(addressLine1);
	}
	public String getAddressLine2() {
		return this.addressLine2.getAttribute("addressLine2");
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2.sendKeys(addressLine2);
	}
	
	public void setCity(String city) {
		Select select = new Select(this.city.get(0));
	    select.selectByVisibleText(city);
	}


	public void setState(String state) {
		Select select = new Select(this.state.get(0));
	    select.selectByVisibleText(state);
	}
	
	public void clickNext() {
		 next.click();
	}
	
	
	
}
