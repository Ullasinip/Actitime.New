package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(id="logoutLink")
	private WebElement LogoutLink;
	
	@FindBy(id="container_tasks")
	private WebElement TasksTab;
	
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutClick()
	{
		LogoutLink.click();
	}
	
	public void taskTabClick()
	{
		TasksTab.click();
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getTasksTab() {
		return TasksTab;
	}
}
