package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
	
	public WebDriver driver;
	
	By firstName = By.id("firstName");
	By lastName =By.id("lastName");
	By email = By.id("email");
	By contactNumber = By.id("contactNumber");
	By password = By.id("password");
	By confirmPassword = By.id("confirmPassword");
	By role1 =By.id("role1");
	By role2 = By.id("role2");
	
	public PageObjects(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void EnterF(String Fname)
	{
		driver.findElement(firstName).sendKeys(Fname);
	}
}
