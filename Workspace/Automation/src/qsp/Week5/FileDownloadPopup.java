package qsp.Week5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[.='Java']/../td[4]/a[.='Download']")).click();
		
		Robot r=new Robot(); //For File Upload pop up we use Robot class
		
		//To select Open With radio button(Alt+O)
		
		
		//To select Save radio button (Alt+S)
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_S);
		
		//To select the check box (Alt+A)
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_A);
		
		Thread.sleep(3000);
		
		
		//To press OK button(Enter)
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		driver.close();
		
	}

}
