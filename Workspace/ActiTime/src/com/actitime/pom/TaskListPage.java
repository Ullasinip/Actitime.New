package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[.='Add New']")
private WebElement AddNewBtn;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement NewCustomerBtn;

@FindBy(xpath="//input[contains(@class,'inputNameField')]")
private WebElement EnterCustomerNameTxtBox;

@FindBy(xpath="//textarea[contains(@placeholder,'Enter Customer Description')]")
private WebElement DescriptionTxtBox;

@FindBy(xpath="//div[@class='emptySelection']")
private WebElement CustomerListBx;

@FindBy(xpath="//div[.='Our company' and contains(@class,'ItemRow')]")
private WebElement OurCompany;

@FindBy(xpath="//div[contains(.,'Create Customer') and contains(@class,'components_button  withPlusIcon')]")
private WebElement CreateCustomerBtn;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
private WebElement ActualText;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewBtn() {
	return AddNewBtn;
}

public WebElement getNewCustomerBtn() {
	return NewCustomerBtn;
}

public WebElement getEnterCustomerNameTxtBox() {
	return EnterCustomerNameTxtBox;
}

public WebElement getDescriptionTxtBox() {
	return DescriptionTxtBox;
}

public WebElement getCustomerListBx() {
	return CustomerListBx;
}

public WebElement getOurCompany() {
	return OurCompany;
}

public WebElement getCreateCustomerBtn() {
	return CreateCustomerBtn;
}

public WebElement getActualText() {
	return ActualText;
}


}