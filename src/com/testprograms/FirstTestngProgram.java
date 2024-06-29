package com.testprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.page.PageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestngProgram {
	
	public static WebDriver driver;

	@Test 
	
	    public void LoginTest() throws InterruptedException {
		System.out.println("Signup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/medicare/membership?execution=e1s1");
		
		
		//driver.get("http://localhost:8081/medicare/");
		
		//driver.get("");
		
		PageObjects obj = new PageObjects (driver);
		
		obj.EnterF("varsha");
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}
}
