package automationMaven.MavenJAVA;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resource.ExtentReporting;
import resource.base;

public class Listeners extends base implements ITestListener {

	ExtentReports extent = ExtentReporting.report();
	ExtentTest test;

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		WebDriver driver = null;
//		String methodName = result.getMethod().getMethodName();
//		try {
//			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
//					.get(result.getInstance());
//		} catch (Exception e) {
//		}
		test = extent.createTest(result.getMethod().getMethodName());
	}


	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");

	}

	
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test Failed");
		test.fail(result.getThrowable());

	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}


	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub

	}


	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}


	public void onFinish(ITestContext context) {
		extent.flush();

	}

}
