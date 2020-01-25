package com.actitime.generics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DemoClass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
	}
	
	public static WebDriver driver;
	
	@Test
	public void testBrowser()
	{
		//To read it from user in command line
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser");
		String browser=sc.nextLine();
		
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			  driver=new InternetExplorerDriver();
		}
		
		driver.get("http://google.com");
		driver.getTitle();
		driver.close();
	}
	
}
