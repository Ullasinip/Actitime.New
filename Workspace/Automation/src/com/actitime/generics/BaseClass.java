package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.*;

import com.actitime.pom.LoginPage;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
	}
	public static WebDriver driver;
	FileLib f=new FileLib();  //com.actime.generics/FileLib.java
	String path="./data/config.properties.txt"; //path of config.properties file
	
	@BeforeTest
	public void openBrowser() throws IOException  
	{
		String browserName = f.getPropertyValue(path, "browser"); //to read it from property file
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
   		String url = f.getPropertyValue(path, "url");
   		driver.manage().window().maximize();
   		Thread.sleep(2000);
   		
		driver.get(url);
		
		String userName=f.getPropertyValue(path, "username");
		String pwd=f.getPropertyValue(path, "password");
		
		LoginPage lp=new LoginPage(driver); //com.actime.pom/LoginPage
		lp.setUser(userName, pwd);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException 
	{
		Thread.sleep(3000);
		EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
		ettp.logoutClick();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
