package browserAutomation;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ahaly\\OneDrive\\Desktop\\AHALYA KALWAL\\WebApllicationTesting\\BrowserDriverFiles\\msedgedriver.exe");
	    EdgeDriver edge = new EdgeDriver();
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ahaly\\OneDrive\\Desktop\\AHALYA KALWAL\\WebApllicationTesting\\BrowserDriverFiles\\chromedriver.exe");
	    		// Class     object
	 
	    ChromeDriver srini = new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahaly\\OneDrive\\Desktop\\AHALYA KALWAL\\WebApllicationTesting\\BrowserDriverFiles\\geckodriver.exe");

	  FirefoxDriver firefox = new FirefoxDriver();


	}
	

}
