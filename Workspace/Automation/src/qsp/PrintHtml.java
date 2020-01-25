package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtml {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String html = driver.getPageSource();
	
	System.out.println(html);
	
	driver.close();

	}

}
