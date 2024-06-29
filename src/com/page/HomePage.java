package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//@FindBy(xpath="(//a[@class='btn btn-primary pull-right'][normalize-space()='View'])[3]")
	
	@FindBy(xpath="(//a[@class='btn btn-primary'][normalize-space()='More Products'])[2]")
	
	//@FindBy(xpath="//a[@href=/medicare/show/all/products]")
	private WebElement view;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickViewItem() {
		view.click();
	}

}
