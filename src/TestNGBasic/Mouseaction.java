package TestNGBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseaction {
	WebDriver driver;
  @Test
  public void mouse() {
	    String url = "https://www.travolook.in/?utm_source=google&utm_medium=cpc&utm_campaign=brand_exact&gclid=CjwKCAjwhMmEBhBwEiwAXwFoEc-qDe1SPGV21mYQ8xXqk9AnsqII1MJax2xkdMlbN5IFcaLwkkSuOxoCNxsQAvD_BwE";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"resclick\"]/a"))).build().perform();
		driver.close();
		
		
  }
}
