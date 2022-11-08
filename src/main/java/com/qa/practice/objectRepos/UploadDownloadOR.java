package com.qa.practice.objectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.Base.Base;

public class UploadDownloadOR extends Base{
	
	@FindBy(id = "myFile")
	WebElement uploadInp;
	
	@FindBy(xpath = "//button[contains(text(),'Upload')]")
	WebElement uploadBttn;
	
	public UploadDownloadOR()
	{
		PageFactory.initElements(driver, this);
	}
	/*
	 * File upload in selenium test can be done by sending the filepath directly to
	 * the web element rather than clicking the upload button 
	 */
	
	public void sendUploadFile()
	{
		uploadInp.sendKeys(System.getProperty("user.dir")+"/src/main/java/com/qa/practice/TestData/SeleniumPractice.xlsx");
		uploadBttn.click();
		
	}

}
