package com.actitime.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class ValidLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		FileLib f=new FileLib();
		
		String url=f.getPropertyValue("./data/commondata.properties", "url");
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		String username=f.getPropertyValue("./data/commondata.properties", "username");
		String password=f.getPropertyValue("./data/commondata.properties", "password");
		
		LoginPage l=new LoginPage(driver);
		l.setUser(username,password);
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.logoutClick();
		
		driver.close();
		
	}
}
