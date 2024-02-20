package com.WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	String applicationURLAddress="https://www.timeanddate.com/worldclock/";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationURLAddress);
		driver.manage().window().maximize();
	}
	   // @AfterTest
       public void tearDown()
       {
    	  
               driver.quit();
   	
       }
	
       }

		
	

