package com.main;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExternalReports;




public class MyListeners implements ITestListener {
	ExtentReports extent;
	ExtentTest test;
	

	@Override
	public void onStart(ITestContext context) {
		System.out.println("This is start" + context.getName());
	    //extent = ExternalReports.createReport();
		//ExtentReports extent = ExternalReports.createReport();
		//test = extent.startTest(context.getName());
		 extent = ExternalReports.createReport();
		 test = extent.startTest(context.getName());
		
		
	}

	

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("my test"+result.getName()+"is successful");
		//test.log(LogStatus.PASS, result.getName()+"Is passed");
		test.log(LogStatus.PASS, result.getName() + "Is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("my test"+result.getName()+"is failure");
		test.log(LogStatus.FAIL, result.getName() + "IsFailed");
}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("my test"+result.getName()+"is skipped");
		test.log(LogStatus.SKIP, result.getName() + "Is Skipped");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is end");
		extent.endTest(test);
		extent.flush();
		
	}

}
