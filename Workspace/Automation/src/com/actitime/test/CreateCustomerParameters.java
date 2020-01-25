package com.actitime.test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.*;

public class CreateCustomerParameters extends BaseClassParameters {
	@Test(groups= {"smoke","regression"})
	public void testCreateCustomer()
	{
		Reporter.log("CreateCustomer",true);
	}
	
	/*
	 * public void testModifyCustomer()
	
	@Test
	{
		Reporter.log("ModifyCustomer",true);
	}
	@Test
	public void testDeleteCustomer()
	{
		Reporter.log("DeleteCustomer",true);
	}
	*/

}
