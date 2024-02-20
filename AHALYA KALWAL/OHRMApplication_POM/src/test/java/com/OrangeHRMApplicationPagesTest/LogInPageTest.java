package com.OrangeHRMApplicationPagesTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.LogInPage;
import com.Utility.Log;

public class LogInPageTest extends BaseTest{
	@Test(priority=1,description="Validating orangehrm application loginPannel Text")
	public void orangeHRMApplicationLogInPage_logInPannelTextValidationTest()
	{
		LogInPage loginpage=new LogInPage();
		loginpage.orangeHRMApplicationLogInPage_logInPannelTextValidation();
		
	}

	@Test(priority=2,description="Validating orangeHRM Application loginpage Logo ")
	public void orangeHRMApplicationLogInPage_logoValidationTest()
	{
		LogInPage loginpage=new LogInPage();
		loginpage.orangeHRMApplicationLogInPage_logoValidation();
	}
	
	@Test(priority=3,description="Validating orangeHRM Application login functionality ")
	public void orangeHRMApplicationLogInPage_LogInValidationTest() throws IOException, InterruptedException
	{
	//	LogInPage loginpage=new LogInPage();
	//	loginpage.orangeHRMApplicationLogInPage_LogInValidation("Ahalya","Ahalya@123");
		FileInputStream testdata = new FileInputStream("./src/main/java/com/OrangeHRMApplicationTestDataFiles/Multipledata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(testdata);
		XSSFSheet testdatasheet = workbook.getSheet("Sheet1");
		
	int	testdatarow=testdatasheet.getLastRowNum();
	for(int rowindex=1;rowindex<=testdatarow;rowindex++)
	{
		 
			Row dataRow = testdatasheet.getRow(rowindex);
			Cell usernamedata = dataRow.getCell(0);
			String username = usernamedata.getStringCellValue();
			Log.info("username data successfully passed - PASS");
			Cell passwordcell = dataRow.getCell(1);
			String passworddata = passwordcell.getStringCellValue();
			Log.info("password data successfully passed - PASS");
  
  LogInPage loginpage=new LogInPage();
  loginpage.orangeHRMApplicationLogInPage_LogInValidation (username,passworddata);
 
	}
		//FileOutputStream testdatafile=new FileOutputStream(".src/main/java/com/OrangeHRMApplicationTestResultFiles/multipletestdatafile.xlsx");
		//workbook.write(testdatafile); 
	}
	
	
	
	
}
