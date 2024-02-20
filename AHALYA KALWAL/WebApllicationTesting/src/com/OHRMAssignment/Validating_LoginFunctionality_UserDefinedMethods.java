package com.OHRMAssignment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

      public class Validating_LoginFunctionality_UserDefinedMethods {

	    WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		public void applicationLaunch()
		{
		
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		}
		
		public void loginfunctionality_screenshots() throws IOException, InterruptedException
		{
	FileInputStream loginTestDataFile=new FileInputStream("./src/com/Excelsheet/OHRM_invalid and valid Testdata.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
	XSSFSheet logintestdataSheet=workbook.getSheet("OHRM");
		
		
		
	//<div id="logInPanelHeading"> </div>
	//	<input name="txtUsername" id="txtUsername" type="text">
		
	//	<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
	//	<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	
	int rowcount=logintestdataSheet.getLastRowNum();
	for(int rowIndex=1;rowIndex<=rowcount;rowIndex++)
	{
	Row	testdataSheetRow=logintestdataSheet.getRow(rowIndex);
	Cell userNameTestDataCell=testdataSheetRow.getCell(4);
	
	String userNameTestData=userNameTestDataCell.getStringCellValue();
    Cell passwordTestDataCell=testdataSheetRow.getCell(5);
    String passwordTestData= passwordTestDataCell.getStringCellValue();
	
	String expected_OrangeHRMApplicationLoginPanel="LOGIN Panel";
	System.out.println("The expected orangeHRM application login panel text is:-"+expected_OrangeHRMApplicationLoginPanel);
	      //<div id="logInPanelHeading">LOGIN Panel</div>
    By loginpanelProperty=By.id("logInPanelHeading");
    WebElement loginpanelText=driver.findElement(loginpanelProperty);
      
    String  actual_OrangeHRMApplicationLoginPanel=loginpanelText.getText();
    System.out.println("The actual orangeHRM application login panel text is:-"+actual_OrangeHRMApplicationLoginPanel);
    if(actual_OrangeHRMApplicationLoginPanel.equals(expected_OrangeHRMApplicationLoginPanel))
    {
    System.out.println("Successfully navigated to orangehrm application login page text:-PASS");
    Cell testRowOfCell=testdataSheetRow.createCell(2);
    testRowOfCell.setCellValue("LOGIN Panel");
    }
    else
    {
    System.out.println("Failed to navigate to orangehrm application login page text:-FAIL");
   	Cell testRowOfCell=testdataSheetRow.createCell(2);
    testRowOfCell.setCellValue("Not Matched");
    }
    	
//	<input name="txtUsername" id="txtUsername" type="text">
	
	//	<input name="txtPassword" id="txtPassword" auto complete="off" type="password">
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
    
 // http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard
   
  String expected_OrangeHRMApplicationURL=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
  System.out.println("The expected orangeHRM application url  is:-"+expected_OrangeHRMApplicationURL);

String actual_OrangeHRMApplicationURL =driver.getCurrentUrl();
System.out.println("The actual orangeHRM application url is:-"+actual_OrangeHRMApplicationURL);
if(actual_OrangeHRMApplicationURL.equals(expected_OrangeHRMApplicationURL))
{
System.out.println("Successfully navigated to orangehrm application url:-PASS");
Cell testRowOfCell=testdataSheetRow.createCell(8);
testRowOfCell.setCellValue("successfully navigated to orangehrm application home page:-PASS");

//<a href="#" id="welcome" class="panelTrigger">Welcome Admin </a>
//<a href="#" id="welcome" class="panelTrigger">Welcome Admin </a>
           By welcomeAdminProperty=By.id("welcome");
           WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
           welcomeAdmin.click();
           testRowOfCell=testdataSheetRow.createCell(7);
           testRowOfCell.setCellValue("Welcome");
           Thread.sleep(3000);
         //  <a href="/ orange hrm -4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
    By logoutProperty= By.linkText("Logout");
    WebElement  logout=driver.findElement(logoutProperty);
    logout.click();
}
else
{
System.out.println("orangehrmapplication URL Address is not matched:-PASS");
Cell testRowOfCell=testdataSheetRow.createCell(3);
testRowOfCell.setCellValue("Failed to navigate to orangehrm application home page:-PASS");
testRowOfCell=testdataSheetRow.createCell(1);
testRowOfCell.setCellValue("Invalid Credentials");

File webPageScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(webPageScreenshot,new File("./ApplicationScreenshot/InvalidloginCredentialsScreenshot.png"));

}
    
expected_OrangeHRMApplicationLoginPanel="LOGIN Panel";
System.out.println("The expected orangeHRM application login panel text is:-"+expected_OrangeHRMApplicationLoginPanel);
//<div id="logInPanelHeading">LOGIN Panel</div>
 loginpanelProperty=By.id("logInPanelHeading");
 loginpanelText=driver.findElement(loginpanelProperty);
 actual_OrangeHRMApplicationLoginPanel=loginpanelText.getText();
System.out.println("The actual orangeHRM application login panel text is:-"+actual_OrangeHRMApplicationLoginPanel);
if(actual_OrangeHRMApplicationLoginPanel.equals(expected_OrangeHRMApplicationLoginPanel)){
System.out.println("Successfully navigated to orangehrm application login page text:-PASS");
Cell testRowOfCell=testdataSheetRow.createCell(11);
Cell testRowOfCells=testdataSheetRow.createCell(10);
testRowOfCell.setCellValue("Successfully navigated to orangehrm application Loginpage after logout:-PASS");
testRowOfCells.setCellValue("LOGIN Panel");}
else{
System.out.println("Failed to navigate to orangehrm application login page after logout :-FAIL");
Cell testRowOfCell=testdataSheetRow.createCell(11);
testRowOfCell.setCellValue("Failed to navigate to orangehrm applicataion login page after logout:-FAIL ");
testRowOfCell=testdataSheetRow.createCell(10);
testRowOfCell.setCellValue("Not Matched");}
	FileOutputStream testResultFile=new FileOutputStream("./src/com/orangehrmexcelResultsfile/loginTestResult.xlsx");
  workbook.write(testResultFile);}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Validating_LoginFunctionality_UserDefinedMethods ohrm=new Validating_LoginFunctionality_UserDefinedMethods();
		ohrm.applicationLaunch();
		ohrm.loginfunctionality_screenshots();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

