package com.StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.java.AfterAll;

public class Hooks 
{
	public static WebDriver driver;

@Before
 public static void setUp()
 {
	 System.setProperty("webdriver.chrome.driver", "./browserdriverfiles/chromedriver.exe");
	 driver = new ChromeDriver();

	 Log.info(" *** Chrome Browser launched Successfully *****");
	 }
	

@AfterAll
public void tearDown() {
    // Code to close the browser
    driver.quit();
    Log.info("*********** chrome Browser got closed **********");
}


 }
	

