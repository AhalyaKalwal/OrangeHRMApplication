package com.OHR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		   System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get(applicationUrlAddress);
		   
		   
	 String expected_OrangeHRMApplicationLoginpageTitle = "OrangeHRM";
System.out.println("The expected title of the OrangeHRM Application LoginPage title is:-"+expected_OrangeHRMApplicationLoginpageTitle);
	
      String actual_OrangeHRMApplicationloginpageTitle=driver.getTitle();
	System.out.println("The actual title of the OrangeHRM Application Loginpage title is:-"+actual_OrangeHRMApplicationloginpageTitle);
	
	if(actual_OrangeHRMApplicationloginpageTitle.equals(expected_OrangeHRMApplicationLoginpageTitle))
	{
	System.out.println("Successfully navigated to login page title:- PASS");
	}
	else
	{
		System.out.println("Failed to navigate to login page title:- FAIL");
	}
	//<input name="txtUsername" id="txtUsername" type="text">
	          String userNameTestData ="Ahalya";
	          By userNameProperty=By.name("txtUsername");
	          WebElement userName=driver.findElement(userNameProperty);
	          userName.sendKeys(userNameTestData);
	          
	         // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	          
	         String passwordTestData = "Ahalya@123";
	         By passwordProperty=By.id("txtPassword");
	         WebElement password=driver.findElement(passwordProperty);
	         password.sendKeys(passwordTestData);
	       
	         //<div id="divLoginButton">
	           // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	                   // </div>
	         
	         By loginButtonProperty=By.className("button");
	         WebElement loginButton=driver.findElement(loginButtonProperty);
	         loginButton.click();
	
	}
	
	
	
	
	}


