package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(priority=1)
	public void createUser()
	{
		Reporter.log("CreateUser",true);
	}

	@Test(dependsOnMethods="createUser")
	public void deleteUser()
	{
		Reporter.log("DeleteUser",true);
	}

	@Test(invocationCount=2,priority=3)
	public void modifyUser()
	{
		Reporter.log("ModifyUser",true);
	}
}
