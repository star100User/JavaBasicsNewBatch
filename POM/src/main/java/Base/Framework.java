
/*
This is a chnage from Akhilas side
*/
package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framework {
	
	// global : It should be accessible to all teh methods 
	public static WebDriver driver; 
	public String URL = "https://www.nfl.com/";
	// start 
	
	@BeforeMethod
	public void StartMethod()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(URL);
		
		
		
	}
	
	@AfterMethod
	// end 
	public void End()
	{
		driver.quit();
	}

}
