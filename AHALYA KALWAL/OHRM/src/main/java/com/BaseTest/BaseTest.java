package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

	public WebDriver driver;
	String applicationURLAddress="https://echoecho.com/htmlforms10.htm";
		@BeforeTest
		public void setUp()
		{
			System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(applicationURLAddress);
			driver.manage().window().maximize();
			
		}
		/*@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
*/
	
	
	
}
