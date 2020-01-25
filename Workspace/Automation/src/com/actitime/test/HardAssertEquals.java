package com.actitime.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertEquals {
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
		
		SoftAssert s=new SoftAssert(); //SoftAssert methods are non-static.
		s.assertEquals(ExpectedTitle, ActualTitle); //Irrespective of its fail or pass,further statements will be executed.
		
		driver.close(); 
		s.assertAll();
		
		//any statements after s.assertAll() will be executed only if the assert is pass. If it is fail it will behave like Hard Assert and the statements after asserAll() will not be executed.
		
		
		
	}

}
