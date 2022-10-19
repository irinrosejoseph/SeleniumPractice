package com.qa.practice.TestCases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.practice.Base.Base;
import com.qa.practice.objectRepos.HomePageOR;
import com.qa.practice.objectRepos.TestingFormPageOR;
import com.qa.practice.utilities.PracticeUtils;

public class FormPageFillTest extends Base{
	
	public FormPageFillTest()
	{
		super();
	}
	HomePageOR hm = null;
	TestingFormPageOR tm = null;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		hm = new HomePageOR();
		tm = hm.clickTestingFormPage();
		
	}
	@Test(dataProvider = "supplyData")
	public void testFillForm(String firstNe,String lastNe,String addr,String nationality,String gender,String interest)
	{
		hm = tm.fillForm(firstNe,lastNe,addr,nationality,gender,interest);
	}
	@DataProvider
	private Object[][] supplyData()
	{
		String sheetName = prop.getProperty("formPageSheetName");
		return PracticeUtils.supplyData(sheetName);
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
