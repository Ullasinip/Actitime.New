package com.actitime.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenshotClass {
@Test
public void testScreenshot() throws IOException
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
//RemoteWebDriver r=(RemoteWebDriver) driver;//Downcasting. TakesScreenshot Interface cant be accessed from WebDriver so downcast to RemoteDriver and then use methods of TakesScreenshot interface.
//OR
TakesScreenshot t=(TakesScreenshot) driver; //typecasting since we need only getScreenshotAs() method.

File source = t.getScreenshotAs(OutputType.FILE); //Screenshot is took in file format
File target=new File("./Screenshots/ss.png"); //Create a new file with .png format under Screenshots folder in current Project folder.

//copy file (Copied by pressing PrtSc) to ss.png
FileUtils.copyFile(source, target); //Jar file required to use FileUtils.

}
}
