package qsp.Week5;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWH = driver.getWindowHandles();
		System.out.println(allWH.size());
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			String title=driver.getTitle();
		//	System.out.println(driver.switchTo().window(wh).getTitle());
			System.out.println(title);
			Thread.sleep(2000);
			if(title.contains("LnT"))
				driver.close();
	//		driver.close(); // close all the browsers one by one w/o quit()
		}
		//driver.quit();
	}

}
