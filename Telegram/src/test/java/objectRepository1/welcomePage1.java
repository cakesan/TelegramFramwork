package objectRepository1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomePage1 {
	
	
		public welcomePage1(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
         @FindBy(linkText = "Register")
         private WebElement RegisterButton2;
		
		@FindBy(linkText = "Log in")
		private WebElement loginButton2;
		
		@FindBy(linkText = "Shopping cart")
		private WebElement shoppingcartButton;
		
	
		@FindBy(linkText = "Wishlist")
		private WebElement wishlist2;
		
		@FindBy(xpath = "//input[@class='button-1 search-box-button']")
		private WebElement searchButton2;
		
		@FindBy(xpath = "//input[@class='button-1 newsletter-subscribe-button']")
		private WebElement subscribButton2;
		
		@FindBy(id = "pollanswers-1")
		private WebElement radioButton;
		
		@FindBy(id = "vote-poll-1")
		private WebElement voteButton;
		
		public WebElement getRadioButton() {
			return radioButton;
		}

		public WebElement getVoteButton() {
			return voteButton;
		}

		public WebElement getViewAlllink() {
			return viewAlllink;
		}

		public WebElement getTricentislink() {
			return tricentislink;
		}
		@FindBy(linkText = "View all")
		private WebElement viewAlllink;
		
		@FindBy(linkText = "Tricentis")
		private WebElement tricentislink;
		
		public WebElement getRegisterButton2() {
			return RegisterButton2;
		}

		public WebElement getSearchButton2() {
			return searchButton2;
		}

		public WebElement getSubscribButton2() {
			return subscribButton2;
		}

		public WebElement getLoginButton2() {
			return loginButton2;
		}

		public WebElement getWishlist2() {
			return wishlist2;
		}
		
		public WebElement getShoppingcartButton() {
			return shoppingcartButton;
		}
		
		
		
		
}
		