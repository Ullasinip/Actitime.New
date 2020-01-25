package qsp.Week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsEx {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/getElements.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println("Number of links in the page:"+count);
		for(int i=0;i<count;i++)
		{
			WebElement we=allLinks.get(i);
			// we.click();
			String linkText=we.getText();
			System.out.println(linkText);
		}
		driver.close();

	}

}
