package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	//@FindBy(xpath="(//a[@id='dropdownMenu1']")

	@FindBy(xpath="(//a[normalize-space()='deepak sangwani'])[1]")
	//private WebElement cardNbr;
	
	private WebElement dropdown;
	
	@FindBy(linkText="Logout")
	private WebElement logoutBtn;
	
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutUser() throws InterruptedException
	{
		dropdown.click();
		Thread.sleep(2000);
		logoutBtn.click();
	}
}
