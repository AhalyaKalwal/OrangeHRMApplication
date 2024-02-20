package com.OHRMAssignment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployee_PIM_MultipleTestData  {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
		
		
	FileInputStream loginTestDataFile=new FileInputStream("./src/com/Excelsheet/PIM_MultipleTestData.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
	XSSFSheet logintestdataSheet=workbook.getSheet("PIM2");
		
		
		
	//<div id="logInPanelHeading"> </div>
	//	<input name="txtUsername" id="txtUsername" type="text">
		
	//	<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
	//	<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	
	int rowcount=logintestdataSheet.getLastRowNum();
	for(int rowIndex=2;rowIndex<=rowcount;rowIndex++)
	{
	Row	testdataSheetRow=logintestdataSheet.getRow(rowIndex);
	Cell userNameTestDataCell=testdataSheetRow.getCell(6);
	String userNameTestData=userNameTestDataCell.getStringCellValue();//Getting Username
    Cell passwordTestDataCell=testdataSheetRow.getCell(7);
    String passwordTestData= passwordTestDataCell.getStringCellValue();// Getting password
    
    Cell logInPanelTestDataCell=testdataSheetRow.getCell(0);
    String logInPanelTestData= logInPanelTestDataCell.getStringCellValue();//Getting loginpanel
    
	String expected_OrangeHRMApplicationLoginPanel=logInPanelTestData;
	System.out.println("The expected orangeHRM application login panel text is:-"+expected_OrangeHRMApplicationLoginPanel);
	      //<div id="logInPanelHeading">LOGIN Panel</div>
    By loginpanelProperty=By.id("logInPanelHeading");
    WebElement loginpanelText=driver.findElement(loginpanelProperty);
      
    String  actual_OrangeHRMApplicationLoginPanel=loginpanelText.getText();
    System.out.println("The actual orangeHRM application login panel text is:-"+actual_OrangeHRMApplicationLoginPanel);
    if(actual_OrangeHRMApplicationLoginPanel.equals(expected_OrangeHRMApplicationLoginPanel))
    {
    System.out.println("Successfully navigated to orangehrm application login page text:-PASS");
    Cell testRowOfCell=testdataSheetRow.createCell(1);
    testRowOfCell.setCellValue("LOGIN Panel");
     testRowOfCell=testdataSheetRow.createCell(2);
    testRowOfCell.setCellValue("Successfully navigated to orangehrm application login page text:-PASS");
    }
    else
    {
    System.out.println("Failed to navigate to orangehrm application login page text:-FAIL");
   	Cell testRowOfCell=testdataSheetRow.createCell(1);
    testRowOfCell.setCellValue("Not Matched");
    }

    By usernameProperty=By.id("txtUsername");	
    WebElement username=driver.findElement(usernameProperty);
    username.sendKeys(userNameTestData);

        By passwordProperty=By.id("txtPassword");
        WebElement password= driver.findElement(passwordProperty);
        password.sendKeys(passwordTestData);
        
//    	<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">  
  By	loginInButtonProperty=By.className("button");
  WebElement loginInButton= driver.findElement(loginInButtonProperty);
  loginInButton.click();
  
 Cell welcomeAdmintestdatacell=testdataSheetRow.getCell(8);
String welcomeAdmin= welcomeAdmintestdatacell.getStringCellValue();
  String expected_welcomeAdmin=welcomeAdmin;
  System.out.println("The expected orangehrm application welcome admin link is:-"+expected_welcomeAdmin);
  By welcomeadminProperty=By.id("welcome");
  WebElement welcomeadmin=driver.findElement(welcomeadminProperty);
	
  String actual_welcomeAdmin=welcomeadmin.getText();
  System.out.println("The actual orangehrm application welcome admin link is:-"+actual_welcomeAdmin);
  if(actual_welcomeAdmin.contains(expected_welcomeAdmin))
  {
	  System.out.println("successfully matched with the welcome admin text:-PASS");
	  Cell testRowOfCell=testdataSheetRow.createCell(9);
	    testRowOfCell.setCellValue("Welcome");
	    testRowOfCell=testdataSheetRow.createCell(10);
	    testRowOfCell.setCellValue("successfully matched with the welcome admin text:-PASS");
  }
  else
  {
	  System.out.println("Failed to match with the welcome admin text:-FAIL");
	  Cell testRowOfCell=testdataSheetRow.createCell(9);
	    testRowOfCell.setCellValue("Welcome");
	    testRowOfCell.setCellValue("Not Matched");
    }
   //<a href="/ orange hrm -4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
  
By  pimProperty=By.id("menu_pim_viewPimModule");
WebElement pim=driver.findElement(pimProperty);

Actions mouseHoverOperation=new Actions(driver);
mouseHoverOperation.moveToElement(pim).build().perform(); 

By  AddEmployeeProperty= By.linkText("Add Employee");
WebElement AddEmployee=driver.findElement(AddEmployeeProperty);
AddEmployee.click();

/*Cell AddEmployeeTestDataCell=testdataSheetRow.getCell(11);
String AddEmployeeTestData=AddEmployeeTestDataCell.getStringCellValue();  no
//  <h1>Add Employee</h1>
String Expected_OrangeHRMFullNameText=AddEmployeeTestData;
System.out.println(" The Expected Text of the OrangeHRM Application Login Page is :- "+Expected_OrangeHRMFullNameText);
WebElement headingElement = driver.findElement(By.xpath("//h1[text()='Add Employee']"));
String actual_OrangeHRMFullNameText=headingElement.getText();
System.out.println(" The Actual Text of the OrangeHRM Application Login Page is :- "+actual_OrangeHRMFullNameText);

if(actual_OrangeHRMFullNameText.equals(Expected_OrangeHRMFullNameText))
{
System.out.println(" Successfully Navigated to OrangeHRM Application Add Employee Page - PASS ");
Cell testRowOfCell=testdataSheetRow.createCell(12);
testRowOfCell.setCellValue(actual_OrangeHRMFullNameText);
testRowOfCell=testdataSheetRow.createCell(13);
testRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application  Add Employee Page - PASS ");
}
else
{
System.out.println(" Expected LogIn Page Text Not Found - Failed to Navigate to OrangeHRM Application Add Employee Page - FAIL");
Cell testRowOfCell=testdataSheetRow.createCell(12);
testRowOfCell.setCellValue("Not Matched");
testRowOfCell=testdataSheetRow.createCell(13);
testRowOfCell.setCellValue("Failed Navigated to OrangeHRM Application Add Employee Page - Fail");
}
*/
//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">

Cell firstNameTestDataCell=testdataSheetRow.getCell(14);
String expected_FirstnameText=firstNameTestDataCell.getStringCellValue();
By firstNameProperty=By.name("firstName");
WebElement firstName=driver.findElement(firstNameProperty);
firstName.sendKeys(expected_FirstnameText);

Cell middleNameTestDataCell=testdataSheetRow.getCell(15);
String expected_middleNameTestData=middleNameTestDataCell.getStringCellValue();
By middleNameProperty=By.id("middleName");
WebElement middleName=driver.findElement(middleNameProperty);
middleName.sendKeys(expected_middleNameTestData);

Cell lastNameTestDataCell=testdataSheetRow.getCell(16);
String expected_lastNameTestData=lastNameTestDataCell.getStringCellValue();
By lastNameProperty=By.name("lastName");
WebElement lastName=driver.findElement(lastNameProperty);
lastName.sendKeys(expected_lastNameTestData);
  
 // <input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0002" id="employeeId"> 

By employeeIdProperty = By.name("employeeId");
WebElement employeeId = driver.findElement(employeeIdProperty);

String expected_employeeIdText = employeeId.getAttribute("value");
System.out.println("The text of the webelement employee id is: " +expected_employeeIdText );
Cell testRowOfCell=testdataSheetRow.createCell(17);
testRowOfCell.setCellValue(expected_employeeIdText);

//	<input type="button" class="" id="btnSave" value="Save">
//working with the keys of the keyboard
Actions keyBoardActions = new Actions(driver);
keyBoardActions.sendKeys(Keys.TAB).build().perform();

//Enter Key of KeyBoard
keyBoardActions.sendKeys(Keys.TAB).build().perform();
keyBoardActions.sendKeys(Keys.ENTER).build().perform();


Thread.sleep(5000);
java.lang.Runtime.getRuntime().exec("./AutoItScripts/AutoItTestScript.exe");

Thread.sleep(5000);

	
	By saveButtonProperty=By.id("btnSave");
    WebElement saveButton=driver.findElement(saveButtonProperty);
    saveButton.click();
    Thread.sleep(5000);      
   // <h1>Personal Details</h1>   
    Cell personaldetailsTestDataCell=testdataSheetRow.getCell(18);
    String personaldetailsTestData=personaldetailsTestDataCell.getStringCellValue();//Getting personal details
    String Expected_personaldetailstext=personaldetailsTestData;
    System.out.println(" The Expected Text of the OrangeHRM Application personal Details Page is :- "+Expected_personaldetailstext);
    WebElement PersonalheadingElement = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1"));
	String actual_OrangeHRMPersonalDetailsText = PersonalheadingElement.getText();
    System.out.println(" The Actual Text of the OrangeHRM Application personal Details Page is :- "+actual_OrangeHRMPersonalDetailsText);

    if(actual_OrangeHRMPersonalDetailsText.equals(Expected_personaldetailstext))
    {
    System.out.println(" Successfully Navigated to OrangeHRM Application personal Details Page - PASS ");
    testRowOfCell=testdataSheetRow.createCell(19);
    testRowOfCell.setCellValue(actual_OrangeHRMPersonalDetailsText);
    testRowOfCell=testdataSheetRow.createCell(20);
    testRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application personal Details  Page - PASS ");
    }
    else
    {
    System.out.println("Failed to navigate to orangehrm application personal Details page:- FAIL");
     testRowOfCell=testdataSheetRow.createCell(19);
    testRowOfCell.setCellValue("Not Matched");
    testRowOfCell=testdataSheetRow.createCell(20);
    testRowOfCell.setCellValue("Failed Navigated to OrangeHRM Application personal Details Page - Fail");
    }

   
  By firstname1Property=By.id("personal_txtEmpFirstName");
	WebElement firstname1 =driver.findElement(firstname1Property);
  String actual_FirstnameText =firstname1.getAttribute("value");
	System.out.println(actual_FirstnameText);

 if(actual_FirstnameText.equals(expected_FirstnameText))
 {
	 System.out.println("successfully matched first name text:-PASS");
	 testRowOfCell=testdataSheetRow.createCell(21);
	 testRowOfCell.setCellValue(actual_FirstnameText);
	 testRowOfCell=testdataSheetRow.createCell(22);
	 testRowOfCell.setCellValue("Matched");
 }
 else
 {
	 System.out.println("Failed to  match first name text:-FAIL");
	 testRowOfCell=testdataSheetRow.createCell(21);
	 testRowOfCell.setCellValue(actual_FirstnameText);
	 testRowOfCell=testdataSheetRow.createCell(22);
	 testRowOfCell.setCellValue(" Not Matched");
 
 }
 

 By middlename1Property=By.id("personal_txtEmpMiddleName");
	WebElement middlename1 =driver.findElement(middlename1Property);
 String actual_middlenameText =middlename1.getAttribute("value");
System.out.println(actual_middlenameText);

if(actual_middlenameText.equals(expected_middleNameTestData))
{

	 System.out.println("successfully matched middle name text:-PASS");
	 testRowOfCell=testdataSheetRow.createCell(23);
	 testRowOfCell.setCellValue(actual_middlenameText);
	 testRowOfCell=testdataSheetRow.createCell(24);
	 testRowOfCell.setCellValue("Matched");
}
else
{

	 System.out.println("Failed to  match middle name text:-FAIL");
	 testRowOfCell=testdataSheetRow.createCell(23);
	 testRowOfCell.setCellValue(actual_middlenameText);
	 testRowOfCell=testdataSheetRow.createCell(24);
	 testRowOfCell.setCellValue(" Not Matched");
}

By lastname1Property=By.id("personal_txtEmpLastName");
WebElement lastname1 =driver.findElement(lastname1Property);
String actual_lastnameText =lastname1.getAttribute("value");
System.out.println(actual_lastnameText);

if(actual_lastnameText.equals(expected_lastNameTestData))
{
	System.out.println("successfully matched last name text:-PASS");
	 testRowOfCell=testdataSheetRow.createCell(25);
	 testRowOfCell.setCellValue(actual_lastnameText);
	 testRowOfCell=testdataSheetRow.createCell(26);
	 testRowOfCell.setCellValue("Matched");
}
else
{

	 System.out.println("Failed to  match last name text:-FAIL");
	 testRowOfCell=testdataSheetRow.createCell(25);
	 testRowOfCell.setCellValue(actual_lastnameText);
	 testRowOfCell=testdataSheetRow.createCell(26);
	 testRowOfCell.setCellValue(" Not Matched");
}

By employeeIdProperty2 = By.name("personal[txtEmployeeId]");
WebElement employeeId2 = driver.findElement(employeeIdProperty2);

 String actual_employeeIdText1 = employeeId2.getAttribute("value");
 
if(actual_employeeIdText1.equals(expected_employeeIdText))
{
	System.out.println("successfully matched employee Id:-PASS");
	 testRowOfCell=testdataSheetRow.createCell(27);
	 testRowOfCell.setCellValue(actual_employeeIdText1);
	 testRowOfCell=testdataSheetRow.createCell(28);
	 testRowOfCell.setCellValue("Matched");
}
else
{
	 System.out.println("Failed to  match employee Id:-FAIL");
	 testRowOfCell=testdataSheetRow.createCell(27);
	 testRowOfCell.setCellValue(actual_employeeIdText1);
	 testRowOfCell=testdataSheetRow.createCell(28);
	 testRowOfCell.setCellValue(" Not Matched");
	 }
	 


 welcomeAdmintestdatacell=testdataSheetRow.getCell(8);
 welcomeAdmin= welcomeAdmintestdatacell.getStringCellValue();
   expected_welcomeAdmin=welcomeAdmin;
  System.out.println("The expected orangehrm application welcome admin link is:-"+expected_welcomeAdmin);
  welcomeadminProperty=By.id("welcome");
  welcomeadmin=driver.findElement(welcomeadminProperty);
  welcomeadmin.click();
	
	Thread.sleep(2000);
	
	By logoutProperty=By.linkText("Logout");
	WebElement logout=driver.findElement(logoutProperty);
	logout.click();

	 logInPanelTestDataCell=testdataSheetRow.getCell(29);
     logInPanelTestData= logInPanelTestDataCell.getStringCellValue();//Getting loginpanel
    
	 expected_OrangeHRMApplicationLoginPanel=logInPanelTestData;
	System.out.println("The expected orangeHRM application login panel text is:-"+expected_OrangeHRMApplicationLoginPanel);
	      //<div id="logInPanelHeading">LOGIN Panel</div>
    loginpanelProperty=By.id("logInPanelHeading");
     loginpanelText=driver.findElement(loginpanelProperty);
      
     actual_OrangeHRMApplicationLoginPanel=loginpanelText.getText();
    System.out.println("The actual orangeHRM application login panel text is:-"+actual_OrangeHRMApplicationLoginPanel);
    if(actual_OrangeHRMApplicationLoginPanel.equals(expected_OrangeHRMApplicationLoginPanel))
    {
    System.out.println("Successfully navigated to orangehrm application login page after logout:-PASS");
    testRowOfCell=testdataSheetRow.createCell(30);
    testRowOfCell.setCellValue("LOGIN Panel");
    testRowOfCell=testdataSheetRow.createCell(31);
    testRowOfCell.setCellValue("Successfully navigated to orangehrm application login page after logout :-PASS");
    }
    else
    {
    System.out.println("Failed to navigate to orangehrm application login page after logout:-FAIL");
   	 testRowOfCell=testdataSheetRow.createCell(30);
    testRowOfCell.setCellValue("Not Matched");
    testRowOfCell=testdataSheetRow.createCell(31);
    testRowOfCell.setCellValue("Failed to navigate to orangehrm application login page after logout:-FAIL");
    }
    System.out.println("close the application");
	driver.close();
	
	FileOutputStream testResultFile=new FileOutputStream("./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult.xlsx");
    workbook.write(testResultFile);
	}
	}}

	
	
//<label class="hasTopFieldHelp">Full Name</label>


	

