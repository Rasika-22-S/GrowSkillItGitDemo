package testNg_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@DataProvider(name ="dataset", parallel = false)
	public Object[][] mobileDataSet()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="Oppo";
		data[0][1]=	"Reno 2z";
		
		data[1][0]="iphone";
		data[1][1]=	"16";
		
		data[2][0]="OnePlus";
		data[2][1]=	"11R";
		return data;
	}
	
	@Test(dataProvider="dataset")
	public void searchMobile(String brand, String module) throws InterruptedException
	{
		try
		{
		WebElement loginPopup = driver.findElement(By.className("_30XB9F"));
		
			if (loginPopup.isDisplayed())
			{
				loginPopup.click();				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
				
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(brand+" "+module);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.navigate().back();
	}

}
