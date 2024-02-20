package com.OrangeHRMApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.util.Log;

public class LoginFunctionality extends BaseTest {
	FileInputStream loginTestDataFile;
	XSSFWorkbook workbook;
	XSSFSheet logintestdataSheet;
	Row rowtestdata;

	@Test(priority = 1,description="Validating OrangehrmApplication home page")
	public void loginFunctionality() throws IOException {

		FileInputStream loginTestDataFile=new FileInputStream("./src/com/Excelsheet/PIM_MultipleTestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
		XSSFSheet logintestdataSheet=workbook.getSheet("PIM2");

		//int rowcount=logintestdataSheet.getLastRowNum();
		//for(int rowIndex=2;rowIndex<=rowcount;rowIndex++)
		
		Row	testdataSheetRow=logintestdataSheet.getRow(2);
		Cell userNameTestDataCell=testdataSheetRow.getCell(6);
		String userNameTestData=userNameTestDataCell.getStringCellValue();//Getting Username
	    Cell passwordTestDataCell=testdataSheetRow.getCell(7);
	    String passwordTestData= passwordTestDataCell.getStringCellValue();// Getting password
	    
	    Cell logInPanelTestDataCell=testdataSheetRow.getCell(0);
	    String logInPanelTestData= logInPanelTestDataCell.getStringCellValue();//Getting loginpanel
	    
		String expected_OrangeHRMApplicationLoginPanel=logInPanelTestData;
		//System.out.println("The expected orangeHRM application login panel text is:-"+expected_OrangeHRMApplicationLoginPanel);
		 Log.info("The expected orangeHRM application login panel text is:-"+expected_OrangeHRMApplicationLoginPanel); 
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
	    By loginpanelProperty=By.id("logInPanelHeading");
	    WebElement loginpanelText=driver.findElement(loginpanelProperty);
	      
	    String  actual_OrangeHRMApplicationLoginPanel=loginpanelText.getText();
	    Log.info("The actual orangeHRM application login panel text is:-"+actual_OrangeHRMApplicationLoginPanel);
	    if(actual_OrangeHRMApplicationLoginPanel.equals(expected_OrangeHRMApplicationLoginPanel))
	    {
	    Log.info("Successfully navigated to orangehrm application login page text:-PASS");
	    Cell testRowOfCell=testdataSheetRow.createCell(1);
	    testRowOfCell.setCellValue("LOGIN Panel");
	     testRowOfCell=testdataSheetRow.createCell(2);
	    testRowOfCell.setCellValue("Successfully navigated to orangehrm application login page text:-PASS");
	    }
	    else
	    {
	    Log.info("Failed to navigate to orangehrm application login page text:-FAIL");
	   	Cell testRowOfCell=testdataSheetRow.createCell(1);
	    testRowOfCell.setCellValue("Not Matched");
	    }

	    FileInputStream	propertiesFile = new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");

		Properties properties = new Properties();
		properties.load(propertiesFile);

	    By usernameProperty=By.id(properties.getProperty("orangeHRMLogInPageUserNameProperty"));	
	    WebElement username=driver.findElement(usernameProperty);
	    username.sendKeys(userNameTestData);

	        By passwordProperty=By.id(properties.getProperty("orangeHRMLogInPagePasswordProperty"));
	        WebElement password= driver.findElement(passwordProperty);
	        password.sendKeys(passwordTestData);
	        
//	    	<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">  
	  By	loginInButtonProperty=By.className(properties.getProperty("orangeHRMLogInPageLogInButtonProperty"));
	  WebElement loginInButton= driver.findElement(loginInButtonProperty);
	  loginInButton.click();
	  
	 Cell welcomeAdmintestdatacell=testdataSheetRow.getCell(8);
	String welcomeAdmin= welcomeAdmintestdatacell.getStringCellValue();
	  String expected_welcomeAdmin=welcomeAdmin;
	  Log.info("The expected orangehrm application welcome admin link is:-"+expected_welcomeAdmin);
	  By welcomeadminProperty=By.id("welcome");
	  WebElement welcomeadmin=driver.findElement(welcomeadminProperty);
	  welcomeadmin.click();
	  
	  String actual_welcomeAdmin=welcomeadmin.getText();
	  Log.info(actual_welcomeAdmin);
	  Log.info("The actual orangehrm application welcome admin link is:-"+actual_welcomeAdmin);
	  if(actual_welcomeAdmin.contains(expected_welcomeAdmin))
	  {
		  Log.info("successfully matched with the welcome admin text:-PASS");
		  Cell testRowOfCell=testdataSheetRow.createCell(9);
		    testRowOfCell.setCellValue("Welcome");
		    testRowOfCell=testdataSheetRow.createCell(10);
		    testRowOfCell.setCellValue("successfully matched with the welcome admin text:-PASS");
	  }
	  else
	  {
		  Log.info("Failed to match with the welcome admin text:-FAIL");
		  Cell testRowOfCell=testdataSheetRow.createCell(9);
		    testRowOfCell.setCellValue("Welcome");
		    testRowOfCell.setCellValue("Not Matched");
	    }
	}
	}