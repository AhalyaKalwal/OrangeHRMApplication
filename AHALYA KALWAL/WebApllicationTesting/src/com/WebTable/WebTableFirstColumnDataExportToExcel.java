package com.WebTable;

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
import org.testng.annotations.Test;

public class WebTableFirstColumnDataExportToExcel extends BaseTest
{ 
	@Test
	public void firstcolumndata_exportToExcel() throws IOException
	{
	//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody
	
		FileInputStream testdata=new FileInputStream("./src/com/Excelsheet/WebTable_worldclock.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(testdata);
		XSSFSheet testdatasheet=workbook.getSheet("Sheet1");
		
		
		
		for(int rowindex=1;rowindex<=36;rowindex++)
		{
			Row row=testdatasheet.createRow(rowindex);
           Cell rowofcell=row.createCell(0);
           
           By	firstcolumngetcitynamesProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td[1]");
		   WebElement	firstcolumn_citynames=driver.findElement(firstcolumngetcitynamesProperty);
  	String firstcolumnNames=firstcolumn_citynames.getText();
   	System.out.println("The city nameis:-"+firstcolumnNames);
	 rowofcell.setCellValue(firstcolumnNames);
	
	FileOutputStream testoutputfile=new FileOutputStream("./src/com/orangehrmexcelResultsfile/webtabletestdata.xlsx");
	workbook.write(testoutputfile);
	

}
}}