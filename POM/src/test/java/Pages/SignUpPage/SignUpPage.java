package Pages.SignUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Framework;

public class SignUpPage extends Framework{
	
	
	
	
	public static By UserName = By.xpath("//input[@data-gigya-placeholder='Email or Username']");
	public static By Password = By.xpath("//input[@data-gigya-placeholder='Password']");
	
	
	//Page Factory
	//public static @FindBy SigninButton = By.xpath("//input[@value='Sign In']");
	
	public static @FindBy(xpath = "//input[@value='Sign In']")
	WebElement SigninButton;
	
	
	public SignUpPage()
	{
	PageFactory.initElements(Framework.driver, this);
	}
	
	public static void EnterEmail(String dataFroUsername)
	{
		
		driver.findElement(UserName).sendKeys(dataFroUsername);
	}
	
	
	public static void EnterPassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	
	public static void ClickoNLoginButtion()
	{
		SigninButton.click();
	}
	
	public static void EntireSignupProcess(String usernamedata , String passworddata)
	{
		EnterEmail(usernamedata);
		EnterPassword(passworddata);
		ClickoNLoginButtion();
				
	}
	
	
	

}
