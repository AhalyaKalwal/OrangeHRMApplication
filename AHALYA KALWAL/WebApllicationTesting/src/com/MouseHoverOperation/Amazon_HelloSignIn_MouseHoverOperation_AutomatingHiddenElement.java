package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHoverOperation_AutomatingHiddenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		String applicationUrlAddress="http:/amazon.in";
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		
		//id=nav-link-accountList      -property of hellosignin
	By	helloSignInProperty=By.id("nav-link-accountList");
		WebElement helloSignIn=driver.findElement(helloSignInProperty);
		
		
		Actions mouseHoverOperation=new Actions(driver);
		mouseHoverOperation.moveToElement(helloSignIn).build().perform();
		
		
		//<span class="nav-text">Your Wish List</span>
		By yourwishlistProperty=By.linkText("Your Wish List");
		WebElement yourwishlist=driver.findElement(yourwishlistProperty);
		yourwishlist.click();
		
		String yourwishlistwebpagetitle=driver.getTitle();
		System.out.println(yourwishlistwebpagetitle);
		
		
		
	}

}
