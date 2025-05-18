package testNg_DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenDemo  {
	
	public static void main(String agrs[]) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		/*
		 * Thread.sleep(5000); Alert a1 = driver.switchTo().alert();
		 * System.out.println(a1.getText()); Thread.sleep(500); a1.accept();
		 */

		
	String filePath = "D:\\Rasika Shingane\\GrowSkillIT\\Jyoti Shukla\\TestngDataKeyword_ORHM.xlsx";
	FileInputStream fis = new FileInputStream(filePath);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Data");
	
	int rows = sheet.getLastRowNum();
	System.out.println("Number of rows are : " +rows);
	
	for(int i=1; i<=rows; i++)
	{
		XSSFRow row = sheet.getRow(i);
		XSSFCell userNm=row.getCell(0);
		XSSFCell pass = row.getCell(1);
		
		System.out.println("username" +userNm     + "password " +pass);
		try {		
				driver.findElement(By.name("username")).sendKeys(userNm.toString());
		driver.findElement(By.name("password")).sendKeys(pass.toString());
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/child::li[4]/child::a")).click();
		
		
		System.out.println("Valid data");
		}
		catch(Exception e)
		{
			System.out.println("invalid data");
		}
		
	}
	fis.close();
	
	}

}
