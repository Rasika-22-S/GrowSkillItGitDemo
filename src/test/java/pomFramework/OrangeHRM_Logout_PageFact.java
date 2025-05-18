package pomFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Logout_PageFact {
	
	WebDriver driver;
	
	public OrangeHRM_Logout_PageFact(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(idriver, this);
	}

	
	//Repository
	
	@FindBy (className = "oxd-userdropdown-tab") WebElement profile;
	@FindBy (linkText ="Logout") WebElement logoutLink;
	
	//By profile = By.className("oxd-userdropdown-tab");
	//By logoutLink = By.linkText("Logout");
	
	public void clickOnProfile()
	{
		//driver.findElement(profile).click();
		profile.click();
	}
	
	public void clickOnLogoutLink()
	{
		//driver.findElement(logoutLink).click();
		logoutLink.click();
	}
	
}
