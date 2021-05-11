package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		 String url = "https://jqueryui.com/droppable/";
			
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.switchTo().frame(0);
			
			WebElement sourceelement = driver.findElement(By.id("draggable"));
			WebElement targetelement = driver.findElement(By.id("droppable"));
			Actions action = new Actions(driver);
			action.clickAndHold(sourceelement).moveToElement(targetelement).release().build().perform();
			
			System.out.println("click and hold performed");
			driver.switchTo().defaultContent();

	}

}
