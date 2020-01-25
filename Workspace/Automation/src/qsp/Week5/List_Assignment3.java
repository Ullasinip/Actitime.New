package qsp.Week5;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Assignment3
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\QSpiders_2019\\html\\MultiSelect.html");
		WebElement ele = driver.findElement(By.id("MTR"));
		Select s=new Select(ele);
		List<WebElement> allOptions = s.getOptions();
		System.out.println("The list items in the MTR in reverse order are:\n");
		for(int i=allOptions.size()-1;i>=0;i--)
		{
			
			String menu=allOptions.get(i).getText();
			System.out.println(menu);
		}
	}
}
