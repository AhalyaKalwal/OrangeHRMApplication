package com.testingrandommethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		chrome.manage().window().maximize();
		
		chrome.findElementById("txtUsername").sendKeys("Ahalya");
		
		chrome.findElementById("txtPassword").sendKeys("Ahalya@123");
		
		chrome.findElementById("btnLogin").click();
		
	
		chrome.findElement(By.id("welcome")).click();
		
		
		chrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		chrome.findElementByLinkText("Logout").click();
		
		//chrome.get("https:///orangehrm-4.2.0.1/symfony/web/index.php/auth/logout");
		
		
		
		
	}

}
