package demoOct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDrivers999 {

	public static WebDriver getDriver(String Bname) {
		// TODO Auto-generated method stub
		
		if(Bname.equals("CRM"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(Bname.equals("IEEE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\Drivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else if(Bname.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else
			return null;

	}

}
