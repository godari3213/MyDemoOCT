package demoOct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LocatorsDemo123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = MyDrivers999.getDriver("CRM");
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();  //full screen
		Thread.sleep(3000);
		Dimension d = new Dimension(300,600); // define your desired size x,y
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p = new Point(300,700);  // to change the orgin to a desired point x,y
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.close();
		
		WebElement Uname = driver.findElement(By.name("userName"));
		Uname.sendKeys("demo");
		driver.findElement(By.name("userName")).sendKeys("demo");
		
		WebElement Pswrd = driver.findElement(By.name("password"));
		Pswrd.sendKeys("demo");
		WebElement Sbmt = driver.findElement(By.name("login"));
		Sbmt.click();
		String E_Title = "dfsfds ";
		String A_Title =driver.getTitle();
		if(A_Title.equals(E_Title))
		{
			System.out.println("login success");
		}
		else
		{
			System.out.println("login failure");
		}
	List<WebElement> T_link =driver.findElements(By.tagName("a"));
    int Tn_links =		T_link.size();
    System.out.println("the total no links in the page are" + Tn_links);
    for (int i=0;i<Tn_links;i++)
    {
    	String Ltext = T_link.get(i).getText();
    System.out.println(Ltext);
	}
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
	Select sel1 = new Select(driver.findElement(By.name("country")));
	sel1.selectByVisibleText("TOGO");
	}
	

}
