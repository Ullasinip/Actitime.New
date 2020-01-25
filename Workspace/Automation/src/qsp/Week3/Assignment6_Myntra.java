package qsp.Week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6_Myntra {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/gini-and-jony-boys-blue-regular-fit-mid-rise-clean-look-stretchable-jeans-with-suspenders");
		String s=driver.findElement(By.xpath("//img[@title='Gini and Jony Boys Blue Regular Fit Mid-Rise Clean Look Stretchable Jeans with Suspenders']")).getAttribute("title");
		System.out.println("Name of the item to be searched is:"+s);
		String ele1=driver.findElement(By.xpath("//img[@title='Gini and Jony Boys Blue Regular Fit Mid-Rise Clean Look Stretchable Jeans with Suspenders']/../../../../../../..//span[text()='1439']")).getText();
		System.out.println("The Price of "+s+" in Myntra is:"+ele1);
		driver.close();

	}
}
