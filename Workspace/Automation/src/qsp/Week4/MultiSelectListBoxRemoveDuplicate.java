package qsp.Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBoxRemoveDuplicate {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/MultiSelect.html");
		WebElement ele=driver.findElement(By.id("MTR"));
		Select s=new Select(ele);
		List<WebElement> allOptions = s.getOptions();
		HashSet<String> allText = new HashSet<String>();
		
		System.out.println("All options in the list:");
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			System.out.println(text); //print all the options
			allText.add(text);
		}
		System.out.println("=============");
		//remove duplicates and print only the unqiue ele
		System.out.println("Unique elements in the list:");
		for(String uniqueText:allText)
		{
			System.out.println(uniqueText);
		}
		driver.close();
	}
}

