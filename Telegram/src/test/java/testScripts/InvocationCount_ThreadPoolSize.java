package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount_ThreadPoolSize {
	
	
		@Test(invocationCount = 5,threadPoolSize = 6)
		public void register() {
			WebDriver driver=new ChromeDriver();
			System.out.println("Register");
			driver.quit();
		}
		@Test(invocationCount = 2,threadPoolSize = 2)
		public void login() {
			WebDriver driver=new ChromeDriver();
			System.out.println("Login");
			driver.quit();
	}
		@Test     //(invocationCount = 2,threadPoolSize = 2)
		public void addtocard() {
			WebDriver driver=new ChromeDriver();
			System.out.println("AddToCard");
			
			driver.quit();
		}
		
		@Test(enabled = false)       //(invocationCount = 2,threadPoolSize = 2)
		public void payment() {
			WebDriver driver=new ChromeDriver();
			System.out.println("PayMent");
			driver.quit();
		
		
		
		
		}
		
	}     


