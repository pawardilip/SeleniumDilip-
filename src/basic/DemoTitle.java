package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DemoTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url = "https://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
		
	    if(driver.getTitle().equals("OrangeHRM"))
	    {
		
		System.out.println("Title matched");
		
	   }
	    else {
	    	System.out.println("Title is not matched"+driver.getTitle());
	    }
	    WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement Submit = driver.findElement(By.id("btnLogin"));
		Submit.click();
		Thread.sleep(3000);
		
		
		WebElement logout = driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logout);
		
		
		System.out.println("logout completed");
		Thread.sleep(3000L);
		//driver.close();
		
	} 
}
	    

 