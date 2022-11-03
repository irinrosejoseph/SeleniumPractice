package com.qa.practice.objectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.Base.Base;

public class KeyBoardDisabledOR extends Base{
	
	@FindBy(name="text")
	WebElement textArea;
	
	public KeyBoardDisabledOR()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterText()
	{
		Actions action = new Actions(driver);
		//action.click(textArea).build().perform();
		
		action.sendKeys(textArea, "testing").build().perform();
		
	}

}
