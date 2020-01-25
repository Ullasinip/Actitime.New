package qsp.Week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Flipkart {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=redmi+7s&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_0_8_na_na_pr&otracker1=AS_QueryStore_OrganicAutoSuggest_0_8_na_na_pr&as-pos=0&as-type=RECENT&suggestionId=redmi+7s%7Cin+Mobiles&requestId=dff7886f-d4ff-4412-9c4d-83dd7502036b&as-backfill=on");
		String s=driver.findElement(By.xpath("//div[@class='_3wU53n' and contains(text(),'Sapphire Blue, 64 GB)')]")).getText();
		System.out.println("Name of the item to be searched is:"+s);
		String ele1=driver.findElement(By.xpath("//div[@class='_3wU53n' and contains(text(),'Sapphire Blue, 64 GB)')] /../..//div[@class='_1vC4OE _2rQ-NK']")).getText();
		//OR 
		// div[text()='Redmi Note 7S (Sapphire Blue, 64 GB)']/../../div[2]/div[1]/div/div[1]	
		//OR
		//div[.='Redmi Note 7S (Sapphire Blue, 64 GB)']/../../div[2]/div[1]/div/div[1]
		System.out.println("The Price of "+s+" in Flipkart is:"+ele1);
		driver.close();

	}

}
