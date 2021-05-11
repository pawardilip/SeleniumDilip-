package TestNGBasic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DemoProject {
	     WebDriver driver;
  @Test
  public void test() {
	     if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
	      {
		
		   System.out.println("Title matched");
		
	      }
	       else {
	    	System.out.println("Title is not matched"+driver.getTitle());
	    }
	    WebElement username = driver.findElement(By.name("txtUserName"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin");
		WebElement Submit = driver.findElement(By.xpath("//input[@value='Login']"));
		Submit.click();
		driver.findElement(By.linkText("PIM")).click();
		
		driver.switchTo().frame("rightMenu");
		
		Select search_By = new Select(driver.findElement(By.name("loc_code")));
		search_By.selectByVisibleText("Emp. ID");
		driver.findElement(By.name("loc_name")).sendKeys("0001");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Logout")).click();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	    String url = "http://127.0.0.1/orangehrm-2.6/login.php";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
}
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
