package basic;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@type='Submit']")).click();
		 Thread.sleep(5000L);
		 //Verifying Text
		assertTrue(driver.findElement(By.xpath("//ul[@id='optionmenu']/li")).getText().matches("Welcome suresh"));
		 //Selecting the frame
		 driver.switchTo().frame("rightMenu"); //Enter into Frame
		 //Clicking on Add Button
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		 Thread.sleep(2000L);
		 //To retrive the data from empid textbox
		String empid=driver.findElement(By.xpath("//form[@id='frmEmp']/div/div/div[2]/input")).
		getAttribute("value");
		 System.out.println(empid);
		 driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("suresh");
		 Thread.sleep(2000L); 
		driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("selenium");
		 driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		 Thread.sleep(2000L);
		 System.out.println("New Employee Added");
		 driver.switchTo().defaultContent(); //Exit from Frame
		 driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		 driver.quit();

	}

}
