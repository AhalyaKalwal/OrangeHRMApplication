package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationUserDefinedMethods 
{
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	public OrangeHRMApplicationUserDefinedMethods(Hooks hooks)
	{
		driver=hooks.driver;
	}
	@Given("User should open Browser in the system")
	public void user_should_open_browser_in_the_system() {
	    System.setProperty("webdriver.chrome.driver", "./browserdriverfiles/chromedriver.exe");
	    driver=new ChromeDriver();
	    Log.info("###########ChromeBrowser launched successfully##############");
	}

	
	@When("User enters OrangeHRM Application URL Address")
	public void user_enters_orange_hrm_application_url_address() {
	   
		driver.get(applicationUrlAddress);
		Log.info("Successfully navigated to OrangeHRM Application URL Address on the Browser");
		driver.manage().window().maximize();
		
	}
	@Then("User should be navigated to OrangeHRM Application LogIn WebPage")
	public void user_should_be_navigated_to_orange_hrm_application_log_in_web_page()
	{
		//Validating HomePage - TITLE 
		
				String expected_OrangeHRMApplicationHomePageTitle="OrangeHRM";
				Log.info("The expected orangeHRM Application home page title is :-"+expected_OrangeHRMApplicationHomePageTitle);
				
				String actual_OrangeHRMApplicationHomePageTitle=driver.getTitle();
				Log.info("The actual orangeHRM Application home page title is :-"+actual_OrangeHRMApplicationHomePageTitle);
				
				if(actual_OrangeHRMApplicationHomePageTitle.contains(expected_OrangeHRMApplicationHomePageTitle))
				{
					Log.info("succesfully navigated to home page Title-PASS");
				}
				else
				{
					Log.info("Failed to navigate to home page Title-FAIL");
				}
				
	}
	@Then("^User should enter userName and password and click on login button$")
	public void user_should_enter_userName_and_password_and_click_on_login_button() throws Throwable {
	    
		String userNameTestData="Ahalya"; // Test Data
		By userNamePoperty=By.id("txtUsername"); // Property of an element is identified and assigned to a variable
		WebElement userName=driver.findElement(userNamePoperty); // finding a WebElement with the property in the current Webpage
		userName.sendKeys(userNameTestData); // Performing an operation on the identified WebElement

		String passwordTestData="Ahalya@123";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);

		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

	}

	@Then("^User should be navigated to OrangeHRM Application HomePage$")
	public void user_should_be_navigated_to_OrangeHRM_Application_HomePage() throws Throwable {
		By welComeAdminProperty=By.partialLinkText("Admin");

		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

		String expected_OrangeHRMApplicationHomePageText="Welcome";
		System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

		String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
		System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");
		}
		else
		{
		System.out.println("Failed to Navigate to OrangeHRM Application HomePage - FAIL ");
		}



		}
	

	@Then("^User should click on WelCome Admin and click on Logout$")
	public void user_should_click_on_WelCome_Admin_and_click_on_Logout() throws Throwable {
	    
		By welComeAdminProperty=By.partialLinkText("Admin");

		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		welComeAdmin.click();

		Thread.sleep(5000);


		By logOutProperty=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();
		}
	@Then("^User should enter \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
	public void user_should_enter_and_and_click_on_login_button(String userName, String password) throws Throwable {
	   
		By userNameProperty=By.id("txtUsername"); // Property of an element is identified and assigned to a variable
		WebElement UserName=driver.findElement(userNameProperty); // finding a WebElement with the property in the current Webpage
		UserName.sendKeys(userName); // Performing an operation on the identified WebElement
		
		//String passwordTestData="Ahalya@123";
		By passwordProperty=By.name("txtPassword");
		WebElement Password=driver.findElement(passwordProperty);
		Password.sendKeys(password);

		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

		
	}

@Then("^User should be close to OrangeHRM Application along with the browser$")
	public void user_should_be_close_to_OrangeHRM_Application_along_with_the_browser() throws Throwable {
	    driver.quit();
	}
}
	    
	    
	