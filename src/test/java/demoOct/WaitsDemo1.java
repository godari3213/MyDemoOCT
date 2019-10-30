package demoOct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = MyDrivers999.getDriver("CRM");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
	
		Thread.sleep(5000);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	}
}
