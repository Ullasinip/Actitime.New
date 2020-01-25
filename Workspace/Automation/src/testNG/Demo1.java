package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
@Test(priority=1)
public void createUser()
{
	Reporter.log("CreateUser",true);
}

@Test(priority=0)
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
