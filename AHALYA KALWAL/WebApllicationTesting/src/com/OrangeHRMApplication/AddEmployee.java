package com.OrangeHRMApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.util.Log;

public class AddEmployee extends LoginFunctionality {
	FileInputStream loginTestDataFile;
	XSSFWorkbook workbook;
	XSSFSheet logintestdataSheet;
	Row rowtestdata;
	Cell testRowOfCell;

	
	@Test(priority = 2,description="Validating OrangeHRMApplication Add Employee Test")
	public void addEmployeeTest() throws IOException, InterruptedException {
		By pimProperty = By.id("menu_pim_viewPimModule");
		WebElement pim = driver.findElement(pimProperty);

		Actions mouseHoverOperation = new Actions(driver);
		mouseHoverOperation.moveToElement(pim).build().perform();
	

		loginTestDataFile = new FileInputStream("./src/com/Excelsheet/PIM_MultipleTestData.xlsx");
		workbook = new XSSFWorkbook(loginTestDataFile);
		logintestdataSheet = workbook.getSheet("PIM2");
		Row rowtestdata = logintestdataSheet.getRow(2);
	By  AddEmployeeProperty= By.linkText("Add Employee");
	WebElement AddEmployee=driver.findElement(AddEmployeeProperty);
	AddEmployee.click();
    Cell firstNameTestDataCell=rowtestdata.getCell(14);
	String expected_FirstnameText=firstNameTestDataCell.getStringCellValue();
	By firstNameProperty=By.name("firstName");
	WebElement firstName=driver.findElement(firstNameProperty);
	firstName.sendKeys(expected_FirstnameText);

	Cell middleNameTestDataCell=rowtestdata.getCell(15);
	String expected_middleNameTestData=middleNameTestDataCell.getStringCellValue();
	By middleNameProperty=By.id("middleName");
	WebElement middleName=driver.findElement(middleNameProperty);
	middleName.sendKeys(expected_middleNameTestData);

	Cell lastNameTestDataCell=rowtestdata.getCell(16);
	String expected_lastNameTestData=lastNameTestDataCell.getStringCellValue();
	By lastNameProperty=By.name("lastName");
	WebElement lastName=driver.findElement(lastNameProperty);
	lastName.sendKeys(expected_lastNameTestData);
	  
	 // <input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0002" id="employeeId"> 

	By employeeIdProperty = By.name("employeeId");
	WebElement employeeId = driver.findElement(employeeIdProperty);

	String expected_employeeIdText = employeeId.getAttribute("value");
	System.out.println("The text of the webelement employee id is: " +expected_employeeIdText );
	Cell testRowOfCell=rowtestdata.createCell(17);
	testRowOfCell.setCellValue(expected_employeeIdText);

//		<input type="button" class="" id="btnSave" value="Save">
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
     //  <label class="hasTopFieldHelp">Full Name</label>
	    Cell FullNamecell = rowtestdata.getCell(11);
		String expectedpersonaldetailsTestData = FullNamecell.getStringCellValue();// Getting personal details
		// String Expected_personaldetailstextName=personaldetailsTestData;
		Log.info(" The Expected Text of the OrangeHRM Application personal Details Page is :- "
				+ expectedpersonaldetailsTestData);
		// WebElement headingElement1 =
		// driver.findElement(By.xpath("//h1[text()='Personal Details']"));
		// /html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/label
		// By fullnameproperty =By.className("hasTopFieldHelp");
		By fullnameproperty = By.className("hasTopFieldHelp");
		WebElement fullnametext = driver.findElement(fullnameproperty);
		String actual_personaldetailstext = fullnametext.getText();
		Log.info(actual_personaldetailstext);
		Log.info(" The Actual Text of the OrangeHRM Application personal Details Page is :- "
				+ actual_personaldetailstext);

		
		if (actual_personaldetailstext.contains(expectedpersonaldetailsTestData)) {

			Log.info(" Successfully Navigated to OrangeHRM Application personal Details Page - PASS ");
			testRowOfCell = rowtestdata.createCell(12);
			testRowOfCell.setCellValue(actual_personaldetailstext);
			testRowOfCell = rowtestdata.createCell(13);
			testRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application personal Details  Page - PASS ");
		} else {

			Log.info("Failed to navigate to orangehrm application personal Details page:- FAIL");
			testRowOfCell = rowtestdata.createCell(12);
			testRowOfCell.setCellValue("Not Matched");
			testRowOfCell = rowtestdata.createCell(13);
			testRowOfCell.setCellValue("Failed Navigated to OrangeHRM Application personal Details Page - Fail");
		}

	//	<input value="Ahalya" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
	  By firstname1Property=By.id("personal_txtEmpFirstName");
		WebElement firstname1 =driver.findElement(firstname1Property);
	  String actual_FirstnameText =firstname1.getAttribute("value");
		Log.info(actual_FirstnameText);

	 if(actual_FirstnameText.equals(expected_FirstnameText))
	 {
		 Log.info("successfully matched first name text:-PASS");
		 testRowOfCell=rowtestdata.createCell(21);
		 testRowOfCell.setCellValue(actual_FirstnameText);
		 testRowOfCell=rowtestdata.createCell(22);
		 testRowOfCell.setCellValue("Matched");
	 }
	 else
	 {
		 Log.info("Failed to  match First name text:-FAIL");
		 testRowOfCell=rowtestdata.createCell(21);
		 testRowOfCell.setCellValue(actual_FirstnameText);
		 testRowOfCell=rowtestdata.createCell(22);
		 testRowOfCell.setCellValue(" Not Matched");
	 
	 }
	 

	 By middlename1Property=By.id("personal_txtEmpMiddleName");
		WebElement middlename1 =driver.findElement(middlename1Property);
	 String actual_middlenameText =middlename1.getAttribute("value");
	Log.info(actual_middlenameText);

	if(actual_middlenameText.equals(expected_middleNameTestData))
	{

		Log.info("successfully matched middle name text:-PASS");
		 testRowOfCell=rowtestdata.createCell(23);
		 testRowOfCell.setCellValue(actual_middlenameText);
		 testRowOfCell=rowtestdata.createCell(24);
		 testRowOfCell.setCellValue("Matched");
	}
	else
	{

		Log.info("Failed to  match middle name text:-FAIL");
		 testRowOfCell=rowtestdata.createCell(23);
		 testRowOfCell.setCellValue(actual_middlenameText);
		 testRowOfCell=rowtestdata.createCell(24);
		 testRowOfCell.setCellValue(" Not Matched");
	}

	By lastname1Property=By.id("personal_txtEmpLastName");
	WebElement lastname1 =driver.findElement(lastname1Property);
	String actual_lastnameText =lastname1.getAttribute("value");
	Log.info(actual_lastnameText);

	if(actual_lastnameText.equals(expected_lastNameTestData))
	{
		Log.info("successfully matched last name text:-PASS");
		 testRowOfCell=rowtestdata.createCell(25);
		 testRowOfCell.setCellValue(actual_lastnameText);
		 testRowOfCell=rowtestdata.createCell(26);
		 testRowOfCell.setCellValue("Matched");
	}
	else
	{

		Log.info("Failed to  match last name text:-FAIL");
		 testRowOfCell=rowtestdata.createCell(25);
		 testRowOfCell.setCellValue(actual_lastnameText);
		 testRowOfCell=rowtestdata.createCell(26);
		 testRowOfCell.setCellValue(" Not Matched");
	}
//	<input value="0255" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
	By employeeIdProperty2 = By.name("personal[txtEmployeeId]");
	WebElement employeeId2 = driver.findElement(employeeIdProperty2);

	 String actual_employeeIdText1 = employeeId2.getAttribute("value");
	 
	if(actual_employeeIdText1.equals(expected_employeeIdText))
	{
		Log.info("successfully matched employee Id:-PASS");
		 testRowOfCell=rowtestdata.createCell(27);
		 testRowOfCell.setCellValue(actual_employeeIdText1);
		 testRowOfCell=rowtestdata.createCell(28);
		 testRowOfCell.setCellValue("Matched");
	}
	else
	{
		Log.info("Failed to  match employee Id:-FAIL");
		 testRowOfCell=rowtestdata.createCell(27);
		 testRowOfCell.setCellValue(actual_employeeIdText1);
		 testRowOfCell=rowtestdata.createCell(28);
		 testRowOfCell.setCellValue(" Not Matched");
		 }
		 


	/*Cell welcomeAdmintestdatacell=rowtestdata.getCell(8);
	String welcomeAdmin= welcomeAdmintestdatacell.getStringCellValue();
	String   expected_welcomeAdmin=welcomeAdmin;
	  System.out.println("The expected orangehrm application welcome admin link is:-"+expected_welcomeAdmin);
	 By welcomeadminProperty=By.id("welcome");
	 WebElement welcomeadmin=driver.findElement(welcomeadminProperty);
	  welcomeadmin.click();
		
		Thread.sleep(2000);
		
		By logoutProperty=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutProperty);
		logout.click();

		Cell logInPanelTestDataCell=rowtestdata.getCell(29);
	   String  logInPanelTestData= logInPanelTestDataCell.getStringCellValue();//Getting loginpanel
	    
	String	 expected_OrangeHRMApplicationLoginPanel=logInPanelTestData;
		System.out.println("The expected orangeHRM application login panel text is:-"+expected_OrangeHRMApplicationLoginPanel);
		      //<div id="logInPanelHeading">LOGIN Panel</div>
	 By   loginpanelProperty=By.id("logInPanelHeading");
	   WebElement  loginpanelText=driver.findElement(loginpanelProperty);
	      
	   String  actual_OrangeHRMApplicationLoginPanel=loginpanelText.getText();
	    System.out.println("The actual orangeHRM application login panel text is:-"+actual_OrangeHRMApplicationLoginPanel);
	    if(actual_OrangeHRMApplicationLoginPanel.equals(expected_OrangeHRMApplicationLoginPanel))
	    {
	    System.out.println("Successfully navigated to orangehrm application login page after logout:-PASS");
	    testRowOfCell=rowtestdata.createCell(30);
	    testRowOfCell.setCellValue("LOGIN Panel");
	    testRowOfCell=rowtestdata.createCell(31);
	    testRowOfCell.setCellValue("Successfully navigated to orangehrm application login page after logout :-PASS");
	    }
	    else
	    {
	    System.out.println("Failed to navigate to orangehrm application login page after logout:-FAIL");
	   	 testRowOfCell=rowtestdata.createCell(30);
	    testRowOfCell.setCellValue("Not Matched");
	    testRowOfCell=rowtestdata.createCell(31);
	    testRowOfCell.setCellValue("Failed to navigate to orangehrm application login page after logout:-FAIL");
	    }
	    */
	}
}




