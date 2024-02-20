package com.GetTitle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_BingHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
        ChromeDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.get("http://bing.com");
       String bingTitle=chromeBrowser.getTitle();
       System.out.println("The Title of the Bing current web page is:- " +bingTitle);
        chromeBrowser.quit();
        
	}

}
