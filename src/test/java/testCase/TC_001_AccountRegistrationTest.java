package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	
	
	@Test
	public void test_acc_Registration() {
		
		logger.info(" Started TC_001_AccountRegistrationTest ");
		try {
		HomePage hp=new HomePage(driver);
		hp.myAccountClick();
		logger.info("Clicked on My Account link");
		
		hp.rigistration();
		logger.info("Clicked on Registration link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info(" providing customer details ");
		
		regpage.setFirstName("test");
		regpage.setLastName("test111");
		regpage.setEmail("test0@gmail.com");
		
		logger.info(" adding password ");
		regpage.setPassword("testuser@123");
		
		Thread.sleep(4000);
		
		logger.info(" Click on Checkbox ");
		regpage.clickCheckbox();
		
		Thread.sleep(4000);
		
		
		logger.info(" Click on Continue Button ");
		regpage.clickContinueBtn();
		Thread.sleep(4000);
		
		String confmsg= regpage.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Your Account has Been created!", "Test failed");
		}
		
		catch(Exception e) {
			logger.error("Test failed");
			
			Assert.fail();
			
		}
		logger.info(" Finished TC_001_AccountRegistrationTest ");
		
	}
	

}
