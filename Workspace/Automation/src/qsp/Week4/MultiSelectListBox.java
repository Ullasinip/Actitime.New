package qsp.Week4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	} 
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/MultiSelect.html");
		WebElement ele=driver.findElement(By.id("MTR"));
		Select s=new Select(ele);
		s.selectByIndex(0); //starts from 0
		Thread.sleep(2000);
		s.selectByValue("D"); //Values present in value attribute under Options tag
		Thread.sleep(2000);
		s.selectByVisibleText("Poori"); //text present between > <
		List<WebElement> allOptions = s.getOptions();
		for(int i=0;i< allOptions.size();i++) //select all the options in the list box
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		//get the text of all the items in the list box
		for(int i=0;i<allOptions.size();i++)
		{
			s.selectByIndex(i);
			String menu = allOptions.get(i).getText();
			System.out.println(menu);
		}
		if(s.isMultiple()) //if list is multiselect
		{
		s.deselectAll();
		}
		else
			System.out.println("List is not multiselect");
	}

}
