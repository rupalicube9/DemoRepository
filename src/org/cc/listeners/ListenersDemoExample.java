package org.cc.listeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ListenersDemoExample implements ITestListener{


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case successful and details are:"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed and details are:"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and details are:"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test failedwith success rate and details are:"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test case started and details are:"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test case finished and details are:"+context.getName());
		
	}

}
