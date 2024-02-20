package com.OrangeHRMApplicationPages;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utility.Log;


public class LogInPage extends BaseTest{

	//object Repository class
	//<div id="logInPanelHeading">LOGIN Panel</div>
	// 1. Identification of webelemnts
	//2. performing operation on the web elements - Buisness logics
	
	public LogInPage() // constructor- when a class name is similar to the Method name
	{
		PageFactory.initElements(driver,this);
	}
	
	// Identification of WebElements
	@FindBy(id="logInPanelHeading")
	WebElement logInPanelText;
	
	// peforming operation on the webelements 
	public void orangeHRMApplicationLogInPage_logInPannelTextValidation()
	{
		String expected_OrangeHRMApplicationLogInPagelogInPannelText="LOGIN Panel";
		Log.info(" The expected Text of Web Element login pannel text is-"+expected_OrangeHRMApplicationLogInPagelogInPannelText);
		
		String actual_OrangeHRMApplicationLogInPagelogInPannelText=logInPanelText.getText();
		Log.info("The actual Text of Web Element login pannel text is-"+actual_OrangeHRMApplicationLogInPagelogInPannelText);
		
		if(actual_OrangeHRMApplicationLogInPagelogInPannelText.equals(expected_OrangeHRMApplicationLogInPagelogInPannelText))
		{
			Log.info("Login pannel text validation successful - PASS");
		}
		else
		{
			Log.info("Login pannel text validation not successful - FAIL");
		}
	}
		
		// Identification of webelements
	///html/body/div[1]/div/div[2]/div/img

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
	WebElement loginpageLogo;
	
	public void orangeHRMApplicationLogInPage_logoValidation()
		
	{
	boolean	flag=loginpageLogo.isDisplayed();
	
	if(flag)
	{
		Log.info("orangeHRM Application login page logo is found - PASS");
	}
	else
	{
		Log.info("orangeHRM Application login page logo is not found - FAIL");
	}
	}
		
	
   // <input name="txtUsername" id="txtUsername" type="text"><span class="form-hint" style="display: none;">Username</span> 
@FindBy(id="txtUsername")
WebElement username;
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">	
@FindBy(name="txtPassword")
WebElement password;
	//<input type="submit" name="Submit" class="button hover" id="btnLogin" value="LOGIN">
@FindBy(id="btnLogin")
WebElement loginbutton;
	
	
	public void orangeHRMApplicationLogInPage_LogInValidation(String UserName,String Password) throws InterruptedException
	{
		username.sendKeys(UserName);
		password.sendKeys(Password);
		loginbutton.click();
		Log.info("Navigated to OrangeHRM Application Home Page - PASS");

		String Expected_CurrentUrl = "dashboard";
		String Actual_CurrentUrl = driver.getCurrentUrl();

		if (Actual_CurrentUrl.contains(Expected_CurrentUrl)) {

			//Cell Resultcell = dataRow.createCell(2);
			//Resultcell.setCellValue("Pass");

			// Automate Welcome Admin
			By WelcomeAdminLocator = By.linkText("Welcome Admin");
			WebElement WelcomeAdmin = driver.findElement(WelcomeAdminLocator);
			WelcomeAdmin.click();

		
			Thread.sleep(5000);

			
			By LogoutLocator = By.linkText("Logout");
			WebElement Logout = driver.findElement(LogoutLocator);
			Logout.click();

		}
	}
	
		
		
		
		
		
	
	
	
}
