package qsp.Week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_Amazon {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		String ExpectedText="actiTIME 2017.3";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=lifes+amazing+secret+by+gaur+gopal+das&crid=4HZJLLU0PITX&sprefix=lifes+amazing%2Caps%2C274&ref=nb_sb_ss_i_1_13 ");
		String s=driver.findElement(By.xpath("(//span[text()=\"Life's Amazing Secrets\"])[1]")).getText();
		System.out.println("Name of the item to be searched is:"+s);
		String ele1=driver.findElement(By.xpath("(//span[text()=\"Life's Amazing Secrets\"])[1]/../../../../../../../..//span[@class='a-price-whole' and text()='190']")).getText();
		System.out.println("The Price of "+s+" in Amazon is:"+ele1);
		driver.close();

	}

}
