package qsp.Week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/QSpiders_2019/html/Page1.html");
		driver.findElement(By.id("d1")).sendKeys("q");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("d2")).sendKeys("j");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("d1")).sendKeys("s");
		driver.switchTo().frame("f1");
		Thread.sleep(2000);
		driver.findElement(By.id("d2")).sendKeys("s");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("d1")).sendKeys("p");
		WebElement we=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(we);
		Thread.sleep(2000);
		driver.findElement(By.id("d2")).sendKeys("p");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.close();
		

	}

}
