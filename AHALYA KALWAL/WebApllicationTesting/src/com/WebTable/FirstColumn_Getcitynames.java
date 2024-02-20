package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FirstColumn_Getcitynames extends BaseTest{
	@Test
	public void firstcolumn_getCitynames()
	{
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		
		for(int rowindex=1;rowindex<=36;rowindex++)
		{
		By	firstcolumngetcitynamesProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td[1]");
	WebElement	firstcolumn_citynames=driver.findElement(firstcolumngetcitynamesProperty);
	String firstcolumnNames=firstcolumn_citynames.getText();
	System.out.println("The city nameis:-"+firstcolumnNames);
		}
	}

	
	
}
