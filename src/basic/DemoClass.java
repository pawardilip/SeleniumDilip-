package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
        
		String title = driver.getTitle();
		System.out.println("title of my first program- " +title);
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(5000);   //java syntax not a good practices in a selenium 
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(5000); 
		WebElement Submit = driver.findElement(By.id("btnLogin"));
		Submit.click();
		Thread.sleep(5000); 
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.quit();
	   
	}

}
