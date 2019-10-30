package demoOct;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataProviderDemo1 {
	
WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String n, String s) throws InterruptedException {
	  driver = MyDrivers999.getDriver("CRM");
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys(n);
	  driver.findElement(By.name("password")).sendKeys(s);
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(5000);
	  String A_title =   driver.getTitle();
	String E_title =  "Find a Flight: Mercury Tours: ";
	Assert.assertEquals(A_title, E_title);  //
	
	SoftAssert sft = new SoftAssert();   // soft assert
	sft.assertEquals(A_title, E_title);
	System.out.println("login Success");
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
    };
  }
}
