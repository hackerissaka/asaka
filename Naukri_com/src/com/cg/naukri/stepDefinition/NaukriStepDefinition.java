package com.cg.naukri.stepDefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NaukriStepDefinition {
	
	private WebDriver driver;
	
	@Given("^user is in home page of Naukri and selects register option$")
	public void user_is_in_home_page_of_Naukri_and_selects_register_option() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id=\"p0widget\"]/div/div[1]/div/input")).click();
		
	}

	@When("^user selects 'I am proffesional option'$")
	public void user_selects_I_am_proffesional_option() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"flowBifurcation\"]/div[2]/form/div[2]/div/div")).click();
	}

	@Then("^personal details form should open$")
	public void personal_details_form_should_open() throws Throwable {
		 String actualWord=  driver.findElement(By.xpath("//*[@id=\"banner\"]/ul/li[1]/div")).getText();
		 String expectedWord="Personal";
		 Assert.assertEquals(expectedWord, actualWord);
	}

	@When("^user fills all personal details and submits$")
	public void user_fills_all_personal_details_and_submits() throws Throwable {
		WebElement nameElement=	driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		nameElement.sendKeys("Mahanthi");
	
		WebElement emailElement=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailElement.sendKeys("mahanthi155@gmail.com");
	
		WebElement passwordElement=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[3]/div[1]/div/input"));
		passwordElement.sendKeys("mahanthi0");
	
		
	
		WebElement mobileNumberElement=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[4]/div[1]/div/input[2]"));
		mobileNumberElement.sendKeys("9999999999");
		
	   
		
		
		
		
		/*WebElement textBox=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input"));
		textBox.click();
		WebElement sal=driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-experience/div/div[1]/div/div[1]/div[2]/ul"));
		sal.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-experience/div/div[1]/div/div[1]/div[2]/ul/li[5]")).click();*/
		
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input")).click();//text box exp year
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-experience/div/div[1]/div/div[1]/div[2]/ul/li[2]")).click();//list in ul
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).click();//text box exp month
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-experience/div/div[1]/div/div[2]/div[2]/ul/li[1]")).click();//list in ul
		                             
		
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-uploader/div/div[1]/span[1]/input")).sendKeys("C:\\Users\\meghak\\Desktop\\res.doc"); //resume uploading
		/*driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-uploader/div/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-uploader/div/div[1]/textarea")).sendKeys("This is not the actual reumse.");
		*/ //resume uploading
		
		
		driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[5]/div/div/div[2]/button")).submit();
		
		
		
	}
	@Then("^Employment form should open$")
	public void employment_form_should_open() throws Throwable {
		 Thread.sleep(2000);
			driver.navigate().refresh();
		String actualWord=driver.findElement(By.xpath("//*[@id=\"banner\"]/ul/li[2]/div")).getText();
	    String expectedWord="Employment";
	    Assert.assertEquals(expectedWord,actualWord);
	}

	@When("^user fills all employment details and submit$")
	public void user_fills_all_employment_details_and_submit() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"designation_0\"]")).sendKeys("An");
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-designation/div/div[1]/div/suggestor/ul/li[2]")).click();
		
		
		driver.findElement(By.id("company_0")).sendKeys("Ca");
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-company/div/div[1]/div/suggestor/ul/li[4]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-salary/div/div[1]/div/div[1]/label[1]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-salary/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-salary/div/div[1]/div/div[2]/div[2]/ul/li[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-salary/div/div[1]/div/div[3]/div[1]/ul/li/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-salary/div/div[1]/div/div[3]/div[2]/ul/li[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[1]/div[1]/ul/li/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[1]/div[2]/ul/li[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[2]/div[1]/ul/li/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-duration/div/div[1]/div/div[1]/div[2]/div[2]/ul/li[8]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-duration/div/div[1]/div/div[2]/div[1]/div[1]/ul/li/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-duration/div/div[1]/div/div[2]/div[1]/div[2]/ul/li[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-duration/div/div[1]/div/div[2]/div[2]/div[1]/ul/li/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[1]/resman-duration/div/div[1]/div/div[2]/div[2]/div[2]/ul/li[8]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[2]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[2]/resman-location/div/div/div[1]/div/div[2]/ul/li[13]/ul/li[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"employmentDetailForm\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/ul/li[1]")).click();
		
		/*driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li/suggestor/div/div/input")).sendKeys("core");
		driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li[2]/suggestor/ul")).click();
		driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li[2]/suggestor/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li[2]/suggestor/ul/li[2]")).click();
		*/
		
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li/suggestor/div/div/input")).sendKeys("Core");
	//driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li[2]/suggestor/ul/li")).click();
	//driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li[3]/suggestor/ul/li[1]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li[2]/suggestor/ul/li")).click();
	
	driver.findElement(By.id("selSkillCont")).click();
	driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li[2]/suggestor/ul"));
	driver.findElement(By.xpath("//*[@id=\"selSkillCont\"]/div/ul/li[2]/suggestor/ul/li[2]")).click();
		
		
	}

	@Then("^Education form should open$")
	public void education_form_should_open() throws Throwable {
	 
	}
}
