package qsp.Week5;


import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class List_Assignment2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/MultiSelect.html");
		WebElement ele=driver.findElement(By.id("MTR"));
		Select s=new Select(ele);
		List<WebElement> allOptions = s.getOptions();
		HashSet hs=new HashSet<String>();
		System.out.println("The options in the MTR are:");
		for(int i=0;i<allOptions.size();i++)
		{
			String menu=allOptions.get(i).getText();
			System.out.println(menu);
		}
		System.out.println("The duplicate elements in the MTR list are:");
		for(WebElement e:allOptions)
		{
			String menu=e.getText();
			if(hs.add(menu)==false)
			{
				System.out.println(menu);
				s.selectByVisibleText(menu);
			}
		}
		
		driver.close();
	}

}
