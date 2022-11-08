package com.qa.practice.objectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.Base.Base;

public class HomePageOR extends Base{
	
	@FindBy(linkText = "Testing Form Page")
	WebElement formPageLink;
	
	@FindBy(linkText = "Short Wait")
	WebElement shortWait;
	
	@FindBy(linkText = "Long Wait")
	WebElement longWait;
	
	@FindBy(linkText = "Keyboard Disabled")
	WebElement keyDisabledLink;
	
	@FindBy(linkText = "NewTab")
	WebElement newTabLink;
	
	
	@FindBy(linkText = "Upload and Download")
	WebElement upDownLink;
	
	public HomePageOR()
	{
		PageFactory.initElements(driver, this);
	}
	
	public TestingFormPageOR clickTestingFormPage()
	{
		formPageLink.click();
		return new TestingFormPageOR();
	}
	public ShortWaitOR clickShortWait()
	{
		shortWait.click();
		return new ShortWaitOR();
	}
	public LongWaitOR clickLongWait()
	{
		longWait.click();
		return new LongWaitOR();
	}
	
	public KeyBoardDisabledOR clickKeyboardDisabled()
	{
		keyDisabledLink.click();
		return new KeyBoardDisabledOR();
	}
	public NewTabOR clickNewTab()
	{
		newTabLink.click();
		return new NewTabOR();
	}
	public UploadDownloadOR clickUpDownLink()
	{
		upDownLink.click();
		return new UploadDownloadOR();
	}

}
