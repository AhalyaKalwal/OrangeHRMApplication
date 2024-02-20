package com.Frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	WebDriver driver;
	String applicationURLAddress="https://jqueryui.com/droppable/";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationURLAddress);
		driver.manage().window().maximize();
	}
	
	public void applicationClose()
	{
		driver.close();
	}
	
	/*public static void main(String[] args) {
		BaseTest b=new BaseTest();
		b.applicationLaunch();
		b.applicationClose();
		*/
	}
	
	
	

