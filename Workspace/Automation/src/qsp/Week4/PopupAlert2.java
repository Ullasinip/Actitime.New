package qsp.Week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupAlert2 {
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
		//Thread.sleep(2000)
		//Instead of thread.sleep() there is alertIsPresent() method  in WebDriverWait class. It will wait till the alert is displayed. 
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		
	System.out.println(driver.switchTo().alert().getText()); //Get the text in the alert.
		driver.switchTo().alert().accept(); //Click on OK
		driver.quit();
		

	}

}
