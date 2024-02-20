package com.getURL;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL_GoogleHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
        ChromeDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.get("http://google.com");
        
        String googlecurrentWebPageUrlAddress=chromeBrowser.getCurrentUrl();
        System.out.println("The current URL Adress of the web page is:-"+googlecurrentWebPageUrlAddress);
	chromeBrowser.close();
	}

}
