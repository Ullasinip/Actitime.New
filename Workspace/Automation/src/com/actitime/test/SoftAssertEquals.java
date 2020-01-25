package com.actitime.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssertEquals {
	@Test
	public void testLogin()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String ExpectedTitle="actiTIME - Login";
		String ActualTitle=driver.getTitle();
		
		/*
		 * if(ExpectedTitle.equals(ActualTitle)) { Reporter.log("Pass",true); } else {
		 * Reporter.log("Fail",true); Assert.fail(); //Only with Assert.fail the test
		 * case will be failed. If this statement no mentioned, the test will always
		 * pass. }
		 */
		
		//OR
		
		Assert.assertEquals(ExpectedTitle, ActualTitle); //If pass, TC will Pass and Pass is printed else TC will fail and Fail is printed.
		
		driver.close(); //This statement will be executed only if the TC is pass. If its fail, the remaining statement will not be executed. So, we use Soft Assert.
		
		
		
		
		
	}

}
