package qsp.Week5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NotificationPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		//To disable notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		//pass the CromeOptions reference variable to the ChromeDriver constr
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.cleartrip.com/");
		driver.close();
		
	}

}
