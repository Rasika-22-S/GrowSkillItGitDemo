package testNg_Framework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShots extends ListenersDemo {
	
	public static void captureSS(String ssName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Screenshots\\"+ssName+".jpeg");
		FileHandler.copy(src, des);
	}

}
