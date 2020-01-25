package qsp.Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/sampledemo.html");
		driver.findElement(By.xpath("./html/body/a")).click();
		driver.close();
		

	}

}
