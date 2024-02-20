package com.OHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LoginTest {

	public static void main(String[] args) {
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";	
	    System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");

	     ChromeDriver driver=new ChromeDriver();
     
     driver.get(applicationUrlAddress);
     
     String expected_OrangeHRMApplicationLoginPageTitle="OrangeHRM";
     System.out.println("The expected title of the OrangeHRM Application Login page is:- expected_OrangeHRMApplicationLoginPageTitle");
     
     String actual_OrangeHRMApplicationLoginPageTitle=driver.getTitle();
     System.out.println("The actual title of the OrangeHRM Application Login page is:- actual_OrangeHRMApplicationLoginPageTitle");
    
     if(actual_OrangeHRMApplicationLoginPageTitle.equals(expected_OrangeHRMApplicationLoginPageTitle))
     {
    	 System.out.println("Successfully navigated to OrangeHRM Application Login Webpage:-PASS");
    	     }
     else
     
     {
    	 System.out.println("Failed navig to navigate to OrangeHRM Application Login Webpage:-FAIL");

     }
   //  <input name="txtUsername" id="txtUsername" type="text">
	driver.findElement(By.id("txtUsername")).sendKeys("Ahalya");
	
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	driver.findElement(By.name("txtPassword")).sendKeys("Ahalya@123");
	
	
    //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
       driver.findElement(By.id("btnLogin")).click();     
		// TODO Auto-generated method stub
       
//driver.quit();
	}

}
