package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertClass {
	@Test
	public void testLogin()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String ExpectedTitle="actiTIME - Login";
		String ActualTitle=driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle))
		{
			Reporter.log("Pass",true);
		}
		else
		{
			Reporter.log("Fail",true);
		}
		
	}

}
