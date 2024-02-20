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



public class WebTableFirstcolumndata extends BaseTest {
	
	@Test
	public void firstcolumncitynames_exporttoexcel() throws IOException
	{
		
//		//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody
		By firstcolumnProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody");
	WebElement	firstcolumn=driver.findElement(firstcolumnProperty);
	
	FileInputStream testdatafile=new FileInputStream("./src/com/Excelsheet/worldclocktestdata.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(testdatafile);
	XSSFSheet testdatasheet=workbook.getSheet("Sheet1");
	
	///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]
	
		By webtablerowProperty=By.tagName("tr");
	List<WebElement>webtablerow=firstcolumn.findElements(webtablerowProperty);
	
	for(int rowindex=0;rowindex<webtablerow.size();rowindex++)
	{
	WebElement	row=webtablerow.get(rowindex);
	Row rowdata=testdatasheet.createRow(rowindex);
	
	///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
By	webtablerowofcellProperty=By.tagName("td");
List<WebElement>webtablerowofcell=row.findElements(webtablerowofcellProperty);

for(int rowofcell=0;rowofcell<1;rowofcell++)
{
	WebElement cell=webtablerowofcell.get(rowofcell);
	String webtabledata=cell.getText();
	System.out.println(webtabledata);
 Cell	celldata=rowdata.createCell(0);
 celldata.setCellValue(webtabledata);
	

	
	

}		
		FileOutputStream testdatafile1=new FileOutputStream("./src/com/orangehrmexcelResultsfile/worldclockwebtabledata.xlsx");
		workbook.write(testdatafile1);
		
		
		

		
	}	
		
	}
	
	

}
