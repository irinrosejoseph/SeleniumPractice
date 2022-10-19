package com.qa.practice.objectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.Base.Base;

public class ShortWaitOR extends Base{
	
	@FindBy(linkText = "DO NOT PUSH")
	WebElement button;
	
	public ShortWaitOR()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickButton()
	{
		button.click();
		driver.navigate().back();
	}

}
