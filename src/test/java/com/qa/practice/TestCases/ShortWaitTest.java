package com.qa.practice.TestCases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.practice.Base.Base;
import com.qa.practice.objectRepos.HomePageOR;
import com.qa.practice.objectRepos.ShortWaitOR;

@Listeners(com.qa.practice.utilities.TestNgListeners.class)

public class ShortWaitTest extends Base{
	
	
	public ShortWaitTest()
	{
		super();
	}
	HomePageOR hm;
	ShortWaitOR sw;
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hm = new HomePageOR();
		sw= new ShortWaitOR();
		hm.clickShortWait();
		
	}
	@Test
	public void clickButtonForWait()
	{
		sw.clickButton();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
