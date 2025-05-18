package testNg_Framework;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest extends CaptureScreenShots implements ITestListener {
	
	public void onTestStart(ITestResult result) {

 System.out.println("On start of test execution "+result.getName());
		
	  }

	  
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed  "+result.getName());
		try {
			captureSS(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	  }

	 
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case fail "+result.getName());
	  }

	 
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped"+result.getName());
	  }

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	public void onStart(ITestContext context) {
		System.out.println("Now the execution starts");
	  }

	 
	public void onFinish(ITestContext context) {
		System.out.println("Now the execution finished");
	  }

}
