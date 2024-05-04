package ProjectMock1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository1.welcomePage1;

public class TestRun {

 @Test(priority = 1)
 
 public void register() {
	// TODO Auto-generated method stub
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 welcomePage1 welcome=new welcomePage1(driver);
	 welcome.getRegisterButton2().click();
}
  @Test(priority = 2)
  public void login() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
	  welcomePage1 welcome=new welcomePage1(driver);
	  welcome.getLoginButton2().click();
  }
  @Test(priority = 3)
  public void shoppingcart() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
	  welcomePage1 welcome=new welcomePage1(driver);
	  welcome.getShoppingcartButton().click();
  }
  @Test(priority = 4)
  public void wishlist() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/");
	  welcomePage1 welcome=new welcomePage1(driver);
	  welcome.getWishlist2().click();
  }
   @Test(priority  = 5)
   public void search() {
	   WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
		  welcomePage1 welcome=new welcomePage1(driver);
		  welcome.getSearchButton2().click(); 
   }
   @Test(priority = 6)
   public void subscrib() {
	   WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
		  welcomePage1 welcome=new welcomePage1(driver);
		  welcome.getSubscribButton2().click();  
   }
   @Test(priority = 7)
   public void radio() {
	   WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
		  welcomePage1 welcome=new welcomePage1(driver);
		  welcome.getRadioButton().click(); 
   }
   @Test(priority = 8)
		  public void vote() {
			   WebDriver driver=new ChromeDriver();
				  driver.manage().window().maximize();
				  driver.get("https://demowebshop.tricentis.com/");
				  welcomePage1 welcome=new welcomePage1(driver);
				  welcome.getVoteButton().click(); 	  
		  }	  
   @Test(priority = 9)
				  public void view() {
					   WebDriver driver=new ChromeDriver();
						  driver.manage().window().maximize();
						  driver.get("https://demowebshop.tricentis.com/");
						  welcomePage1 welcome=new welcomePage1(driver);
						  welcome.getViewAlllink().click();   
				  }
   @Test(priority = 10)
		  public void tricentis() {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
		  welcomePage1 welcome=new welcomePage1(driver);
		  welcome.getTricentislink().click(); 					 
		  }								 
}						  
						  