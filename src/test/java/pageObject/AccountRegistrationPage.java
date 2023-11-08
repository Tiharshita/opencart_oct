package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	//element
	@FindBy(name="firstname")
	WebElement FirstName;
	
	@FindBy(name="lastname")
	WebElement LastName;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="agree")
	WebElement Checkbox;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement ContinueBtn;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fname) {
		
		FirstName.sendKeys(fname);
		
	}
	public void setLastName(String lname) {
		
		LastName.sendKeys(lname);
		
	}
	public void setEmail(String email) {
		
		Email.sendKeys(email);
		
	}	
	public void setPassword(String pwd) {
		
		Password.sendKeys(pwd);
		
	}	
	
	public void clickCheckbox() {
		Checkbox.click();
	}
	
	public void clickContinueBtn() {
		ContinueBtn.click();
		
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}

}
