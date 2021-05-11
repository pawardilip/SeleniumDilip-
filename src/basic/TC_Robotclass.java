package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Robotclass {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Aplication Opene");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		
		
		System.out.println("Login Successfull");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
