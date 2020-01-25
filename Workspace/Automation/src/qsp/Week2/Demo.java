package qsp.Week2;

import org.openqa.selenium.WebDriver;

public class Demo {
	static void test(WebDriver  driver)
	{
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
