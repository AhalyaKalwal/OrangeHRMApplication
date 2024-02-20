package com.ApplicationLaunch;
import org.openqa.selenium.chrome.ChromeDriver;

 public class NavigateTo_Bing_HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	ChromeDriver chromeBrowser = new ChromeDriver();
	//Navigating to Bing application Homepage
	chromeBrowser.get("http://bing.com");
	 
		 //System.setProperty("webdriver.chrome.driver", ".//browserDriverFiles/chromedriver.exe");
		 //ChromeDriver chromeBrowser = new ChromeDriver();
		 
		 chromeBrowser.get("http://amazon.com");
		 chromeBrowser.get("http://flipkart.com");
		 chromeBrowser.navigate().to("http://google.com");

		 chromeBrowser.close(); //close method will close the browser when it has a single tab opened
	}

}
