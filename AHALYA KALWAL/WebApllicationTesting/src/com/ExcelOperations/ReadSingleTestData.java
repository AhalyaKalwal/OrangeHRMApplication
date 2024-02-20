package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleTestData {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		FileInputStream testData=new FileInputStream("./src/com/Excelsheet/singletestdata1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(testData);
		XSSFSheet testDataSheet=workbook.getSheet("TestDataSheet");
		
	Row	testdataRow=testDataSheet.getRow(8);
	
	Cell testdataRowOfCell=testdataRow.getCell(4);
	
	String testdata1=testdataRowOfCell.getStringCellValue();
	System.out.println(testdata1);
	
	}

}
