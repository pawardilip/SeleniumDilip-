package TestNGBasic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Logout {
	WebDriver driver;
  @Test
  public void test() throws Exception {
	  
	    WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin");
		WebElement Submit = driver.findElement(By.id("btnLogin"));
		Submit.click();
		Thread.sleep(3000);
		
		//driver.findElement(By.id("welcome")).click();
      	//driver.findElement(By.linkText("Logout")).click();
		 
		//Select Logout = new Select(driver.findElement(By.id("welcome")));
		//Logout.deselectByVisibleText("Logout");
		
		WebElement logout = driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logout);
		
		System.out.println("logout completed");
		Thread.sleep(3000L);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  String url = "http://127.0.0.1/orangehrm-2.6/login.php";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
