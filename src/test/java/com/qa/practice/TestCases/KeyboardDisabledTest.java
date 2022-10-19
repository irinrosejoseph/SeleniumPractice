package com.qa.practice.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.practice.Base.Base;
import com.qa.practice.objectRepos.HomePageOR;
import com.qa.practice.objectRepos.KeyBoardDisabledOR;

public class KeyboardDisabledTest extends Base{
	
	public KeyboardDisabledTest()
	{
		super();
	}
	KeyBoardDisabledOR kb;
	HomePageOR hm;
	@BeforeTest
	public void setUp()
	{
		initialization();
		hm = new HomePageOR();
		kb = new KeyBoardDisabledOR();
		hm.clickKeyboardDisabled();
		
		
	}
	@Test
	public void testActions()
	{
		kb.enterText();
	}

}
