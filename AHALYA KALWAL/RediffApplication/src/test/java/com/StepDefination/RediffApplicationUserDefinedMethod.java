package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RediffApplicationUserDefinedMethod {
	WebDriver driver;
	String applicationURLAddress="https://register.rediff.com/register/register.php?FormName=user_details";

	@Given("User should open Browser in the System")
	public void user_should_open_browser_in_the_system() {
		
		System.setProperty("webdriver.chrome.driver", "./browserdriverfiles/chromedriver.exe");
	    driver=new ChromeDriver();
	    Log.info("###########ChromeBrowser launched successfully##############");
	}

	@When("User enters Rediff Application URL Address")
	public void user_enters_rediff_application_url_address() {
		driver.get(applicationURLAddress);
		Log.info("Successfully navigated to OrangeHRM Application URL Address on the Browser");
		driver.manage().window().maximize();
		
	}

	@Then("User should be navigated to Rediff Application LogIn WebPage")
	public void user_should_be_navigated_to_rediff_application_log_in_web_page() {
		//<input type="text" onblur="fieldTrack(this);" name="nameb79a9b7c" value="" style="width:185px;" maxlength="61">
	//	/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input
		String fullNameTestData="Ahalya"; // Test Data
		By fullNamePoperty=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"); // Property of an element is identified and assigned to a variable
		WebElement fullName=driver.findElement(fullNamePoperty); // finding a WebElement with the property in the current Webpage
		fullName.sendKeys(fullNameTestData); // Performing an operation on the identified WebElement
    Log.info("Sucessfully entered full Name Test Data");
	}

	@Then("User should close the Rediff Application along with the browser")
	public void user_should_close_the_rediff_application_along_with_the_browser() {
	    driver.quit();
	    Log.info("########## Rediff Application along with the Browser closed Successfully #########");
	}
}
