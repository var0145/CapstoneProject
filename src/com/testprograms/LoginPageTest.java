package com.testprograms;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.page.AddToCart;
import com.page.AddTwoItemToCart;
import com.page.AddressPage;
import com.page.CheckoutPage;
import com.page.HomePage;
import com.page.LoginPage;
import com.page.LogoutPage;
import com.page.OrderConfirmation;
import com.page.PaymentPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	public static WebDriver driver;
	@Test
	public void LoginTest() throws InterruptedException {
		System.out.println("Signup");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/medicare/login");
		
		LoginPage LP = new LoginPage(driver);
		{
			LP.enterUsername("deepak1@gmail.com");
			LP.enterPassword("12345");
			LP.Logoinclick();
			
			String Username= driver.findElement(By.xpath("//a[normalize-space()='deepak sangwani']")).getText();
			assertEquals(Username, "deepak sangwani");
			System.out.println("Login Successfull"); 			
			
			// To scroll down 
			
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			Js.executeScript("window.scrollBy(0,500)"," ");
			
			Thread.sleep(1000);
			
			HomePage HP=new HomePage(driver);
			
			HP.clickViewItem();
			
			//String Pagetitle= driver.findElement(By.xpath("//h3['Combiflame']")).getText();
			//assertEquals(Pagetitle, "Combiflame");
			System.out.println("Item clicked Successfully"); 
			
			Thread.sleep(2000);
			// To scroll down 
			Js.executeScript("window.scrollBy(0,300)"," ");
			
			Thread.sleep(5000);
			//calling add to cart 
			
			AddToCart Add = new AddToCart(driver);
			System.out.println("hwllo");
			//Add.verifyQuantityBefore();
			Add.addToCart();
			
			//calling checkout page 
			CheckoutPage ck=new CheckoutPage(driver);
			
			//Update Quantity and refresh the Amount
			ck.provideQuantity();
			ck.refreshButton();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Checkout")));
			System.out.println("sucessfully Update Quantity and refresh the Amount");
			ck.CheckOutButton();
			Thread.sleep(3000);
			
			//Select Address for Delivery
		
			AddressPage ap=new AddressPage(driver);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Select")));
			ap.selectAddress();
			Thread.sleep(3000);
			
			//Payment Details provided
			PaymentPage payment=new PaymentPage(driver);
			payment.cardNumberDetails();
			payment.expiryMonthDetails();
			payment.expiryYearDetails();
			payment.cvvNumberDetails();
			payment.PayBtn();
			Thread.sleep(3000);
			System.out.println("sucessfully updated payment details");
			
			//Order Confirmation Page
			
			OrderConfirmation ob=new OrderConfirmation(driver);
		
			String actualText=ob.getSuccessMessage();
			String expectedText="Your Order is Confirmed!!";
			if(actualText.equals(expectedText))
			{
				System.out.println("Success Message Verified");
			}
			
			else
			{
				System.out.println("Invalid Success Message");
			}
			
			System.out.println("Proceeding to Continue Shopping Page");
			ob.continueShoppingBtn();
			
			//LogoutPage lp=new LogoutPage(driver);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='dropdownMenu1']")));
			//lp.logoutUser();
			//Thread.sleep(3000);
		}
		
		//Adding2 item 
		
		/*AddTwoItemToCart Addnew = new AddTwoItemToCart(driver);
		Addnew.AddTwoItemToCart();
		//calling checkout page 
		CheckoutPage ck =new CheckoutPage(driver); */
		
		//Logout Page for User
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		
}
}