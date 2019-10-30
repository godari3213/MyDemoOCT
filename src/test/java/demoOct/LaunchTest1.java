package demoOct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

}
