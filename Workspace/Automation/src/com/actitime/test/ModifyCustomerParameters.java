package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.BaseClassParameters;

public class ModifyCustomerParameters extends BaseClassParameters {
	@Test(groups="regression")
	public void testModifyCustomer()
	{
		Reporter.log("ModifyCustomer",true);
	}
}
