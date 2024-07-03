package com.testprograms;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.page.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invalidlogin {
	
	public static WebDriver driver;
	@Test
	public void InvalidLoginTest() throws InterruptedException {
		System.out.println("Signup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/medicare/login");
		
		LoginPage LP = new LoginPage(driver);
		{
			LP.enterUsername("deepak1@gmail.com");
			LP.enterPassword("123456");
			LP.Logoinclick(); 
			
			String message= driver.findElement(By.xpath("//div[@class='alert alert-danger fade in']")).getText();
			assertEquals(message, "Username and Password is invalid!");
			System.out.println("Invalid user Assert Successfull");
		}
	}
}
