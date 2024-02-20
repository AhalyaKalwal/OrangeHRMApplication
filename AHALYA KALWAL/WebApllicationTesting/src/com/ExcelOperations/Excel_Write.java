package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream testData=new FileInputStream("./src/com/Excelsheet/singletestdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(testData);
		XSSFSheet testdatasheet =workbook.getSheet("TestDataSheet");
		
	Row	testdataRow=testdatasheet.createRow(3);
	Cell testdataRowOfCell=testdataRow.createCell(5);
	testdataRowOfCell.setCellValue("ANURAG");
	 FileOutputStream testdatafile=new FileOutputStream("./src/com/orangehrmexcelResultsfile/singletestdata1.xlsx");
	 workbook.write(testdatafile);
	 
	}

}
