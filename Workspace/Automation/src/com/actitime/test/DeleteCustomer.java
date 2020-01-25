 package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class DeleteCustomer extends BaseClass {
	@Test(groups= {"regression"})
	public void testDeleteCustomer()
	{
		Reporter.log("DeleteCustomer",true);
	}
}
