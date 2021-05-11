package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://opensource-demo.orangehrmlive.com/";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
        
		String title = driver.getTitle();
		System.out.println("title of my first program- " +title);
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement Submit = driver.findElement(By.id("btnLogin"));
		Submit.click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		WebElement Button = driver.findElement(By.id("btnAdd"));
		Button.click();
		WebElement Admin = driver.findElement(By.id("systemUser_userType"));
		Admin.isSelected();
		
	   // WebElement Admin = driver.findElement(By.id("systemUser_userType"));
	   // Admin.click();
	   WebElement Employee_name = driver.findElement(By.id("systemUser_employeeName_empName"));
	   Employee_name.sendKeys("Goutam ganesh");
	   
	   WebElement Username = driver.findElement(By.id("systemUser_userName"));
	   Username.sendKeys("Ganesh");
	   WebElement Enabed = driver.findElement(By.id("systemUser_status"));
	   Enabed.click();
	   WebElement Password = driver.findElement(By.id("systemUser_password"));
	   Password.sendKeys("admin@11123");
	   WebElement Confirm_Password = driver.findElement(By.id("systemUser_confirmPassword"));
	   Confirm_Password.sendKeys("admin@11123");
	   WebElement Save = driver.findElement(By.name("btnSave"));
	   Save.click();
	   
	    
	//driver.quit();

	}

}
