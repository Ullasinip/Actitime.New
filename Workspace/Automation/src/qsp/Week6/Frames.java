package qsp.Week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/QSpiders_2019/html/Page1.html");
		driver.findElement(By.id("d1")).sendKeys("qsp");
		driver.switchTo().frame(0);
		driver.findElement(By.id("d2")).sendKeys("jsp");

	}

}
