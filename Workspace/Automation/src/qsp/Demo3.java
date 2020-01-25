package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();

		//Enter the URL in the address bar of the web page
		
		//enter the URL using navigate method
		driver.navigate().to("https://www.google.com/");
		//enter the URL using get metohd
		driver.get("https://www.gmail.com/");
		
		//Wait for 2 seconds
		Thread.sleep(2000);
		
		//click on back button
		driver.navigate().back();
		
		//wait for 2 seconds
		Thread.sleep(2000);
		
		//click on forward button
		driver.navigate().forward();
		
		//wait for 2 seconds
		Thread.sleep(2000);
		
		//click on refresh button
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Close the browser
		driver.quit();
	}
}