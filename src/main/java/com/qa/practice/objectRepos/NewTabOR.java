package com.qa.practice.objectRepos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.Base.Base;

public class NewTabOR extends Base{
	
	@FindBy(xpath = "//button[text()='Go to Google Search']")
	WebElement newTabBttn;
	
	public NewTabOR()
	{
		PageFactory.initElements(driver, this);
	}
	public void clickNewTabButton()
	{
		String parWindowHandle = driver.getWindowHandle();
		newTabBttn.click();
		Set<String> windowHndls = driver.getWindowHandles();
		Iterator<String> it = windowHndls.iterator();
		Boolean switched = false;
		while(it.hasNext())
		{
			String childWinHandle = it.next();
			if(!childWinHandle.equals(parWindowHandle))
			{
				driver.switchTo().window(childWinHandle);
				switched = true;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		if(switched)
		{
			//switching back to parent window
			driver.switchTo().window(parWindowHandle);
			
		}
	}
	

}
