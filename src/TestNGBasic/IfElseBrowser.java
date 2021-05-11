package TestNGBasic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class IfElseBrowser {
	WebDriver driver;
	String browser = "chrome";
  @Test
  public void browser() {
	  if(browser.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		  
	  }else if (browser.equals("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new ChromeDriver();
		  
	  }
	  driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	  
  }
  
 

}
