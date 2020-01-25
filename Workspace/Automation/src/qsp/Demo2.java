package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();

		//Enter the URL in the address bar of the web page
		driver.get("https://www.naukri.com");
		
		//Get the title
		System.out.println(driver.getTitle());
		
		//Close the browser
		driver.quit();
		
	}

}
