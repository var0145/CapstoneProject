package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	@FindBy(xpath="//input[@id='cardNumber']")
	private WebElement cardNbr;
	
	@FindBy(xpath="//input[@id='expityMonth']")
	private WebElement expMnth;
	
	@FindBy(xpath="//input[@id='expityYear']")
	private WebElement expYr;
	
	@FindBy(xpath="//input[@id='cvCode']")
	private WebElement cvvNbr;
	
	@FindBy(linkText="Pay")
	private WebElement payBtn;
	
	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cardNumberDetails() 
	{
		cardNbr.sendKeys("BR12456");
	}
	
	public void expiryMonthDetails() 
	{
		expMnth.sendKeys("12");
	}
	
	public void expiryYearDetails() 
	{
		expYr.sendKeys("2024");
	}
	
	public void cvvNumberDetails() 
	{
		cvvNbr.sendKeys("1234");
	}
	
	public void PayBtn() 
	{
		payBtn.click();
	}
}
