package com.testprograms;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.page.AddressPage;
import com.page.UserRegPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegTestCase {
	public static WebDriver driver;
		@Test
		public void LoginTest() throws InterruptedException {
			
			Map<String,Object> prefs = new HashMap<String,Object>();
			
			prefs.put("profile.default_content_setting_values.notifications", 2);
			
			ChromeOptions option =new ChromeOptions();
			
			option.setExperimentalOption("prefs", prefs);
			System.out.println("Signup");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get("http://localhost:8081/medicare/membership?execution=e1s1");
			


			
			UserRegPage RegPF = new UserRegPage(driver);
			{
				RegPF.setFname("deepak");
				RegPF.setLname("sangwani");
				RegPF.setemail("deepak1@gmail.com");
				RegPF.setphone("88993636");
				RegPF.setpass("12345");
				RegPF.setcnfrmpass("12345");
				RegPF.setrole("user");
				RegPF.clicknxt();	
				RegPF.setaddrs1("1609, palam vihar");
				RegPF.setaddrs2("sector 2");
				RegPF.setcity("Gurugram");
				RegPF.setpincode("177102");
				RegPF.setstate("Haryana");
				RegPF.setcountry("India");
				Thread.sleep(5000);
				
				
				RegPF.setbtns("confirm");
				
			
				String persdetails= driver.findElement(By.xpath("//h4[normalize-space()='Personal Details']")).getText();
				assertEquals(persdetails, "Personal Details");
				System.out.println("Assert Successfull");
				
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Confirm")));
			//ap.selectAddress();
			RegPF.cnfrm();
		//	Thread.sleep(3000);
				 
				
				//RegPF.cnfrm();
				
				String String1= "You can use your email address as username to login!";
				String cnfrmmsg = driver.findElement(By.xpath("//h6[contains(text(),'You can use your email address as username to login')]")).getText();
				   System.out.println("confirm msg  " +cnfrmmsg);
				   assertEquals(String1 , cnfrmmsg); 
		}
}
}
