package qsp.Week3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);

		//actiTime image is displayed in the login page
		boolean b1=driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		if(b1)
			System.out.println("actiTime Image is displayed"); 
		else System.out.println("actiTime Image is not displayed");

		//actiTime version is present or not
		String ExpectedResult="actiTIME 2019.3 Pro";
		String ActualResult=driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]")).getText();
		System.out.println("actiTime version displayed is:"+ActualResult);
		if(ActualResult.equals(ExpectedResult))
			System.out.println("actiTime version is displayed and matching");
		else System.out.println("actiTime version is not displayed");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(2000);
		
		
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='addTasksButton']"))).click();
		
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		driver.findElement(By.xpath("//span[text()='Meetings']")).click();
		driver.close();
	}

}