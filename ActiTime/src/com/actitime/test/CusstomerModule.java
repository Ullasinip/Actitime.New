package com.actitime.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class CusstomerModule extends BaseClass {

	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	TaskListPage t=new TaskListPage(driver);
	
	@Test
	public void testCreateCustomer() throws InterruptedException, IOException
	{
		Reporter.log("testCreateCustomer",true);
		String CustomerName=f.getExcelData("CreateCustomer", 1, 0);
		String CustomerDesc=f.getExcelData("CreateCustomer", 1, 1);
		
		Thread.sleep(3000);
		
		e.getTasksTab().click();
		//	TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		Thread.sleep(2000);
		t.getNewCustomerBtn().click();
		Thread.sleep(2000);
		t.getEnterCustomerNameTxtBox().sendKeys(CustomerName);
		t.getDescriptionTxtBox().sendKeys(CustomerDesc);
		Thread.sleep(2000);
		t.getCustomerListBx().click();
		Thread.sleep(2000);
		t.getOurCompany().click();
		t.getNewCustomerBtn().click();
		String ActualText=t.getActualText().getText();
		Assert.assertEquals(CustomerName, ActualText);
	}
}
