package com.OHRM_AddEmployee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployeeTestData extends BaseTest {

	FileInputStream loginTestDataFile;
	XSSFWorkbook workbook;
	XSSFSheet logintestdataSheet;
	Row rowtestdata;

	@Test(priority = 1)
	public void loginFunctionality() throws IOException {


		loginTestDataFile = new FileInputStream("./src/com/Excelsheet/PIM_MultipleTestData.xlsx");
		workbook = new XSSFWorkbook(loginTestDataFile);
		logintestdataSheet = workbook.getSheet("PIM2");
		Row rowtestdata = logintestdataSheet.getRow(2);

		Cell logInPanelTestDataCell = rowtestdata.getCell(0);
		String logInPanelTestData = logInPanelTestDataCell.getStringCellValue();

		String expected_OrangeHRMApplicationLoginPanel = logInPanelTestData;
		System.out.println(
				"The expected orangeHRM application login panel text is:-" + expected_OrangeHRMApplicationLoginPanel);
		// <div id="logInPanelHeading">LOGIN Panel</div>
		By loginpanelProperty = By.id("logInPanelHeading");
		WebElement loginpanelText = driver.findElement(loginpanelProperty);

		String actual_OrangeHRMApplicationLoginPanel = loginpanelText.getText();
		System.out.println(
				"The actual orangeHRM application login panel text is:-" + actual_OrangeHRMApplicationLoginPanel);
		if (actual_OrangeHRMApplicationLoginPanel.equals(expected_OrangeHRMApplicationLoginPanel)) {
			System.out.println("Successfully navigated to orangehrm application login page text:-PASS");
			Cell testRowOfCell = rowtestdata.createCell(1);
			testRowOfCell.setCellValue("LOGIN Panel");
			testRowOfCell = rowtestdata.createCell(2);
			testRowOfCell.setCellValue("Successfully navigated to orangehrm application login page text:-PASS");
		} else {
			System.out.println("Failed to navigate to orangehrm application login page text:-FAIL");
			Cell testRowOfCell = rowtestdata.createCell(1);
			testRowOfCell.setCellValue("Not Matched");
		}
		Cell orangehrmtitleTestDataCell = rowtestdata.getCell(3);
		String orangehrmTestData = orangehrmtitleTestDataCell.getStringCellValue();
		String expected_OrangeHRMApplicationLoginPageTitle = orangehrmTestData;
		System.out.println("The expected orangeHRM Application login page title is :-"+ expected_OrangeHRMApplicationLoginPageTitle);
		String actual_OrangeHRMApplicationLoginPageTitle = driver.getTitle();
		System.out.println("The actual orangeHRM Application login page title is :-" + actual_OrangeHRMApplicationLoginPageTitle);

		if (actual_OrangeHRMApplicationLoginPageTitle.equals(expected_OrangeHRMApplicationLoginPageTitle)) {
			System.out.println("succesfully navigated to login page Title-PASS");
			Cell testRowOfCell = rowtestdata.createCell(4);
			testRowOfCell.setCellValue(actual_OrangeHRMApplicationLoginPageTitle);
			testRowOfCell = rowtestdata.createCell(5);
			testRowOfCell.setCellValue("Successfully navigated to orangehrm application login page text:-PASS");
		}
		else
		{
			System.out.println("Failed to navigate to login page Title-FAIL");
			Cell testRowOfCell = rowtestdata.createCell(4);
			testRowOfCell.setCellValue(actual_OrangeHRMApplicationLoginPageTitle);
			testRowOfCell = rowtestdata.createCell(5);
			System.out.println("Failed to navigate to login page Title-FAIL");
		}

		rowtestdata = logintestdataSheet.getRow(2);
		Cell userNameTestDataCell = rowtestdata.getCell(6);
		String userNameTestData = userNameTestDataCell.getStringCellValue();

		By usernameProperty = By.id("txtUsername");
		WebElement username = driver.findElement(usernameProperty);
		username.sendKeys(userNameTestData);
		Cell passwordTestDataCell = rowtestdata.getCell(7);
		String passwordTestData = passwordTestDataCell.getStringCellValue();
		By passwordProperty = By.id("txtPassword");
		WebElement password = driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);

		//    	<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By loginInButtonProperty = By.className("button");
		WebElement loginInButton = driver.findElement(loginInButtonProperty);
		loginInButton.click();

		Cell welcomeAdmintestdatacell = rowtestdata.getCell(8);
		String welcomeAdmin = welcomeAdmintestdatacell.getStringCellValue();
		String expected_welcomeAdmin = welcomeAdmin;
		System.out.println("The expected orangehrm application welcome admin link is:-" + expected_welcomeAdmin);
		By welcomeadminProperty = By.id("welcome");
		WebElement welcomeadmin = driver.findElement(welcomeadminProperty);

		String actual_welcomeAdmin = welcomeadmin.getText();
		System.out.println("The actual orangehrm application welcome admin link is:-" + actual_welcomeAdmin);
		if (actual_welcomeAdmin.contains(expected_welcomeAdmin)) {
			System.out.println("successfully matched with the welcome admin text:-PASS");
			Cell testRowOfCell = rowtestdata.createCell(9);
			testRowOfCell.setCellValue("Welcome");
			testRowOfCell = rowtestdata.createCell(10);
			testRowOfCell.setCellValue("successfully matched with the welcome admin text:-PASS");
		} else {
			System.out.println("Failed to match with the welcome admin text:-FAIL");
			Cell testRowOfCell = rowtestdata.createCell(9);
			testRowOfCell.setCellValue("Welcome");
			testRowOfCell.setCellValue("Not Matched");
		}

		//FileOutputStream testResultFile = new FileOutputStream(
		//		"./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult.xlsx");
		//workbook.write(testResultFile);


	}

	@Test(priority = 2)
	public void pimTest() {
		By pimProperty = By.id("menu_pim_viewPimModule");
		WebElement pim = driver.findElement(pimProperty);

		Actions mouseHoverOperation = new Actions(driver);
		mouseHoverOperation.moveToElement(pim).build().perform();
	}

	@Test(priority = 3)
	public void addEmployeeTest() throws IOException {
		By AddEmployeeProperty = By.linkText("Add Employee");
		WebElement AddEmployee = driver.findElement(AddEmployeeProperty);
		AddEmployee.click();


		/*FileInputStream loginTestDataFile = new FileInputStream("./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(loginTestDataFile);
			XSSFSheet logintestdataSheet = workbook.getSheet("PIM2");
	Row rowtestdata = logintestdataSheet.getRow(2);
		 */
		// <label for="Full_Name" class="hasTopFieldHelp">Full Name</label>
		Cell FullNamecell = rowtestdata.getCell(11);
		String expectedpersonaldetailsTestData = FullNamecell.getStringCellValue();// Getting personal details
		// String Expected_personaldetailstextName=personaldetailsTestData;
		System.out.println(" The Expected Text of the OrangeHRM Application personal Details Page is :- "
				+ expectedpersonaldetailsTestData);
		// WebElement headingElement1 =
		// driver.findElement(By.xpath("//h1[text()='Personal Details']"));
		// /html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/label
		// By fullnameproperty =By.className("hasTopFieldHelp");
		By fullnameproperty = By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/label");
		WebElement fullnametext = driver.findElement(fullnameproperty);
		String actual_personaldetailstext = fullnametext.getText();
		System.out.println(actual_personaldetailstext);
		System.out.println(" The Actual Text of the OrangeHRM Application personal Details Page is :- "
				+ actual_personaldetailstext);

		Cell testRowOfCell;
		if (actual_personaldetailstext.contains(expectedpersonaldetailsTestData)) {

			System.out.println(" Successfully Navigated to OrangeHRM Application personal Details Page - PASS ");
			testRowOfCell = rowtestdata.createCell(12);
			testRowOfCell.setCellValue(actual_personaldetailstext);
			testRowOfCell = rowtestdata.createCell(13);
			testRowOfCell
			.setCellValue("Successfully Navigated to OrangeHRM Application personal Details  Page - PASS ");
		} else {

			System.out.println("Failed to navigate to orangehrm application personal Details page:- FAIL");
			testRowOfCell = rowtestdata.createCell(12);
			testRowOfCell.setCellValue("Not Matched");
			testRowOfCell = rowtestdata.createCell(13);
			testRowOfCell.setCellValue("Failed Navigated to OrangeHRM Application personal Details Page - Fail");
		}
		/*FileOutputStream testResultFile = new FileOutputStream(
					"./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult1.xlsx");
			workbook.write(testResultFile);
		 */
	}







	@Test(priority = 4)
	public void addNewEmployeeTest() throws IOException, InterruptedException {
		/*	FileInputStream loginTestDataFile = new FileInputStream("./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(loginTestDataFile);
		XSSFSheet logintestdataSheet = workbook.getSheet("PIM2");
		 */
		int rowcount = logintestdataSheet.getLastRowNum();
		for (int rowindex = 2; rowindex <= rowcount; rowindex++) {

			Row rowtestdata = logintestdataSheet.getRow(rowindex);
			Cell FirstNameTestDataCell = rowtestdata.getCell(14);
			String expected_FirstName = FirstNameTestDataCell.getStringCellValue();
			Cell MiddleNameTestDataCell = rowtestdata.getCell(15);
			String expected_MiddleName = MiddleNameTestDataCell.getStringCellValue();
			Cell LastNameTestDataCell = rowtestdata.getCell(16);
			String expected_LastName = LastNameTestDataCell.getStringCellValue();

			By firstNameProperty = By.name("firstName");
			WebElement firstName = driver.findElement(firstNameProperty);
			firstName.sendKeys(expected_FirstName);
			By middleNameProperty = By.id("middleName");
			WebElement middleName = driver.findElement(middleNameProperty);
			middleName.sendKeys(expected_MiddleName);

			By lastNameProperty = By.name("lastName");
			WebElement lastName = driver.findElement(lastNameProperty);
			lastName.sendKeys(expected_LastName);

			By employeeIdProperty = By.name("employeeId");
			WebElement employeeId = driver.findElement(employeeIdProperty);

			String expected_employeeIdText = employeeId.getAttribute("value");
			System.out.println("The text of the webelement employee id is: " + expected_employeeIdText);
			Cell testRowOfCell = rowtestdata.createCell(17);
			testRowOfCell.setCellValue(expected_employeeIdText);

			By saveButtonProperty = By.id("btnSave");
			WebElement saveButton = driver.findElement(saveButtonProperty);
			saveButton.click();
			Thread.sleep(3000);

			//personal_txtEmpFirstName


			String expected_firstNameTestData = expected_FirstName;
			By firstNameProperty2 = By.id("personal_txtEmpFirstName");
			WebElement firstNameElement = driver.findElement(firstNameProperty2);
			String Actual_firstNameValue = firstNameElement.getAttribute("value");
			System.out.println(Actual_firstNameValue);
			System.out.println(Actual_firstNameValue);
			System.out.println("The Actual value of the first name is: " + Actual_firstNameValue);

			if (Actual_firstNameValue.equals(expected_firstNameTestData)) {
				System.out.println("The Employee First Name Is Matched :-Pass");
				Cell FirstNameCell = rowtestdata.createCell(21);
				FirstNameCell.setCellValue(Actual_firstNameValue);
				Cell FirstNameRowOfCell = rowtestdata.createCell(22);
				FirstNameRowOfCell.setCellValue("The Employee First Name Is Matched :-Pass");

			} else {
				System.out.println("The Employee First Name Is Not Matched :-Fail");
				Cell FirstNameCell = rowtestdata.createCell(21);
				FirstNameCell.setCellValue(Actual_firstNameValue);
				Cell FirstNameRowOfCell = rowtestdata.createCell(22);
				FirstNameRowOfCell.setCellValue("The Employee First Name Is Not Matched :-FAIL");

			}



			By middlename1Property = By.id("personal_txtEmpMiddleName");
			WebElement middlename1 = driver.findElement(middlename1Property);
			String actual_middlenameText = middlename1.getAttribute("value");
			System.out.println(actual_middlenameText);

			if (actual_middlenameText.equals(expected_MiddleName)) {

				System.out.println("successfully matched middle name text:-PASS");
				testRowOfCell = rowtestdata.createCell(23);
				testRowOfCell.setCellValue(actual_middlenameText);
				testRowOfCell = rowtestdata.createCell(24);
				testRowOfCell.setCellValue("Matched");
			} else {

				System.out.println("Failed to  match middle name text:-FAIL");
				testRowOfCell = rowtestdata.createCell(23);
				testRowOfCell.setCellValue(actual_middlenameText);
				testRowOfCell = rowtestdata.createCell(24);
				testRowOfCell.setCellValue(" Not Matched");
			}
			By lastname1Property = By.id("personal_txtEmpLastName");
			WebElement lastname1 = driver.findElement(lastname1Property);
			String actual_lastnameText = lastname1.getAttribute("value");
			System.out.println(actual_lastnameText);

			if (actual_lastnameText.equals(expected_LastName)) {
				System.out.println("successfully matched last name text:-PASS");
				testRowOfCell = rowtestdata.createCell(25);
				testRowOfCell.setCellValue(actual_lastnameText);
				testRowOfCell = rowtestdata.createCell(26);
				testRowOfCell.setCellValue("Matched");
			} else {

				System.out.println("Failed to  match last name text:-FAIL");
				testRowOfCell = rowtestdata.createCell(25);
				testRowOfCell.setCellValue(actual_lastnameText);
				testRowOfCell = rowtestdata.createCell(26);
				testRowOfCell.setCellValue(" Not Matched");
			}

			By employeeIdProperty2 = By.name("personal[txtEmployeeId]");
			WebElement employeeId2 = driver.findElement(employeeIdProperty2);

			String actual_employeeIdText1 = employeeId2.getAttribute("value");

			if (actual_employeeIdText1.equals(expected_employeeIdText)) {
				System.out.println("successfully matched employee Id:-PASS");
				testRowOfCell = rowtestdata.createCell(27);
				testRowOfCell.setCellValue(actual_employeeIdText1);
				testRowOfCell = rowtestdata.createCell(28);
				testRowOfCell.setCellValue("Matched");
			} else {
				System.out.println("Failed to  match employee Id:-FAIL");
				testRowOfCell = rowtestdata.createCell(27);
				testRowOfCell.setCellValue(actual_employeeIdText1);
				testRowOfCell = rowtestdata.createCell(28);
				testRowOfCell.setCellValue(" Not Matched");
			}
			Thread.sleep(2000);
			driver.navigate().back();

			driver.navigate().refresh();
			/*FileOutputStream testResultFile = new FileOutputStream(
					"./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult2.xlsx");
			workbook.write(testResultFile);
			 */
		}

	}

	@Test(priority = 5)
	public void fullname() throws IOException {
		/*FileInputStream loginTestDataFile = new FileInputStream("./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(loginTestDataFile);
		XSSFSheet logintestdataSheet = workbook.getSheet("PIM2");
		Row rowtestdata = logintestdataSheet.getRow(2);
		 */
		// <label for="Full_Name" class="hasTopFieldHelp">Full Name</label>
		Cell FullNamecell = rowtestdata.getCell(18);
		String expectedpersonaldetailsTestData = FullNamecell.getStringCellValue();// Getting personal details
		// String Expected_personaldetailstextName=personaldetailsTestData;
		System.out.println(" The Expected Text of the OrangeHRM Application personal Details Page is :- "
				+ expectedpersonaldetailsTestData);
		// WebElement headingElement1 =
		// driver.findElement(By.xpath("//h1[text()='Personal Details']"));
		// /html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[1]/label
		// By fullnameproperty =By.className("hasTopFieldHelp");
		By  fullnameProperty= By.className("hasTopFieldHelp");
		WebElement PersonalheadingElement = driver.findElement(fullnameProperty);
		String	actual_personaldetailstext=PersonalheadingElement.getText();
		System.out.println(actual_personaldetailstext);
		System.out.println(" The Actual Text of the OrangeHRM Application personal Details Page is :- "
				+ actual_personaldetailstext);

		Cell testRowOfCell;
		if (actual_personaldetailstext.contains(expectedpersonaldetailsTestData)) {

			System.out.println(" Successfully Navigated to OrangeHRM Application personal Details Page - PASS ");
			testRowOfCell = rowtestdata.createCell(19);
			testRowOfCell.setCellValue(actual_personaldetailstext);
			testRowOfCell = rowtestdata.createCell(20);
			testRowOfCell
			.setCellValue("Successfully Navigated to OrangeHRM Application personal Details  Page - PASS ");
		} else {

			System.out.println("Failed to navigate to orangehrm application personal Details page:- FAIL");
			testRowOfCell = rowtestdata.createCell(19);
			testRowOfCell.setCellValue("Not Matched");
			testRowOfCell = rowtestdata.createCell(20);
			testRowOfCell.setCellValue("Failed Navigated to OrangeHRM Application personal Details Page - Fail");
		}
		FileOutputStream testResultFile = new FileOutputStream(
				"./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult3.xlsx");
		workbook.write(testResultFile);
	}

	@Test(priority = 6)
	public void logout() throws IOException, InterruptedException {
		/*FileInputStream loginTestDataFile = new FileInputStream(
						"./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult3.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(loginTestDataFile);
		XSSFSheet logintestdataSheet = workbook.getSheet("PIM2");
		 */
		Row rowtestdata = logintestdataSheet.getRow(2);

		Cell welcomeAdmintestdatacell = rowtestdata.getCell(8);
		String welcomeAdmin = welcomeAdmintestdatacell.getStringCellValue();
		String expected_welcomeAdmin = welcomeAdmin;
		System.out.println("The expected orangehrm application welcome admin link is:-" + expected_welcomeAdmin);
		By welcomeadminProperty = By.id("welcome");
		WebElement welcomeadmin = driver.findElement(welcomeadminProperty);
		welcomeadmin.click();

		Thread.sleep(2000);

		By logoutProperty = By.linkText("Logout");
		WebElement logout = driver.findElement(logoutProperty);
		logout.click();

		//driver.navigate().refresh();
		/*FileOutputStream testResultFile = new FileOutputStream(
				"./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult4.xlsx");
		workbook.write(testResultFile);
		 */
	}

	@Test(priority = 7)
	public void loginpageafterLogout() throws IOException {
		/*FileInputStream loginTestDataFile = new FileInputStream("./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult4.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(loginTestDataFile);
		XSSFSheet logintestdataSheet = workbook.getSheet("PIM2");
		Row rowtestdata = logintestdataSheet.getRow(2);
		 */
		Cell logInPanelTestDataCell = rowtestdata.getCell(29);
		String logInPanelTestData = logInPanelTestDataCell.getStringCellValue();// Getting loginpanel

		String expected_OrangeHRMApplicationLoginPanel = logInPanelTestData;
		System.out.println(
				"The expected orangeHRM application login panel text is:-" + expected_OrangeHRMApplicationLoginPanel);
		// <div id="logInPanelHeading">LOGIN Panel</div>
		By loginpanelProperty = By.id("logInPanelHeading");
		WebElement loginpanelText = driver.findElement(loginpanelProperty);

		String actual_OrangeHRMApplicationLoginPanel = loginpanelText.getText();
		System.out.println(
				"The actual orangeHRM application login panel text is:-" + actual_OrangeHRMApplicationLoginPanel);
		if (actual_OrangeHRMApplicationLoginPanel.equals(expected_OrangeHRMApplicationLoginPanel)) {
			System.out.println("Successfully navigated to orangehrm application login page after logout:-PASS");
			Cell testRowOfCell = rowtestdata.createCell(30);
			testRowOfCell.setCellValue("LOGIN Panel");
			testRowOfCell = rowtestdata.createCell(31);
			testRowOfCell
			.setCellValue("Successfully navigated to orangehrm application login page after logout :-PASS");
		} else {
			System.out.println("Failed to navigate to orangehrm application login page after logout:-FAIL");
			Cell testRowOfCell = rowtestdata.createCell(30);
			testRowOfCell.setCellValue("Not Matched");
			testRowOfCell = rowtestdata.createCell(31);
			testRowOfCell.setCellValue("Failed to navigate to orangehrm application login page after logout:-FAIL");
		}

		System.out.println("close the application");
		driver.close();


		//driver.navigate().refresh();
		FileOutputStream testResultFile = new FileOutputStream("./src/com/orangehrmexcelResultsfile/AddEmployeeMultipleTestDataResult0.xlsx");
		workbook.write(testResultFile);


	}}
