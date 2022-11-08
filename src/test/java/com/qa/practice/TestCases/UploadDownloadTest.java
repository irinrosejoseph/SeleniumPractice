package com.qa.practice.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.practice.Base.Base;
import com.qa.practice.objectRepos.HomePageOR;
import com.qa.practice.objectRepos.UploadDownloadOR;

public class UploadDownloadTest extends Base{
	
	public UploadDownloadTest()
	{
		super();
	}
	HomePageOR hm;
	UploadDownloadOR up;
	@BeforeTest
	public void setUp()
	{
		initialization();
		hm = new HomePageOR();
		up = hm.clickUpDownLink();
	}
	
	@Test
	public void uploadTest()
	{
		up.sendUploadFile();
	}

}
