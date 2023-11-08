package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
	super(driver);
	
	}
	//Elements
	@FindBy(xpath="//span[text()='My Account']")
	WebElement linkMyaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement linkRegister;
	
	
	//Action Method
	public void myAccountClick() {
		linkMyaccount.click();
		
	}
	
	public void rigistration() {
		
		linkRegister.click();
	}
}
