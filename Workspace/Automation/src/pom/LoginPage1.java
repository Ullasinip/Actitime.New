package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	private WebElement UNTxb;
	private WebElement PwdTxb;
	private WebElement LoginBtn;
	
	LoginPage1(WebDriver driver)
	{
		UNTxb=driver.findElement(By.name("username"));
		PwdTxb=driver.findElement(By.name("pwd"));
		LoginBtn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setUser(String Username,String Password)
	{
		UNTxb.sendKeys(Username);
		PwdTxb.sendKeys(Password);
		LoginBtn.click();
	}

}
