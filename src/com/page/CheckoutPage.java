package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	//@FindBy(xpath="//input[@id='count_2']")
	
	@FindBy(xpath="//input[@class='form-control text-center']")
	
	private WebElement quantity;
	
	
	//@FindBy(xpath="(//button[@type='button'][contains(@name,'refreshCart')]")
	
	@FindBy(xpath="//button[@name='refreshCart']")
	
	private WebElement refreshBTN;
	
	@FindBy(linkText="Checkout")
	private WebElement checkoutBTN;
	
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void refreshButton()
	{
		refreshBTN.click();
	}
	public void provideQuantity()
	{
		
		quantity.clear();
		quantity.sendKeys("2");
	}
	
	
	
	public void CheckOutButton() throws InterruptedException
	{
		Thread.sleep(3000);
		checkoutBTN.click();
	}
	
	
	
}
