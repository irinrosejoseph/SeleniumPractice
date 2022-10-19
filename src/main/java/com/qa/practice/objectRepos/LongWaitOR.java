package com.qa.practice.objectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.Base.Base;
import com.qa.practice.utilities.PracticeUtils;

public class LongWaitOR extends Base{
	
	@FindBy(linkText = "DO NOT PUSH")
	WebElement longButton;
	
	public LongWaitOR()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickLongWait() {
		PracticeUtils.setExplicitWait(longButton);
		PracticeUtils.captureScreenShot("LongWait");
		longButton.click();
		
	}

}
