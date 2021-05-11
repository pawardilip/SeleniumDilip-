package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsPopUp {

	public static void main(String[] args) throws Exception {
		String url = "http://127.0.0.1/orangehrm-2.6/login.php";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("admin");
		WebElement login = driver.findElement(By.name("Submit"));
		login.click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin");
		WebElement logout = driver.findElement(By.name("Submit"));
		logout.click();
		Thread.sleep(3000L);
		System.out.println("Login complited");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfull");
		driver.quit();
		

	}

}
