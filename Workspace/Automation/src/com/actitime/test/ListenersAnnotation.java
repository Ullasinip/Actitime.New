package com.actitime.test;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generics.ListernersClass.class)
public class ListenersAnnotation {
	@Test
	public void createUser()
	{
		Reporter.log("createUser",true);
		Assert.fail();
	}

}
