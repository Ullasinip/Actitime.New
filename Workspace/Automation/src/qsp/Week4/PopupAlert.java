package qsp.Week4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupAlert {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.services.irctc.co.in/homebody.html");
		driver.manage().window().maximize();
	
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Alert is displayed. To handle it, control the transfer to Alert window
		
		//Code optimization
		//switch to alert
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText()); 
		a.accept();
		driver.quit();
		

	}

}
