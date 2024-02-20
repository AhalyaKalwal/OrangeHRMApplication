package com.ValidatingURLAddress;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUrlAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
        ChromeDriver chromeBrowser = new ChromeDriver();
        chromeBrowser.get("http://google.com");
        
        String expected_googleUrlAddress="google.com";
        System.out.println("The expected google Url Address is:-" +expected_googleUrlAddress);
	
        String actual_googlecurrentUrlAddress=chromeBrowser.getCurrentUrl();
        System.out.println("The actual google Url Address is:-"+actual_googlecurrentUrlAddress);
	
        if(actual_googlecurrentUrlAddress.contains(expected_googleUrlAddress))
        {
        	System.out.println("succesfully navigted to google Url Address:-PASS");
        	
        }
        else
        {
        	System.out.println("Failed to navigte to google Url Address:-FAIL");
        }
        chromeBrowser.quit();
	}
	

}
