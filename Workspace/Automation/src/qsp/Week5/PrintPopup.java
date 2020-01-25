package qsp.Week5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//for Ctrl+P we can use Robot class or sendKeys since the control is still in browser.
		//Once the control gets transferred to poup, we have to use Robot class itself for the keyboard actions.
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		
		Thread.sleep(3000);
		
		//For selecting Pages radio button, ALT+G
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_G);
		
		Thread.sleep(3000);
		
		//Enter pages as 2 to 4
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_4);
		r.keyRelease(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_4);
		
		Thread.sleep(3000);
		
		//For selecting the number of copies
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_2);
		
		Thread.sleep(3000);
		
		//For clicking on Print button, ALT+P or ENTER
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_P);
		
		
		//driver.close();
	}

}
