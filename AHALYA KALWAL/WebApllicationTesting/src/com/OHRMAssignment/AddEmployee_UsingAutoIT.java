package com.OHRMAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployee_UsingAutoIT extends BaseTest {
	
	@Test(priority=1)
	public void loginfunctionality() throws IOException
	
	{

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
		
		FileInputStream	propertiesFile = new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");

		Properties properties = new Properties();
		properties.load(propertiesFile);

		
	//	<input name="txtUsername" id="txtUsername" type="text">
		String usernametestdata="Ahalya";
		By usernametestdataProperty=By.id(properties.getProperty("orangeHRMLogInPageUserNameProperty"));
	WebElement	usernamedata=driver.findElement(usernametestdataProperty);
	usernamedata.sendKeys(usernametestdata);
	
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	String passwordtestdata="Ahalya@123";
By	passwordtestdataProperty=By.id(properties.getProperty("orangeHRMLogInPagePasswordProperty"));
WebElement passworddata=driver.findElement(passwordtestdataProperty);
passworddata.sendKeys(passwordtestdata);
//    <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">	
	By	loginbuttonProperty=By.className(properties.getProperty("orangeHRMLogInPageLogInButtonProperty"));
	WebElement loginbutton=driver.findElement(loginbuttonProperty);
	loginbutton.click();
		                                              
	}
	@Test(priority=2)
	public void pim_MouseHover()
	{
	//	<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		By  pimProperty=By.id("menu_pim_viewPimModule");
	      WebElement pim=driver.findElement(pimProperty);
	      
	      Actions mouseHoverOperation=new Actions(driver);
	      mouseHoverOperation.moveToElement(pim).build().perform(); 
	      By  addEmployeeProperty= By.linkText("Add Employee");
		    WebElement addEmployee=driver.findElement(addEmployeeProperty);
		    addEmployee.click();
	}
	
	
	@Test(priority = 3)
	public void add_EmployeewebpageTest() throws IOException   {
		
	//	/html/body/div[1]/div[3]/div/div[1]/h1
		String Expected_OrangeHRMFullNameText="Add Employee";
		System.out.println(" The Expected Text of the OrangeHRM Application Login Page is :- "+Expected_OrangeHRMFullNameText);
		By fullNameProperty=By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1");
		WebElement headingElement = driver.findElement(fullNameProperty);
		String actual_OrangeHRMFullNameText=headingElement.getText();
		System.out.println(" The Actual Text of the OrangeHRM Application Login Page is :- "+actual_OrangeHRMFullNameText);

		if(actual_OrangeHRMFullNameText.equals(Expected_OrangeHRMFullNameText))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application Add Employee Page - PASS ");
		}
		else
		{
		System.out.println(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application Add Employee Page - FAIL");
		
		}
	}
	@Test(priority=4)
	public void addEmployeeTest() throws InterruptedException, IOException
	{
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		By firstNameProperty=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameProperty);
		firstName.sendKeys("Ahalya");
		
		//working with the keys of the keyboard
		Actions keyboardActions=new Actions(driver);
		keyboardActions.sendKeys(Keys.TAB).build().perform();
		
		// Middle name
		
		keyboardActions.sendKeys("Ram").build().perform();
		
		//Last Name
		keyboardActions.sendKeys(Keys.TAB).build().perform();
		keyboardActions.sendKeys("Kalwal").build().perform();
	
	//Employee ID
		keyboardActions.sendKeys(Keys.TAB).build().perform();
		By employeeIdProperty = By.name("employeeId");
		WebElement employeeId = driver.findElement(employeeIdProperty);

		String expected_employeeIdText = employeeId.getAttribute("value");
		System.out.println("The text of the webelement employee id is: " +expected_employeeIdText );
		
		
		keyboardActions.sendKeys(Keys.TAB).build().perform();

		//Enter Key of KeyBoard
		keyboardActions.sendKeys(Keys.TAB).build().perform();
		keyboardActions.sendKeys(Keys.ENTER).build().perform();


		Thread.sleep(5000);
		java.lang.Runtime.getRuntime().exec("./AutoItScripts/AutoItTestScript.exe");

		Thread.sleep(5000);

			
			By saveButtonProperty=By.id("btnSave");
		    WebElement saveButton=driver.findElement(saveButtonProperty);
		    saveButton.click();
		    Thread.sleep(5000);      
		
		
	}
		
		
		
		
		
		

	}