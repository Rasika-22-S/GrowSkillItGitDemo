package testNg_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassAssignment {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");		
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.xpath("(//a[@href='/electronics'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='picture'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='picture'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	}
	
	

}
