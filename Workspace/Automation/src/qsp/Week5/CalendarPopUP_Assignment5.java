package qsp.Week5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarPopUP_Assignment5 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.religarehealthinsurance.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Renew']")).click();
		//driver.findElement(By.linkText("Renew")).click();
		Thread.sleep(2000);
		Set<String> allWH = driver.getWindowHandles();
		System.out.println(allWH.size());
		for(String wh:allWH)
		{
		driver.switchTo().window(wh);
		if(driver.getTitle().contains("Renewal"))
		{
		driver.findElement(By.id("policynumber")).sendKeys("1234567890");
		//driver.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='31']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='alternative_number']")).sendKeys("8085223456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();
		}
		}
		driver.quit
		();

	}

}
