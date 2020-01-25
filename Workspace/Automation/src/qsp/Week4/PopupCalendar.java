package qsp.Week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupCalendar {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click(); //Selecting Departure
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[.='31'])[1]")).click(); //Selecting December 31
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
