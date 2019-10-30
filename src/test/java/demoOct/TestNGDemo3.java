package demoOct;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemo3  {
  @Test(invocationCount=5, enabled=false)
  public void Login() {
	  System.out.println("hi this is for login");
  }
  @Test(groups= {"Sanity", "Regression"})
  public void launch() {
	  System.out.println("hi this is for launch");
  }
  @Test(groups= {"Sanity"})
  public void registration() {
	  System.out.println("hi this is for registration");
  }
  @Test(groups= {"Smoke","UAT"})
  @Parameters({"location", "DCNO"})
  public void AddCart(String location , String DCNO ) {
	  System.out.println("hi this is for AddCart");
	  System.out.println(location);
	  System.out.println(DCNO);
  }
  @Test(groups= {"Regression","UAT"})
  @Parameters({"location", "DCNO"})
  public void RemoveCart(String location , String DCNO ) throws AWTException {
	  System.out.println("hi this is for RemoveCart");
	  System.out.println(location);
	  System.out.println(DCNO);
	  
//	  Robot rb1 = new Robot();
//	  rb1.keyPress(KeyEvent.VK_TAB);
  }
}
