package com.qa.practice.utilities;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

public class WebEventListener implements WebDriverListener{
	Logger log = Logger.getLogger(WebEventListener.class);

	public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
		
		WebDriverListener.super.onError(target, method, args, e);
		PracticeUtils.captureScreenShot("SeleniumPractice");
		log.error(e.getMessage(), e);
	}

	@Override
	public void afterGet(WebDriver driver, String url) {
		System.out.println("*************After get************");
		WebDriverListener.super.afterGet(driver, url);
	}
	
	
	
	
	

}
