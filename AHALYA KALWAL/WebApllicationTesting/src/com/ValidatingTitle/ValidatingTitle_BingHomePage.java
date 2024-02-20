package com.ValidatingTitle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
     ChromeDriver chromeBrowser = new ChromeDriver();
     chromeBrowser.get("http://bing.com");
     
     String expected_BingHomepageTitle="Bing";
     System.out.println("The expected bing home page title is :-" +expected_BingHomepageTitle);
	
     String actual_WebpageTitle=chromeBrowser.getTitle();
     System.out.println("The actual web page title is:-" +actual_WebpageTitle);
	
     if(actual_WebpageTitle.equals(expected_BingHomepageTitle))
     {
    	 System.out.println("The Title of the Bing Home Page matched - PASS");
     }
     else
     {
    	 System.out.println("The Title of the Bing Home Page is NOT Matched - FAIL");
    	}
     chromeBrowser.close();
	}

}
 