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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTestDataResult_Excel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		String applicationUrlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "./browserdriverfiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);

		FileInputStream testdata = new FileInputStream("./src/com/Excelsheet/MultipleTestDataResult.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(testdata);
		XSSFSheet testdatasheet = workbook.getSheet("Sheet1");

		int testdataRow = testdatasheet.getLastRowNum();
		for (int rowindex = 0; rowindex <= testdataRow; rowindex++) {
			Row dataRow = testdatasheet.getRow(rowindex);
			Cell usernamedata = dataRow.getCell(0);
			String username = usernamedata.getStringCellValue();

			Cell passwordcell = dataRow.getCell(1);

			String passworddata = passwordcell.getStringCellValue();

			By userNameTestDataProperty = By.name("txtUsername");
			WebElement userName = driver.findElement(userNameTestDataProperty);
			userName.sendKeys(username);

			By passwordTestDataProperty = By.id("txtPassword");
			WebElement password = driver.findElement(passwordTestDataProperty);
			password.sendKeys(passworddata);

			By loginProperty = By.className("button");
			WebElement Login = driver.findElement(loginProperty);
			Login.click();

			String Expected_CurrentUrl = "dashboard";
			String Actual_CurrentUrl = driver.getCurrentUrl();

			if (Actual_CurrentUrl.contains(Expected_CurrentUrl)) {

				Cell Resultcell = dataRow.createCell(2);
				Resultcell.setCellValue("Pass");

				// Automate Welcome Admin
				By WelcomeAdminLocator = By.linkText("Welcome Admin");
				WebElement WelcomeAdmin = driver.findElement(WelcomeAdminLocator);
				WelcomeAdmin.click();

			
				Thread.sleep(5000);

				
				By LogoutLocator = By.linkText("Logout");
				WebElement Logout = driver.findElement(LogoutLocator);
				Logout.click();

			}

			String Expected_LoginPageUrl = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			String Actual_LoginPageUrl = driver.getCurrentUrl();

			if (Actual_LoginPageUrl.equals(Expected_LoginPageUrl)) {

				Cell Resultcell = dataRow.createCell(2);
				Resultcell.setCellValue("Fail");

			}

		}
 FileOutputStream file1 = new FileOutputStream("./src/com/orangehrmexcelResultsfile/orangehrmmultipletestdataresult.xlsx");
	workbook.write(file1);
	}

}
