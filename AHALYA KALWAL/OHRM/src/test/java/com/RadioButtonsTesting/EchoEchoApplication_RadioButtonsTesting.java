package com.RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

public class EchoEchoApplication_RadioButtonsTesting extends BaseTest
{
    @Test
	public void group1RadioButtonsTesting() throws InterruptedException
	{
    	// <input type="radio" name="group1" value="Milk">
       //  <input type="radio" name="group1" value="Butter" checked="">
    //     <input type="radio" name="group1" value="Cheese">	
    	
    	
     By	group1radiobuttonProperty=By.name("group1");
  List<WebElement>group1radiobutton=driver.findElements(group1radiobuttonProperty);
  
       int  group1radiobuttoncount =group1radiobutton.size();
       System.out.println("The number of radio button group1 are:-"+group1radiobuttoncount);
    	
    	for(int radiobuttonclick=0;radiobuttonclick<group1radiobuttoncount;radiobuttonclick++)
    	{
    		String group1radiobuttonsName=group1radiobutton.get(radiobuttonclick).getAttribute("value");
    		System.out.println(group1radiobuttonsName);
    		
    		group1radiobutton.get(radiobuttonclick).click();
    		Thread.sleep(2000);
    		
    		//Getting the status of the radio buttons
    		for(int radiobuttonstatus=0;radiobuttonstatus<group1radiobuttoncount;radiobuttonstatus++)
    		{
    			System.out.println(group1radiobutton.get(radiobuttonstatus).getAttribute("value")+" "+group1radiobutton.get(radiobuttonstatus).getAttribute("checked"));
    		    
    		
    		}
    		
    	}
    	
	}
	
	
}