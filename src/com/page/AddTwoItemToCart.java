package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTwoItemToCart {
	
@FindBy(xpath="(//a[@class='btn btn-success'])[2]")
	
	
	private WebElement addCartTwo;
	
	public AddTwoItemToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	/*public void verifyQuantityBefore()
	{
		String quantity=quantityAvailableBeforePurchase.getText();
		System.out.println("Quantity Available before purchase: "+quantity);
	} */

	public void AddTwoItemToCart() {
		addCartTwo.click();
	}

}
