package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy (xpath="//input[@type='submit']")
	WebElement Submit;


public LoginPage (WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void enterUsername(String username)
{
	UserName.sendKeys(username);
}

public void enterPassword(String password) {
	Password.sendKeys(password);
}

public void Logoinclick() {
	Submit.click();
}
}
