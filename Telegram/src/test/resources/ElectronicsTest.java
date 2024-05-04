import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElectronicsTest {
	 @test
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.get("fcfjjj");
		driver.quit();
	}
	

}
