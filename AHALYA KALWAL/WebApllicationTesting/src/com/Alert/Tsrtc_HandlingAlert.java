package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tsrtc_HandlingAlert {

	WebDriver driver;
	String applicationURLAddress="https://www.tsrtconline.in/oprs-web/";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationURLAddress);
		driver.manage().window().maximize();
	}
	/*
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	 */
	@Test
	public void handlingAlert() throws InterruptedException
	{
		//<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
		By	checkavailabilityProperty=By.id("searchBtn");
		WebElement checkavaliability=driver.findElement(checkavailabilityProperty);
		checkavaliability.click();
		Thread.sleep(3000);

		Alert tsrtcAlert=driver.switchTo().alert();

		String expected_alertwindowtextmessage="Please select start place.";
		System.out.println("The expected alert message is:-"+expected_alertwindowtextmessage);

		String actual_alertwindowtextmessage=tsrtcAlert.getText();
		System.out.println("The actual alert message is:-"+actual_alertwindowtextmessage);

		if(actual_alertwindowtextmessage.equals(expected_alertwindowtextmessage))
		{
			System.out.println("Message existing - PASS");
		}
		else
		{
			System.out.println("No Message found - FAIL");
		}
		tsrtcAlert.accept();

	}









}
