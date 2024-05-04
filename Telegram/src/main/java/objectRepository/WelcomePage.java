package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register") 
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(linkText = "Computers")
	private WebElement computerlink;
	
	@FindBy(linkText = "Books")
    private WebElement bookslink;
	
	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getComputerlink() {
		return computerlink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
		
	}   
} 
