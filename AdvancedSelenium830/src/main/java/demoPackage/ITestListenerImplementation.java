package demoPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerImplementation implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("this test is start " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("this test is success " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("this test is failed " + result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("this test is onstart" +context.getName() );
	}

	public void onFinish(ITestContext context) {
		System.out.println("this test is onfinish" +context.getName() );
	}

}
