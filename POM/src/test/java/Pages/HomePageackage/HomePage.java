package Pages.HomePageackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Framework;

public class HomePage extends Framework{
	
	// Locators 
	public static By SignUpButton = By.xpath("(//span[contains(text(),' Sign In ')])[2]");
	
	
	// Clicking on signup button
	public static  void ClickOnSignUpButton()
	{
		driver.findElement(SignUpButton).click();
		
	}
	
	public static void ClickLaterOfAlert() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("onesignal-slidedown-cancel-button")));
		driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
		Thread.sleep(3000);
	}

}
