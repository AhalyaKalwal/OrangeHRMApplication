package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String urlAddress="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(urlAddress);
		
		chrome.findElement(By.id("email")).sendKeys("9133540827");
		chrome.findElement(By.name("pass")).sendKeys("Ahalya@123");
		chrome.findElement(By.name("login")).click();
		
		//<button value="1" class="_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy" id="loginbutton" name="login" tabindex="0" type="submit" fdprocessedid="m2rxb">Log in</button>
	//	<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_9_1y" fdprocessedid="9pffll">Log in</button>			
	}

}
