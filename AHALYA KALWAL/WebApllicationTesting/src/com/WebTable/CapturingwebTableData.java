package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CapturingwebTableData extends BaseTest{
	@Test
	public void webTableData() 
	{
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	   // /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
		
		for(int rowindex=1;rowindex<=36;rowindex++)
		{
			for(int rowofcell=1;rowofcell<7;rowofcell++)
			{
				By webtabledataProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+rowofcell+"]");
			  WebElement  webtabledata=driver.findElement(webtabledataProperty);
			String  capturingwebtabledata=webtabledata.getText();
			System.out.print(capturingwebtabledata+"");
			
			
			}
			System.out.println();
		}
	}
	

}
