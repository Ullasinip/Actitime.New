package qsp.Week4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupFileUpload {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:\\Users\\TechEng\\Desktop\\SYNOPSIS.docx");
		
		Alert a=driver.switchTo().alert();
		WebElement ele=driver.findElement(By.xpath("//span[.=' File uploaded successfully ']"));
		if(ele.isDisplayed())
		System.out.println("File is uploaded successfully");
		else
		System.out.println("File not uploaded");
		
		driver.close();
		

	}

}
