package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserRegPage {
	
public WebDriver driver;
	
@FindBy(id="firstName")
WebElement Fname;

@FindBy(xpath="//input[@id='lastName']")
WebElement LastName;
@FindBy(xpath="//input[@id='email']")
WebElement email;

@FindBy(xpath = "//input[@id='contactNumber']")
WebElement contactNo;

@FindBy(xpath = "//input[@id='password']")
WebElement password;

@FindBy(xpath = "//input[@id='confirmPassword']")
WebElement confirmpassword;

@FindBy(xpath = "//input[@id='role1']")
WebElement userradiobtn;

@FindBy(xpath = "//input[@id='role2']")
WebElement supplierradiobtn;

@FindBy(xpath = "//button[normalize-space()='Next - Billing']")
WebElement nextbtn;

@FindBy(xpath = "//input[@id='addressLineOne']")
WebElement addr1;

@FindBy(xpath = "//input[@id='addressLineTwo']")
WebElement addr2;

@FindBy(xpath = "//input[@id='city']")
WebElement city;

@FindBy(xpath = "//input[@id='postalCode']")
WebElement pincode;

@FindBy(xpath = "//input[@id='state']")
WebElement state;

@FindBy(xpath = "//input[@id='country']")
WebElement country;

@FindBy(xpath = "//button[normalize-space()='Next - Confirm']")
WebElement confirmbtn;

@FindBy(xpath = "//button[normalize-space()='Back - Personal']")
WebElement backbtn;

@FindBy(xpath = "//a[normalize-space()='Confirm']")
WebElement confirmbtn1;


public UserRegPage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

	public void setFname(String FirstName)
	{
		Fname.sendKeys(FirstName);
	}
	
	public void setLname(String LName) {
		LastName.sendKeys(LName);
	}
	public void setemail(String mail) {
		email.sendKeys(mail);
	}
	public void setphone(String phone) {
		contactNo.sendKeys(phone);
	}
	
	public void setpass(String pass) {
		password.sendKeys(pass);
	}
	public void setcnfrmpass(String cnfrmpass) {
		confirmpassword.sendKeys(cnfrmpass);
	}
	public void setrole(String roles) {
		if (roles.equalsIgnoreCase("user")) {
			userradiobtn.click();
	}
		else if(roles.equalsIgnoreCase("supplier")) {
			supplierradiobtn.click();
		}
	}
	
	public void clicknxt() {
		nextbtn.click();
	}
		
	public void setaddrs1(String addrs1) {
		addr1.sendKeys(addrs1);
	}
	
	public void setaddrs2(String addrs2) {
		addr2.sendKeys(addrs2);
	}
	
	public void setcity(String city1) {
		city.sendKeys(city1);
	}
	public void setpincode(String pincode1) {
		pincode.sendKeys(pincode1);
	}
		
	public void setstate(String state1) {
		state.sendKeys(state1);
	}
	
	public void setcountry(String cntry) {
		country.sendKeys(cntry);
	}
		
	public void setbtns(String button) {
		if (button.equalsIgnoreCase("confirm")) {
			confirmbtn.click();
	}
		else if(button.equalsIgnoreCase("back")) {
			backbtn.click();
		}
	}
	
	public void cnfrm() {
		confirmbtn1.click();
	}
	
	
	
	
}
