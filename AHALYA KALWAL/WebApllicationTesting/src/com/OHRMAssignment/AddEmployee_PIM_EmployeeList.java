package com.OHRMAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployee_PIM_EmployeeList  extends BaseTest{
	
	@Test(priority=1)
	public void loginfunctionality()
	{
	//	<input name="txtUsername" id="txtUsername" type="text">
		String usernametestdata="Ahalya";
		By usernametestdataProperty=By.id("txtUsername");
	WebElement	usernamedata=driver.findElement(usernametestdataProperty);
	usernamedata.sendKeys(usernametestdata);
	
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	String passwordtestdata="Ahalya@123";
By	passwordtestdataProperty=By.id("txtPassword");
WebElement passworddata=driver.findElement(passwordtestdataProperty);
passworddata.sendKeys(passwordtestdata);
//    <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">	
	By	loginbuttonProperty=By.id("btnLogin");
	WebElement loginbutton=driver.findElement(loginbuttonProperty);
	loginbutton.click();
		
	}
	@Test(priority=2)
	public void pim_MouseHover()
	{
	//	<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		
		By pimProperty=By.id("menu_pim_viewPimModule");
	WebElement	pim=driver.findElement(pimProperty);
		
		
		Actions mousehoveroperation=new Actions(driver);
		mousehoveroperation.moveToElement(pim).build().perform();
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
		
	By	employeelistProperty=By.id("menu_pim_viewEmployeeList");
	WebElement  employeelist=driver.findElement(employeelistProperty);
	employeelist.click();
	}
@Test(priority=3)	
public void webtabledata() throws IOException
{
	///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table   
	// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
	
By	webtableProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody");
WebElement webtabledata=driver.findElement(webtableProperty);
	
	FileInputStream testdatafile=new FileInputStream("./src/com/Excelsheet/OHRM_EmployeeList.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(testdatafile);
	XSSFSheet testdatasheet=workbook.getSheet("OHRM");
	
	//identify rows in the table  
	By rowdataProperty=By.tagName("tr");         
	List<WebElement>rowdata=webtabledata.findElements(rowdataProperty);
	
	for(int rowindex=0;rowindex<rowdata.size();rowindex++)
	{
	WebElement	row=rowdata.get(rowindex);
 Row	rows =testdatasheet.createRow(rowindex);
 
 
By  rowofcelldataProperty=By.tagName("td");
List<WebElement>rowofcelldata=row.findElements(rowofcelldataProperty);

for(int rowofcell=0;rowofcell<rowofcelldata.size();rowofcell++)
{
	WebElement cell=rowofcelldata.get(rowofcell);
String	data=cell.getText();
System.out.println(data);
    Cell celldata=rows.createCell(rowofcell);
    celldata.setCellValue(data);

	
}
 
 System.out.println();
 FileOutputStream testoutputfile=new FileOutputStream("./src/com/orangehrmexcelResultsfile/OHRM_Employeelist.xlsx");
 workbook.write(testoutputfile);
 
 
	}
	
	
	
}
	
}
