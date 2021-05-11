package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flow {
	public static void main(String args[]) {
		
        String url = "http://automationpractice.com/index.php";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement t_shirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		t_shirt.click();
		WebElement size = driver.findElement(By.xpath("//input[@name='layered_id_attribute_group_1']"));
		size.click();
	    
		WebElement click_image = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		click_image.click();
		driver.switchTo().frame(0);
		System.out.println("i frame handle");
	
		WebElement select_img = driver.findElement(By.xpath("//img[@id='thumb_1']"));
		select_img.click();
	
		WebElement addtocard = driver.findElement(By.id("add_to_cart"));
		addtocard.click();
		driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		driver.close();
		
	}
	
}
