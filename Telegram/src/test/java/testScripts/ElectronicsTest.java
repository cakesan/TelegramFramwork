package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElectronicsTest {
	@Test
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		
		driver.quit();
	}
	@Test(dependsOnMethods = "register")
	public void login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
}
	@Test(dependsOnMethods = "login")
	public void addtocard() {
		WebDriver driver=new ChromeDriver();
		System.out.println("AddToCard");
		driver.quit();
	}
	
	@Test(dependsOnMethods = "addtocard")
	public void payment() {
		WebDriver driver=new ChromeDriver();
		System.out.println("PayMent");
		driver.quit();
	
	
	
	
	}
	
}     

