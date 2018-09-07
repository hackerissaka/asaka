package com.cg.RegistrationForm.bean;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class EducationalDetailsPage {
	/**
	 * Class Name : EducationalDetailsPage;
	 * Name of Method : getter setter for all WebElements which is present in educationalDetails.html
	 * Purpose: Declaration of xpath,id or name for each webelement
	 * 
	 * Author: SwetaRani_152936;
	 * Date of Creation : 24-august-2018;
	 * 
	 * Last Date Of Modification : 24-august-2018;
	 */


	@FindBy(name="graduation")
	private List<WebElement> graduation;
	
	@FindBy(how=How.NAME, name="percentage")
	private WebElement percentage;
	
	@FindBy(how=How.NAME, name="passingYear")
	private WebElement passingYear;
	
	@FindBy(how=How.NAME, name="projectName")
	private WebElement projectName;
	
	@FindBy(how=How.NAME,name="technologies")
	private List<WebElement> technologiesUsed;
	
	@FindBy(how=How.NAME, name="otherTechnologies")
	private WebElement otherTechnologies;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"btnRegister\"]")
	private WebElement registerMe;
	
	@FindBy(how=How.XPATH, xpath= "/html/body/h4")
	private WebElement actualTextEdu;
	
	public String getActualTextEdu() {
		return actualTextEdu.getText();
	}

	public void setActualTextEdu(WebElement actualTextEdu) {
		this.actualTextEdu = actualTextEdu;
	}
	
	public void setGraduation(String graduation) {
		Select select = new Select(this.graduation.get(0));
	    select.selectByVisibleText(graduation);
	}
	
	public String getPercentage() {
		return this.percentage.getAttribute("percentage");
	}
	public void setPercentage(String percentage) {
		this.percentage.sendKeys(percentage);
	}
	public String getPassingYear() {
		return this.passingYear.getAttribute("passingYear");
	}
	public void setPassingYear(String passingYear) {
		this.passingYear.sendKeys(passingYear);
	}
	public String getProjectName() {
		return this.projectName.getAttribute("projectName");
	}
	public void setProjectName(String projectName) {
		this.projectName.sendKeys(projectName);
	}
	public void setTechnologiesUsed(String technologyUsed) {
		for(WebElement technology : technologiesUsed) {
			if(technology.getAttribute("value").contains(technologyUsed))
				technology.click();
		}	
	}
	
	
	public String getOtherTechnologies() {
		return this.otherTechnologies.getAttribute("otherTechnologies");
	}
	public void setOtherTechnologies(String otherTechnologies) {
		this.otherTechnologies.sendKeys(otherTechnologies);
	}
	
	public void clickRegisterMe() {
		 registerMe.click();
	}
	
	
}
