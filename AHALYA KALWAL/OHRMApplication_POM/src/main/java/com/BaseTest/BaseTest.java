package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;



public class BaseTest {
 
	public static WebDriver driver;
	String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		Log.info("***********ChromeBrowser Launched successfully**********");
		driver.get(applicationURLAddress);
		driver.manage().window().maximize();
		
	}
	/*@AfterMethod
	public void tearDown()
	{
		driver.quit();
		Log.info("************* chrome browser along with orangehrm application closed successfully*************");
	}
	*/
}
