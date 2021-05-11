package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String Url = "http://demo.guru99.com/test/upload\r\n";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(Url); 
		driver.manage().window().maximize();
		
		WebElement FileUpload = driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(1000);
		FileUpload.sendKeys("C:\\Users\\DILIP\\Desktop\\dilip.txt");
		Thread.sleep(1000);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
