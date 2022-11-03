package com.qa.practice.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.practice.Base.Base;
import com.qa.practice.objectRepos.HomePageOR;
import com.qa.practice.objectRepos.NewTabOR;

public class NewTabTest extends Base{
	
	
	//Call the super constructor to do all kinds of initialization and properties loading
	public NewTabTest()
	{
		super();
	}
	
	HomePageOR hm;
	NewTabOR nt;
	
	/*
	 * Before test load the home page and click on the specific link
	 * to open the page on which test is to be done. 
	 */
	
	@BeforeTest
	public void setUp()
	{
		initialization();
		hm = new HomePageOR();
		nt = hm.clickNewTab();
	}
	@Test
	public void newTabTest()
	{
		nt.clickNewTabButton();
	}
}
