package qsp.Week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

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
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));//it will wait for 10 seconds or till the title as mentioned is displayed.
		System.out.println(driver.getTitle());
		//driver.getTitle(); It will return the incorrect title of login page and not home page because the home page loads very fast. That is why we use explicit wait.
		driver.findElement(By.linkText("Logout")).click();
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(driver.getTitle()); 
		driver.close();

	}

}
