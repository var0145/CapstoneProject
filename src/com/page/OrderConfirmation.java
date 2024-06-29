package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation {
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successmsg;
	
	
	@FindBy(linkText="Continue Shopping")
	private WebElement continueBtn;
	
	
	public OrderConfirmation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String getSuccessMessage()
	{
		String successMsg=successmsg.getText();
		return (successMsg);
	}
	
	public void continueShoppingBtn()
	{
		continueBtn.click();
	}

}
