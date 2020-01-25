package qsp.Week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List1 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.id("day"));
		Select s=new Select(ele);
		s.selectByIndex(4); //starts from 0
		Thread.sleep(2000);
		s.selectByValue("3"); //Values present in value attribute under Options tag
		Thread.sleep(2000);
		s.selectByVisibleText("9"); //text present between > <
		
	}

}
