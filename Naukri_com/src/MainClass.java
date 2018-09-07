import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.deps.com.thoughtworks.xstream.io.binary.Token.Value;

public class MainClass {

	//private WebDriver driver;
	public static void main(String[] args) {
		private WebDriver driver;
		@Given("^User is on 'naukri home page' and select 'register with us'$")
		public void user_is_on_naukri_home_page_and_select_register_with_us() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.naukri.com/"); 
		}

		@When("^User provide valid details and click 'continue'$")
		public void user_provide_valid_details_and_click_continue() throws Throwable {
		    driver.findElement(By.xpath("//*[@id=\"p0widget\"]/div/div[1]/div/input")).click();
		    
		    By elements = By.name("userType");

			List<WebElement> radioButtons = driver.findElements(elements);
			WebElement radioBtn = radioButtons.get(1);
			radioBtn.click();

			for (WebElement radioButton : radioButtons) {
				if(radioButton.isSelected()) {
					System.out.println(radioButton.getAttribute("value"));
				}
		}
		    
		   
		    WebElement username= driver.findElement(By.id("fname"));
		    username.sendKeys("Alapuchy");
			 WebElement emailId= driver.findElement(By.id("email"));
			 WebElement password= driver.findElement(By.name("password"));
			 WebElement mobile= driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[4]/div[1]/div/input[2]"));
			 WebElement currentLocation = driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input"));
			 
			 
			
			 emailId.sendKeys("dakasuki@gmail.com");
			 
			 password.sendKeys("AlapuchiDakasuki11$");
			
			 mobile.sendKeys("9291212345");
			 
			 Select select = new Select(currentLocation);
			 select.selectByVisibleText("Chandigarh");
			
			 WebElement clickMe= driver.findElement(By.xpath("//*[@id=\"basicDetailForm\"]/div[5]/div/div/div[2]/button"));
				clickMe.submit();
		}

		@Then("^User account has been created$")
		public void user_account_has_been_created() throws Throwable {
		   
		}


		  
		 
		   
		   
		
		 
		   
		   

	}

}
