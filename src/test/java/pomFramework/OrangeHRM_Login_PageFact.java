package pomFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Login_PageFact {
	
	WebDriver driver;
	
	public OrangeHRM_Login_PageFact(WebDriver idriver)	
	{
		driver =idriver;
		PageFactory.initElements(idriver, this);
	}
	
	//Repository
	@FindBy(name = "username") WebElement userNM;
	@FindBy(name = "password") WebElement passWD;
	@FindBy(xpath = "//button[@type='submit']") WebElement loginBtn;
	
	//By userNM = By.name("username");
	//By passWD = By.name("password");
	//By loginBtn = By.xpath("//button[@type='submit']");

	public void url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void enterUserName(String un)
	{
		//driver.findElement(userNM).sendKeys(un);
		userNM.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		//driver.findElement(passWD).sendKeys(pw);
		passWD.sendKeys(pw);
	}
	
	public void clickOnLoginBtn() throws InterruptedException
	{
		//driver.findElement(loginBtn).click();
		loginBtn.click();
		Thread.sleep(3000);
	}
}
