package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
	}
	public static WebDriver driver;
	public FileLib f=new FileLib();
//	WebDriverCommonLib w=new WebDriverCommonLib();
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		String browserName = f.getPropertyValue("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		driver=new ChromeDriver();
		else if(browserName.equalsIgnoreCase("firefox"))
		driver=new FirefoxDriver();
		else if(browserName.equalsIgnoreCase("ie"))
		driver=new InternetExplorerDriver();
		
		//w.pageLoadTimeout();
		
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	@BeforeMethod
	public void loginApp() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL=f.getPropertyValue("url");
		String Username=f.getPropertyValue("username");
		String Password=f.getPropertyValue("password");
		driver.get(URL);
		
		LoginPage l=new LoginPage(driver);
		l.setUser(Username, Password);
	}
	@AfterMethod
	public void logoutApp()
	{
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.logoutClick();
	}
}
