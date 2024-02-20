package com.TSRTC;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DisplayLinkNames {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		By linksProperty=By.tagName("a");
		List<WebElement>tsrtcApplicationHomePageLinks=driver.findElements(linksProperty);
		int tsrtcApplicationHomePageLinks_Count=tsrtcApplicationHomePageLinks.size();
		
		System.out.println("The number of webelements which are of type links on the TSRTC Application home page is:-"+tsrtcApplicationHomePageLinks_Count);
		
		for(int arrayIndex=0;arrayIndex<tsrtcApplicationHomePageLinks_Count;arrayIndex++)
		{
		String	tsrtcHomepage_links=tsrtcApplicationHomePageLinks.get(arrayIndex).getText();
		
		System.out.println(arrayIndex+" - "+tsrtcHomepage_links);
		}

driver.quit();
	
}
}