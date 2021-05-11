package TestNGBasic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Priority {
  @Test(priority=2)
  public void addemp() {
	  System.out.println("Adding new emp");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("login completed");
  }
  @Test(priority=1)
  public void deletemp() {
	  System.out.println("deleted new emp");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("logout completed");
  }

}
