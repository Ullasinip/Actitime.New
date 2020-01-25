package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPOM {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPagePOM lp=new LoginPagePOM(driver);
		lp.setUser("admin1", "manager1");
		Thread.sleep(3000);
		lp.setUser("admin", "manager");
	driver.close();
	
	}

}
