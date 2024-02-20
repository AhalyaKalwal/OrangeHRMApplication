   package com.RadioButtonsTesting;

   import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

    public class Group1_Group2_RadioButtonsTesting extends BaseTest{
	@Test
	public void RadioButtonsTesting() throws InterruptedException
	{

		// <input type="radio" name="group1" value="Milk">
		//  <input type="radio" name="group1" value="Butter" checked="">
		//     <input type="radio" name="group1" value="Cheese">	

		//<input type="radio" name="group2" value="Water">
		//<input type="radio" name="group2" value="Beer">
		//<input type="radio" name="group2" value="Wine" checked="">
		// Combine both groups into a single list
		By	group1radiobuttonProperty=By.name("group1");
		List<WebElement>group1radiobutton=driver.findElements(group1radiobuttonProperty);

		By group2radiobuttonProperty=By.name("group2");
		List<WebElement>group2radiobutton=driver.findElements(group2radiobuttonProperty);

		int group1radiobuttoncount=group1radiobutton.size();
		int group2radiobuttoncount=group2radiobutton.size();
		System.out.println("The number of group1 radio button are:"+group1radiobuttoncount+" -  group2 are:"+group2radiobuttoncount);
		System.out.println();

		List<WebElement>allRadioButton=new ArrayList<>();
		allRadioButton.addAll(group1radiobutton);
		allRadioButton.addAll(group2radiobutton);

		for(WebElement radiobutton :allRadioButton ) 
		{
		String	radiobuttonName=radiobutton.getAttribute("value");
		radiobutton.click();
		Thread.sleep(2000);

		if(group1radiobutton.contains(radiobutton))
		{ 
		System.out.println("Group1 radio button status:"+radiobuttonName);
		for(WebElement radiobuttonstatus : group1radiobutton)
		{
		System.out.println(radiobuttonstatus.getAttribute("value")+ " - "+radiobuttonstatus.getAttribute("checked"));
		}

		}
		else if(group2radiobutton.contains(radiobutton))
		{
		System.out.println("Group2 radio button status:"+radiobuttonName);
		for(WebElement radiobuttonstatus : group2radiobutton)
		{
		System.out.println(radiobuttonstatus.getAttribute("value")+ " - "+radiobuttonstatus.getAttribute("checked"));
		}
		}

	}









	}}

