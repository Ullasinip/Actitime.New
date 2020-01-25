package qsp.Week4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBoxGetWrappedEle {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/MultiSelect.html");
		WebElement ele=driver.findElement(By.id("MTR"));
		Select s=new Select(ele);
	
		if(s.isMultiple())
		{
			WebElement allOptions=s.getWrappedElement(); //getWrappedElement() is used to print all the options in the list box w/o using for loop.
			System.out.println(allOptions.getText());
		}
	
	}
}