package com.google_GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String applicationUrlAddress="http://google.com";
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		
		//<a class="gb_Aa gb_kd gb_Md gb_le"
				//aria-label="Sign in" 
			//	href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ"
				//target="_top"><span class="gb_Id">Sign in</span></a>
		By signInProperty=By.linkText("Sign in");
		WebElement signIn=driver.findElement(signInProperty);
		
		String signInHrefAttributevalue=signIn.getAttribute("href");
		System.out.println("The href attribute value of signIn webElement is :-"+signInHrefAttributevalue);
		signIn.click();
		String webPageUrlAddress=driver.getCurrentUrl();
		System.out.println("The webpage Url address is:"+webPageUrlAddress);
		
		if(signInHrefAttributevalue.contains(webPageUrlAddress))
		{
			System.out.println("Url matched= PASS");
		}
		else
		{
			System.out.println("Url not matched=FAIL");
			
	
		}
	
		driver.quit();

	}

}
