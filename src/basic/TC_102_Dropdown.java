package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_102_Dropdown {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DILIP\\Desktop\\selelium\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/DILIP/Downloads/HtmlFiles/dropdownNavigate.html");
Select drpdwn = new Select(driver.findElement(By.name("OptWeb")));

drpdwn.selectByVisibleText("Google");
driver.findElement(By.xpath("/html/body/form/select")).click();
Thread.sleep(3000L);
System.out.println(driver.getTitle());
driver.navigate().back();
Thread.sleep(3000L);
driver.navigate().to("file:///C:/Users/DILIP/AppData/Local/Temp/Temp1_HtmlFiles.zip/multiselectdropdown.html");
Select lstbox = new Select(driver.findElement(By.id("Tools")));
lstbox.selectByVisibleText("Selenium IDE");
System.out.println("Selected is Selenium IDE");
lstbox.selectByIndex(1);
System.out.println("Select is Selenium RE");
Thread.sleep(3000L);
driver.quit();
}
}