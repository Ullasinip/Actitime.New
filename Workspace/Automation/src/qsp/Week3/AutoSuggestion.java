package qsp.Week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
//Find the Search text box in google website
	driver.findElement(By.name("q")).sendKeys("java");
	Thread.sleep(3000);
	List<WebElement> allAutoSuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	int count=allAutoSuggestion.size();
	System.out.println("Number of auto suggestions:"+count);
	for(int i=0;i<count;i++)
	{
		String text=allAutoSuggestion.get(i).getText();
		System.out.println(text);
	}
	allAutoSuggestion.get(0).click();
	driver.close();
}
}
 