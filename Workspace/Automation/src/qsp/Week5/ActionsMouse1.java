package qsp.Week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouse1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Mouse over Resources tab
		Actions a=new Actions(driver);
		WebElement resources=driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		a.moveToElement(resources).perform();
		
		Thread.sleep(2000);
		
		//Click on Contact
		driver.findElement(By.xpath("//h6[contains(.,'Contact')]")).click();
		
		Thread.sleep(2000);
		
		//Print the phone number in console
		String phoneNumber=driver.findElement(By.xpath("//p[text()='Human Resources']/../../../div[2]//p")).getText();
		System.out.println("Phone number is:"+phoneNumber);
		
		driver.close();

	}

}
