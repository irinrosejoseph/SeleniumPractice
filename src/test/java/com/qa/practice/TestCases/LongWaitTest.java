package com.qa.practice.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.practice.Base.Base;
import com.qa.practice.objectRepos.HomePageOR;
import com.qa.practice.objectRepos.LongWaitOR;

public class LongWaitTest extends Base{
	
	public LongWaitTest()
	{
		super();
	}
	
	LongWaitOR lw;
	HomePageOR hm;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hm = new HomePageOR();
		lw= new LongWaitOR();
		hm.clickLongWait();
			
	}
	@Test
	public void explicitWaitTest()
	{
		lw.clickLongWait();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
