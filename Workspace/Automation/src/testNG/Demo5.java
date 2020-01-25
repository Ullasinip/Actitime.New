package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo5 {
	@Test
	public void createUser()
	{
		Reporter.log("CreateUser",true);
	}

	@Test
	public void deleteUser()
	{
		Reporter.log("DeleteUser",true);
	}

	@Test(invocationCount=2)
	public void modifyUser()
	{
		Reporter.log("ModifyUser",true);
	}
	
	@BeforeMethod //executed before each of the 3 test methods above
	public void openApp()
	{
		Reporter.log("openApp",true);
	}
	@AfterMethod //executed after each of the 3 test methods above
	public void closeApp()
	{
		Reporter.log("closeApp",true);
	}
}
