 package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.BaseClassParameters;

public class DeleteCustomerParameters extends BaseClassParameters {
	@Test(groups= {"regression"})
	public void testDeleteCustomer()
	{
		Reporter.log("DeleteCustomer",true);
	}
}
