package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	
	@FindBy(name="username")
	private WebElement UNTxb;

	@FindBy(name="pwd")
	private WebElement PwdTxb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBtn;
	
	LoginPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setUser(String Username,String Password)
	{
		UNTxb.sendKeys(Username);
		PwdTxb.sendKeys(Password);
		LoginBtn.click();
	}

}	
