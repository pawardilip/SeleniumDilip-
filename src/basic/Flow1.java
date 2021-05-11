package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flow1 {

	public static void main(String[] args) {
		
        String url = "http://automationpractice.com/index.php";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement dress = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"));
		dress.click();
		WebElement summer = driver.findElement(By.xpath("//li[@class='last']"));
		summer.click();
		WebElement stylebox = driver.findElement(By.name("layered_id_feature_11"));
		stylebox.click();
		WebElement availibility = driver.findElement(By.xpath("//div[@id='uniform-layered_quantity_1']"));
		availibility.click();
		WebElement select = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
		select.click();
		WebElement addtocard =driver.findElement(By.xpath("//p[@class='buttons_bottom_block no-print']"));
		addtocard.click();
		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
		

	}

}
