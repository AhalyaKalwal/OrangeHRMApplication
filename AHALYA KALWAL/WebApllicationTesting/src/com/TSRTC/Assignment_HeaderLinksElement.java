package com.TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_HeaderLinksElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		/*<div class="menu">
		<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
				Home</a>
			<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
			<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
			<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
			<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
			<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
			<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
			<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
			<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
*/
		
		
		
	               By tabElementsProperty=By.className("menu-wrap");
	               WebElement tabElements_count=driver.findElement(tabElementsProperty);
	             
	              // <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
				//	Home</a>
		
	               By headerlinksProperty=By.tagName("a");
	             List<WebElement>tabElements=tabElements_count.findElements(headerlinksProperty);
	            int tabElementsCount=tabElements.size();
	            
	             
	            System.out.println("The number of webelements in the header links is:-"+tabElementsCount);
	            
	            for(int index=0;index<tabElementsCount;index++)
	            {
	            String headerBlockName=tabElements.get(index).getText();
	            System.out.println(index+"-"+headerBlockName);
	            
	            tabElements.get(index).click();
	           String webPageTitle=driver.getTitle();
	           System.out.println(webPageTitle);
	            
	            
	          String actual_webPageUrlAddress=driver.getCurrentUrl();
	          System.out.println(actual_webPageUrlAddress);
	            
	          System.out.println();
	          driver.navigate().back();
	          
	          tabElements_count=driver.findElement(tabElementsProperty);
	        
	          tabElements=tabElements_count.findElements(headerlinksProperty);
	            
	            
	        //  <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
			//	Home</a>
	          
	         String expected_Url=tabElements.get(index).getAttribute("href");
	        
	          
	          if(actual_webPageUrlAddress.equals(expected_Url))
	          {
	        	  System.out.println("successfully navigated to web page url address:-PASS");
	          }
	          else
	          {
	        	  System.out.println("Failed to navigate to web page url address:-FAIL");
	          }
	          
	            }
	            
	            
	            
	            
	}

}
