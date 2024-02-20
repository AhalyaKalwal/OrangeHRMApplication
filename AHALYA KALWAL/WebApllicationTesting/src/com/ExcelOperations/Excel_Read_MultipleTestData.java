package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream testData=new FileInputStream("./src/com/Excelsheet/MultipleTestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(testData);
		XSSFSheet testDataSheet=workbook.getSheet("Sheet1");
		
		//find the active rows
		int rowCount=testDataSheet.getLastRowNum();
		 
	//	to go to the active row
		for(int rowIndex=1;rowIndex<=rowCount;rowIndex++)
		{
		Row	testDataRow=testDataSheet.getRow(rowIndex);
		
		//find the active row of cell
		
int	rowofCellCount=testDataRow.getLastCellNum();
for(int cellIndex=0;cellIndex<rowofCellCount;cellIndex++)
{
	Cell testDataCell=testDataRow.getCell(cellIndex);
	
	String newtestData=testDataCell.getStringCellValue();
	System.out.print(newtestData+"  ");
	
}
	System.out.println();	
		
		
		
		
		
		}
		

	}

}
