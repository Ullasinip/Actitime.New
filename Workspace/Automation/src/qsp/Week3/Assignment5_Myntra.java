package qsp.Week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_Myntra {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
		String s=driver.findElement(By.xpath("//img[contains(@title,'Anouk Women Blue Printed Kurta with Trousers')]")).getAttribute("title");
		System.out.println("Name of the item to be searched is:"+s);
		String ele1=driver.findElement(By.xpath("//img[contains(@title,'Anouk Women Blue Printed Kurta with Trousers')]/../../../../../..//span[text()='2899']")).getText();
		System.out.println("The Price of "+s+" in Myntra is:"+ele1);
		driver.close();

	}
}
