package qsp.Week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/QSpiders_2019/html/Button.html");
		Thread.sleep(2000);

		//Clear contents of A1 text box
		WebElement ele1=driver.findElement(By.xpath("//input[@type='text' and @value='A']"));
		ele1.clear();
		Thread.sleep(2000);

		//print length and width of B1 textbox
		System.out.println("Width of B textbox:"+driver.findElement(By.xpath("//input[@type='text' and @value='B']")).getSize().getWidth());
		System.out.println("Height of B textbox:"+driver.findElement(By.xpath("//input[@type='text' and @value='B']")).getSize().getHeight());

		//if C1 checkbox is selected
		WebElement b1=driver.findElement(By.xpath("//input[@type='checkbox' and @checked]"));
		if(b1.isSelected())
		{
			System.out.println("The c1 checkbox is selected");
		}
		else
			System.out.println("The checkbox is not selected. Please select the checkbox");
		b1.click();


		//if Button A is enabled or not
		boolean b2=driver.findElement(By.xpath("//input[@type='button' and @value='A']")).isEnabled();
		if(b2)
			System.out.println("A1 button is enabled");
		else System.out.println("A1 button is not enabled");

		driver.close();
	}

}
