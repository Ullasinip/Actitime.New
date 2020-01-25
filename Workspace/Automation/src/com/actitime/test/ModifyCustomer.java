package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ModifyCustomer extends BaseClass {
	@Test(groups="regression")
	public void testModifyCustomer()
	{
		Reporter.log("ModifyCustomer",true);
	}
}
