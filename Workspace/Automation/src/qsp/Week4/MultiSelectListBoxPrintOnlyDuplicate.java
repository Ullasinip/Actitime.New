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

public class MultiSelectListBoxPrintOnlyDuplicate {

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
		
		
		System.out.println("=============");
		//Print only the duplicates
		System.out.println("Duplicate elements in the list:");
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			if(allText.add(text)==false) //Idly does not get added in to the HasSet for the second time so will be set to false and then print it.
			{
				System.out.println(text);
			
				//click on the duplicate option
				s.selectByVisibleText(text); //since Idly is text, we use Visible text. Since it is enhanced for loop, s.selectbyIndex() cannot be used
			}
		}
		driver.close();
	}
}

