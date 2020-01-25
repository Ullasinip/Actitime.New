package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// set the chromedrive.exe path 

		//	System.setProperty("webdriver.chrome.driver", "D:\\QSpiders_2019\\Workspace\\Automation\\driver\\chromedriver.exe"); //Absolute path
		//	or
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); //relative path

		ChromeDriver driver=new ChromeDriver();
		
		
		//enter url
		driver.get("https://www.seleniumhq.org/");

		//print the title on the console
		System.out.println(driver.getTitle());

		//close the browser
		driver.close();
	}

}
