package com.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_Homepage_capturingScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		String applicationUrlAddress="http:/bing.com";
		System.setProperty("webdriver.chrome.driver", "browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		File webPageScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(webPageScreenshot, new File("./ApplicationScreenshot/bingHomepageScreenshot.png"));
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
