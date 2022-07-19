package SignupRelatedTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.Framework;
import Pages.HomePageackage.HomePage;
import Pages.SignUpPage.SignUpPage;

public class VerifySignUpProcess extends Framework {
	
	// Global Test Data 
	public String usernameData = "Arti Lohar";
	public String passwordData= "Arti123";
	@Test
	public void SignUpVerification() throws InterruptedException
	{
		
		//comment 
		  
		
		HomePage.ClickLaterOfAlert();
		HomePage.ClickOnSignUpButton();
		SignUpPage.EntireSignupProcess(usernameData,passwordData);
		
		
	}

}
