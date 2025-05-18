package testNg_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestDemo {
	
	WebDriver driver = null;
	
	@Parameters("Browser")
	@Test
	public void launchBrowser(@Optional("Chrome")String browser)
	{
		
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver= new EdgeDriver();
		}
	}
	
	@Test
	public void startApp()
	{
		driver.manage().window().maximize();
		driver.get("https://learn-automation.com/solution-for-sendkeyscharsequence-in-selenium/");
	}

}
