package com.OHRMAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

  public class AssignmentOnOrangeHRM 
  {
	  
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method 
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		   System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get(applicationUrlAddress);
		   
		   
	 String expected_OrangeHRMApplicationLoginpageTitle = "OrangeHRM"; 
      System.out.println("");
      System.out.println("                EXPECTED TITLE - OrangeHRM                       ");
	 System.out.println("");
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
	
	String expected_URLAddress="orangehrm-4.2.0.1";
	System.out.println("");
	System.out.println("               EXPECTED URL ADDRESS - Orange-4.2.0.1                     ");
	System.out.println("");
	System.out.println("The expected URL Address of the OrangeHRM Application is:-"+expected_URLAddress );
	
	String actual_URLAddress=driver.getCurrentUrl();
	System.out.println("The actual URL Address of the OrangeHRM Application is:-"+actual_URLAddress);
	
	if(actual_URLAddress.contains(expected_URLAddress))
	{
		System.out.println("Successfully passed to login page URL Address:- PASS");
	}
	else
	{
		System.out.println("Failed to launch login page URL Address:- FAIL ");
		
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
	         System.out.println();
	          System.out.println("                 LOGIN WITH VALID TESTDATA                     ");
	          System.out.println();
	System.out.println("User login successfully");
	System.out.println("Navigated to admin Home Page");
	
	String expected_OrangeHRMApplicationHomePageTitle = "OrangeHRM";
    System.out.println();
    System.out.println("                EXPECTED HOME PAGE TITLE - OrangeHRM                       ");
	 System.out.println();
    System.out.println("The expected title of the OrangeHRM Application LoginPage title is:-"+expected_OrangeHRMApplicationLoginpageTitle);
	
    String actual_OrangeHRMApplicationHomePageTitle=driver.getTitle();
	System.out.println("The actual title of the OrangeHRM Application Loginpage title is:-"+actual_OrangeHRMApplicationloginpageTitle);
	
	if(actual_OrangeHRMApplicationloginpageTitle.equals(expected_OrangeHRMApplicationLoginpageTitle))
	{
	System.out.println("Successfully navigated to Home page Title:- PASS");
	}
	else
	{
		System.out.println("Failed to navigate to Home page Title:- FAIL");
	}     
	
	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	
	 By welcomeAdminProperty=By.id("welcome");
	// By welcomeAdminProperty=By.linkText("welcome admin");
	 //By welcomeAdminProperty=By.partialLinkText("welcome");
	 //By welcomeAdminProperty=By.partialLinkText("admin");
	 WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
	 welcomeAdmin.click();
	     
     System.out.println();
     System.out.println("               AUTOMATE WELCOME ADMIN               ");
	 System.out.println();
	 System.out.println("Successfully automated welcome admin link");
	 
	 Thread.sleep(5000);
	
	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	   // By logoutproperty=By.linkText("logout")  ;
	 //   WebDriverWait wait=new WebDriverWait(driver,20);
	  //  wait.until(ExpectedConditions)
	//By logoutproperty=By.linkText("Logout");
	// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.findElementByLinkText("Logout").click();
	 By logOutProperty=By.linkText("Logout");
	 WebElement logOut=driver.findElement(logOutProperty);
	 logOut.click();
	 
	
	 System.out.println();
	 System.out.println("                AUTOMATE LOGOUT                      ");
	 System.out.println();
	 System.out.println("Successfully automated logout ");
	 
	 System.out.println();
	 System.out.println();
	 System.out.println("                VERIFY AND VALIDATE EXPECTED ORANGEHRM LOGIN WEBPAGE AFTER LOGOUT       ");
	 System.out.println();
	 System.out.println();
	 
	 String expected_OrangeHRMApplicationWebpageTitle = "OrangeHRM"; 
     System.out.println();
     System.out.println("                EXPECTED WEB PAGE TITLE - OrangeHRM                       ");
	 System.out.println();
     System.out.println("The expected title of the OrangeHRM Application web Page title is:-"+ expected_OrangeHRMApplicationWebpageTitle);
	
     String actual_OrangeHRMApplicationWebpageTitle=driver.getTitle();
	System.out.println("The actual title of the OrangeHRM Application web page title is:-"+actual_OrangeHRMApplicationWebpageTitle);
	
	if(actual_OrangeHRMApplicationWebpageTitle.equals(expected_OrangeHRMApplicationWebpageTitle))
	{
	System.out.println("Successfully navigated to Web page title:- PASS");
	}
	else
	{
		System.out.println("Failed to navigate to Web page title:- FAIL");
	}
	
	String applicationWebpageUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


	String expected_WebPageURLAddress="orangehrm-4.2.0.1";
	System.out.println();
	System.out.println("               EXPECTED WEB PAGE URL ADDRESS - Orange-4.2.0.1                     ");
	System.out.println();
	System.out.println("The expected Web page URL Address of the OrangeHRM Application is:-"+ expected_WebPageURLAddress);
	
	String actual_WebPageURLAddress=driver.getCurrentUrl();
	System.out.println("The actual Web page URL Address of the OrangeHRM Application is:-"+actual_WebPageURLAddress);
	
	if(actual_WebPageURLAddress.contains(expected_WebPageURLAddress))
	{
		System.out.println("Successfully passed to Web page URL Address:- PASS");
	}
	else
	{
		System.out.println("Failed to navigate to web  page URL Address:- FAIL ");
		
	}
	
	System.out.println();
	System.out.println("               CLOSE THE APPLICATION                  ");
	System.out.println();
	System.out.println("Successfully closed the application");
	
	driver.close();
	
	
	
	
	
	
	
	}
	
	}




	