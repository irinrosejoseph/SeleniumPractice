package com.qa.practice.utilities;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener{
	Logger log = Logger.getLogger(TestNgListeners.class);

	@Override
	public void onTestFailure(ITestResult result) {
		
		PracticeUtils.captureScreenShot("SeleniumPractice");
		log.fatal(result);
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		log.info("**********Test start successfully****************");
		ITestListener.super.onTestStart(result);
	}
	
	
	
	

}
