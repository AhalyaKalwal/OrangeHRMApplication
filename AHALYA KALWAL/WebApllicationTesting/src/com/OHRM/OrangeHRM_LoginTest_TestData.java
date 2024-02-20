package com.OHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_LoginTest_TestData {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		
		System.out.println("The Browser is successfully automated:-PASS");
		
		
		//Validating Title
		
		String expected_OrangeHRMApplicationLoginPageTitle="OrangeHRM";
		System.out.println("The expected orangeHRM Application login page title is :-"+expected_OrangeHRMApplicationLoginPageTitle);
		
		String actual_OrangeHRMApplicationLoginPageTitle=driver.getTitle();
		System.out.println("The actual orangeHRM Application login page title is :-"+actual_OrangeHRMApplicationLoginPageTitle);
		
		if(actual_OrangeHRMApplicationLoginPageTitle.contains(expected_OrangeHRMApplicationLoginPageTitle))
		{
			System.out.println("succesfully navigated to login page Title-PASS");
		}
		else
		{
			System.out.println("Failed to navigate to login page Title-FAIL");
		}
		
		//Validating URL
		
		String expected_OrangeHRMApplicationLoginPageURL="orangehrm-4.2.0.1";
		System.out.println("The expected orangeHRM Application Loginpage URL is:-"+expected_OrangeHRMApplicationLoginPageURL);
		
		String actual_OrangeHRMApplicationLoginPageURL=driver.getCurrentUrl();
		System.out.println("The actual orangeHRM Application Loginpage URL is:-"+actual_OrangeHRMApplicationLoginPageURL);
		
		
		if(actual_OrangeHRMApplicationLoginPageURL.contains(expected_OrangeHRMApplicationLoginPageURL))
		{
			System.out.println("Successfully navigated to orangeHRM Application loginpage URL is:-PASS");
		}
		else
		{
			System.out.println("Failed to navigate to orangeHRM Application loginpage URL is:-FAIL");
		}
		
		//Validating TEXT
		
	String expected_OrangeHRMApplicationLoginPageText="LOGIN Panel";
    System.out.println("The expected orangeHRM Application Loginpage TEXT is:-"+expected_OrangeHRMApplicationLoginPageText);
		
	
   // <div id="logInPanelHeading">LOGIN Panel</div>
    
   By OrangeHRMApplicationLoginPageTextProperty =By.id("logInPanelHeading");
  WebElement OrangeHRMApplicationLoginPageText=driver.findElement(OrangeHRMApplicationLoginPageTextProperty);
  
  String actual_OrangeHRMApplicationLoginPageText=OrangeHRMApplicationLoginPageText.getText();
  System.out.println("The actual orangeHRM Application Loginpage TEXT is:-"+actual_OrangeHRMApplicationLoginPageText);
		
		
		if(actual_OrangeHRMApplicationLoginPageText.contains(expected_OrangeHRMApplicationLoginPageText))
		{
			System.out.println("Successfully navigated to orangeHRM Application loginpage TEXT is:-PASS");
		}
		
		else
		{
			System.out.println("Failed to  navigate to orangeHRM Application loginpage TEXT is:-FAIL");
		}
		
		FileInputStream testData=new FileInputStream("./src/com/Excelsheet/singleDataTestResult.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(testData);
		XSSFSheet  logintestdata = workbook.getSheet("LoginTestData");
		
		Row testDataRow=logintestdata.getRow(1);
	Cell testDataRowOfCell=testDataRow.getCell(0);
	String userNameTestData =testDataRowOfCell.getStringCellValue();
	System.out.println(userNameTestData);
		
		//String userNameTestData="Ahalya";
		By userNameTestDataProperty=By.name("txtUsername");
		WebElement userName=driver.findElement(userNameTestDataProperty);
		userName.sendKeys(userNameTestData);
		
	
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		
		
		/*Row testDataRowpswd=logintestdata.getRow(1);
		Cell testDataRowOfCellpswd=testDataRowpswd.getCell(1);
		String passwordTestData=testDataRowOfCellpswd.getStringCellValue();
		System.out.println(passwordTestData);*/
		
		Cell passwordData=testDataRow.getCell(1);
		String passwordTestData=passwordData.getStringCellValue();
		
		
		//String passwordTestData="Ahalya@123";
		By passwordTestDataProperty=By.id("txtPassword");
	WebElement password=driver.findElement(passwordTestDataProperty);
	password.sendKeys(passwordTestData);
	
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By loginProperty=By.className("button");
	WebElement Login=driver.findElement(loginProperty);
	Login.click();
	
	
	System.out.println("User logined and successfully navigated to Home Page");
	
	//Validating HomePage - TITLE 
	
	String expected_OrangeHRMApplicationHomePageTitle="OrangeHRM";
	System.out.println("The expected orangeHRM Application home page title is :-"+expected_OrangeHRMApplicationHomePageTitle);
	
	String actual_OrangeHRMApplicationHomePageTitle=driver.getTitle();
	System.out.println("The actual orangeHRM Application home page title is :-"+actual_OrangeHRMApplicationHomePageTitle);
	
	if(actual_OrangeHRMApplicationHomePageTitle.contains(expected_OrangeHRMApplicationHomePageTitle))
	{
		System.out.println("succesfully navigated to home page Title-PASS");
	}
	else
	{
		System.out.println("Failed to navigate to home page Title-FAIL");
	}
	
	
		//Validating HomePage - TEXT
	
	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	
	By welcomeadminProperty=By.id("welcome");
	WebElement welcomeadmin=driver.findElement(welcomeadminProperty);
	
	
	String expected_OrangeHRMApplicationHomePageText="Welcome";
	System.out.println("The expected orangeHRM Application home page text is :-"+expected_OrangeHRMApplicationHomePageText);
	
	String actual_OrangeHRMApplicationHomePageText=welcomeadmin.getText();
	System.out.println("The actual orangeHRM Application home page text is :-"+actual_OrangeHRMApplicationHomePageText);
	
	if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
	{
		System.out.println("succesfully navigated to home page Text-PASS");
		
		Row newRow=logintestdata.getRow(1);
		Cell testRowOfCell=testDataRow.createCell(2);
		testRowOfCell.setCellValue("succesfully navigated to home page Text-PASS");
		
		
		
	}
	else
	{
		System.out.println("Failed to navigate to home page Text-FAIL");
		
		
		Row newRow=logintestdata.getRow(1);
		Cell testRowOfCell=testDataRow.createCell(2);
		testRowOfCell.setCellValue("Failed to navigate to home page Text-FAIL");
		
		
		
	}
	FileOutputStream testResult=new FileOutputStream("./src/com/orangehrmexcelResultsfile/singleDataTestResult.xlsx");
			
	workbook.write(testResult);
	//src/com/orangehrmexcelResultsfile/singleDataTestResult.xlsx
	welcomeadmin.click();
	
	Thread.sleep(3000);
	
	//Automated logout
	
	//<li><a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a></li>
	
	
	By logoutProperty=By.linkText("Logout");
	WebElement logout=driver.findElement(logoutProperty);
	logout.click();
	
	 expected_OrangeHRMApplicationLoginPageTitle="OrangeHRM";
	System.out.println("The expected orangeHRM Application login page title is :-"+expected_OrangeHRMApplicationLoginPageTitle);
	
	 actual_OrangeHRMApplicationLoginPageTitle=driver.getTitle();
	System.out.println("The actual orangeHRM Application login page title is :-"+actual_OrangeHRMApplicationLoginPageTitle);
	
	if(actual_OrangeHRMApplicationLoginPageTitle.contains(expected_OrangeHRMApplicationLoginPageTitle))
	{
		System.out.println("succesfully navigated to login page Title-PASS");
	}
	else
	{
		System.out.println("Failed to navigate to login page Title-FAIL");
	}
	
	
	 expected_OrangeHRMApplicationLoginPageURL="orangehrm-4.2.0.1";
	System.out.println("The expected orangeHRM Application Loginpage URL is:-"+expected_OrangeHRMApplicationLoginPageURL);
	
     actual_OrangeHRMApplicationLoginPageURL=driver.getCurrentUrl();
	System.out.println("The actual orangeHRM Application Loginpage URL is:-"+actual_OrangeHRMApplicationLoginPageURL);
	
	
	if(actual_OrangeHRMApplicationLoginPageURL.contains(expected_OrangeHRMApplicationLoginPageURL))
	{
		System.out.println("Successfully navigated to orangeHRM Application loginpage URL is:-PASS");
	}
	else
	{
		System.out.println("Failed to navigate to orangeHRM Application loginpage URL is:-FAIL");
	}
	
	
	 expected_OrangeHRMApplicationLoginPageText="LOGIN Panel";
    System.out.println("The expected orangeHRM Application Loginpage TEXT is:-"+expected_OrangeHRMApplicationLoginPageText);
		

	  OrangeHRMApplicationLoginPageTextProperty =By.id("logInPanelHeading");
	   OrangeHRMApplicationLoginPageText=driver.findElement(OrangeHRMApplicationLoginPageTextProperty);
	  
	   actual_OrangeHRMApplicationLoginPageText=OrangeHRMApplicationLoginPageText.getText();
	  System.out.println("The actual orangeHRM Application Loginpage TEXT is:-"+actual_OrangeHRMApplicationLoginPageText);
			
			
			if(actual_OrangeHRMApplicationLoginPageText.contains(expected_OrangeHRMApplicationLoginPageText))
			{
				System.out.println("Successfully navigated to orangeHRM Application loginpage TEXT is:-PASS");
			}
			
			else
			{
				System.out.println("Failed to  navigate to orangeHRM Application loginpage TEXT is:-FAIL");
			}
			
	System.out.println("close the application");
	driver.close();
	
	
	
	}



	}


