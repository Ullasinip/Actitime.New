package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(name="username")
	private WebElement UNTextBox;
	
	@FindBy(name="pwd")
	private WebElement PwdTextBox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setUser(String un,String pwd)
	{
		UNTextBox.sendKeys(un);
		PwdTextBox.sendKeys(pwd);
		LoginButton.click();
	}
	
}
