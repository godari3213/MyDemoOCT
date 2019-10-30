package demoOct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DriverControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = MyDrivers999.getDriver("CRM");
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
//		driver.close();
		driver.quit();
		driver.getTitle();
		String S1 =driver.findElement(By.xpath("")).getText();
		String S2 = driver.getCurrentUrl();
		String S3 =driver.getPageSource();
	}
}
