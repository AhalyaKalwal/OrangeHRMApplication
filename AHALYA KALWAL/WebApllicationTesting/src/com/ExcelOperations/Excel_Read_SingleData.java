package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleData {

	public static  void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	Identify the file in the system
		
		FileInputStream testDataFile=new FileInputStream("./src/com/Excelsheet/singletestdata.xlsx");
	//Identify the workbook in the file
		XSSFWorkbook workbook=new XSSFWorkbook(testDataFile);
		XSSFSheet testdatasheet=workbook.getSheet("TestDataSheet");
	Row testDataRow	=testdatasheet.getRow(5);
	
   Cell testDataRowOfCell=testDataRow.getCell(2);
   
 String testData= testDataRowOfCell.getStringCellValue();
 System.out.println(testData);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
