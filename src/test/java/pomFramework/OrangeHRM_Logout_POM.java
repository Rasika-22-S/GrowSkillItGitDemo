package pomFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_Logout_POM {
	
	WebDriver driver;
	
	public OrangeHRM_Logout_POM(WebDriver driver)
	{
		this.driver=driver;
	}

	
	//Repository
	
	By profile = By.className("oxd-userdropdown-tab");
	By logoutLink = By.linkText("Logout");
	
	public void clickOnProfile()
	{
		driver.findElement(profile).click();
	}
	
	public void clickOnLogoutLink()
	{
		driver.findElement(logoutLink).click();
	}
	
}
