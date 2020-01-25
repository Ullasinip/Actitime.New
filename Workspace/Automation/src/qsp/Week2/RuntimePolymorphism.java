package qsp.Week2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphism {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Demo.test(driver);
	
		WebDriver driver1=new FirefoxDriver();
		Demo.test(driver1);
		driver.close();
		driver1.close();

	}

}
