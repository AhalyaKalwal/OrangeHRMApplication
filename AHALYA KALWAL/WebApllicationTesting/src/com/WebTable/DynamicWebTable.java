package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebTable extends BaseTest {
	@Test
	public void dynamicWebTableData()
	{
		//identify the webtable
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody
		///html/body/div[5]/section[1]/div/section/div[1]/div
	//	/html/body/div[5]/section[1]/div/section/div[1]
		
		///html/body/div[5]/section[1]/div/section/div[1]
	By	webtableProperty=By.xpath("/html/body/div[5]/section[1]/div");
	WebElement webTable=driver.findElement(webtableProperty);
	
	//identify the rows of the webtable
        
	By webtablerowProperty=By.tagName("tr");
	List<WebElement>rows=webTable.findElements(webtablerowProperty);
	
	//going to all the rows of the webtable
	for(int rowindex=0;rowindex<rows.size();rowindex++)
	{
		//going to arraylist reaching to particular row of the webtable
	WebElement	row=rows.get(rowindex);
	// going to row and identify the row of cell
	
	By webtablerowofcellProperty=By.tagName("td");
	List<WebElement>rowofcelldata=row.findElements(webtablerowofcellProperty);
	
	for(int rowofcell=0;rowofcell<rowofcelldata.size();rowofcell++)
	{
		//reaching to row of cell
		WebElement webtablerowofcell=rowofcelldata.get(rowofcell);
		
		
	//get the data from the row of cell
		String data=webtablerowofcell.getText();
		System.out.print(data);
		
	}
	System.out.println();
	
	}
	
	
		
	}
	
	
	
	
	
	

}
