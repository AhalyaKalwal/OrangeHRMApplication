package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown_GetOptionalValues {

	WebDriver driver;
	String applicationUrlAddress="https:/www.osmania.ac.in";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		  
		driver.manage().window().maximize();
	}
	
	public void applicationClose()
	{
		driver.quit();
	}
	public void gettingOptionalValuesOfSelectLanguagesDropDown()
	{
		//<select onchange="doGTranslate(this);" class="notranslate" 
				//id="gtranslate_selector" aria-label="Website Language Selector" align="right" 
				//style="position:relative; z-index:1000"><option value="">Select Language</option><option value="en|hi">Hindi</option><option value="en|fr">French</option><option value="en|de">German</option><option value="en|es">Spanish</option><option value="en|el">Greek</option><option value="en|en">English</option><option value="en|te">Telugu</option><option value="en|ml">Malayalam</option><option value="en|ur">Urdu</option><option value="en|nl">Dutch</option><option value="en|ar">Arabic</option><option value="en|zh-Hans">Chinese (Simplified)</option><option value="en|ru">Russian</option><option value="en|ta">Tamil</option><option value="en|sa">Sanskrit</option><option value="en|fa">Persian (Farsi)</option><option value="en|ne">Nepali</option><option value="en|mr">Marathi</option><option value="en|mn">Mangolian	</option><option value="en|la">Latin</option><option value="en|kn">Kannada</option><option value="en|ja">Japanese</option><option value="en|it">Italian	</option><option value="en|gu">Gujarati	</option><option value="en|hu">Hungarian</option><option value="en|id ,in">Indonesian</option><option value="en|ga">Irish	</option><option value="en|th">Thai</option></select>
				
		              By selectlanguagesdropdownProperty= By.id("gtranslate_selector");
		              WebElement selectlanguages=driver.findElement(selectlanguagesdropdownProperty);
		           // <option value="">Select Language</option>
		              // <option value="en|hi">Hindi</option>
		               
		            By  dropdownProperty= By.tagName("option");
		        List<WebElement>  dropdownvalues = selectlanguages.findElements(dropdownProperty);
		        int languagescount=dropdownvalues.size();
		        System.out.println("The number of languages in the select languages in dropdown is:"+languagescount);
		            
		 		for(int index=0;index<languagescount;index++)
		 		{
		 			String languageName=dropdownvalues.get(index).getText();
		 			System.out.println(index+" "+languageName);
		 		}
	}
	
	
		 		public static void main(String[]args)
		 		{
		 			DropDown_GetOptionalValues osmaniaUniversity=new DropDown_GetOptionalValues();
		 			osmaniaUniversity.applicationLaunch();
		 			osmaniaUniversity.gettingOptionalValuesOfSelectLanguagesDropDown();
		 			osmaniaUniversity.applicationClose();
		 			
		 		}
	
	
}
