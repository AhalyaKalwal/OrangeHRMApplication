package comGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String applicationURLAddress="http://google.com";
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationURLAddress);
		
	//	<a class="gb_Aa gb_kd gb_Md gb_le"
		//aria-label="Sign in" 
		//href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top"><span class="gb_Id">Sign in</span></a>
		
		By signInProperty=By.linkText("Sign in");
		WebElement signIn=driver.findElement(signInProperty);
		signIn.click();
		
		
		

	}

}
