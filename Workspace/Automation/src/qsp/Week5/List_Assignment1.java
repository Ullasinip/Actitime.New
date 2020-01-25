package qsp.Week5;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Assignment1 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/MultiSelect.html");
		WebElement ele = driver.findElement(By.id("MTR"));
		Select s=new Select(ele);
		List<WebElement> allOptions = s.getOptions();
				
		System.out.println("MTR Options are:");
		for(int i=0;i<allOptions.size();i++)
		{
			s.selectByIndex(i);
			String menu=allOptions.get(i).getText();
			System.out.println(menu);
		}
		
		System.out.println("MTR Options after removing duplicates are:");
		HashSet<String> hs = new HashSet<String>();
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			hs.add(text);
		}
		for(String uniqueText:hs)
		{
			System.out.println(uniqueText);
		}
		
		driver.close();

	}

}
