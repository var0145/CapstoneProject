package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	/*@FindBy(xpath="(//td[normalize-space()='20']")
	private WebElement quantityAvailableBeforePurchase; */
	
	
	@FindBy(xpath="(//a[@class='btn btn-success'])[4]")
	
	
	private WebElement addCart;
	
	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	/*public void verifyQuantityBefore()
	{
		String quantity=quantityAvailableBeforePurchase.getText();
		System.out.println("Quantity Available before purchase: "+quantity);
	} */

	public void addToCart() {
		addCart.click();
	}
}
