package qsp.Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox2 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/MultiSelect.html");
		WebElement ele=driver.findElement(By.id("SLV"));
		Select s=new Select(ele);
		List<WebElement> allOptions = s.getOptions();
		ArrayList<String> allText = new ArrayList<String>();
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			System.out.println(text);
			allText.add(text);
		}
		System.out.println("=============");
		Collections.sort(allText);
		for(String sortedText:allText)
		{
			System.out.println(sortedText);
		}
		driver.close();
		
	}
}


