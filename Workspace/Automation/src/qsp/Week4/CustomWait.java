package qsp.Week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		try
		{
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Page is loaded in 5 seconds");
		}
		catch(Exception e)
		{
			System.out.println("Page not loaded in 5 seconds");
		}
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();//. can also be used in the place of text()
		while(true)	//enters the while loop irrespective of any condition. since it is TRUE
		{
			try 
			{
				driver.findElement(By.linkText("Logout")).click();
				break; //once the Logout button is found and clicked, comes out of the while loop.
			}
			catch(Exception e)
			{
				
			}
		}
		 driver.close();

	}

}
