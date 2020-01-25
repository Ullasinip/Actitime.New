package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Ullasini P
 *
 */
public class LoginPage {
	@FindBy(id="username")
	private WebElement UNTxtBx;
	@FindBy(name="pwd")
	private WebElement PWTxtBx;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getUNTxtBx() {
		return UNTxtBx;
	}

	public WebElement getPWTxtBx() {
		return PWTxtBx;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	/**
	 * Business logic method for Login
	 */
	public void setUser(String un,String pwd)
	{
		UNTxtBx.sendKeys(un);
		PWTxtBx.sendKeys(pwd);
		LoginBtn.click();

		
	}
}
