package qsp.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebPage {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/sampledemo.html");
		WebElement e=driver.findElement(By.tagName("a"));
		e.click();
		driver.close();
		

	}

}
