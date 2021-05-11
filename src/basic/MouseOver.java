package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		
       String url = "https://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.linkText("PIM"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		WebElement add_emp = driver.findElement(By.linkText("Add Employee"));
		add_emp.click();
		Thread.sleep(3000);
		System.out.println("Clicked on submenu");
		driver.close();
		
		
		
		
		

	}

}
