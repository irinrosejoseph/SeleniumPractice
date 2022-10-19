package com.qa.practice.objectRepos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.practice.Base.Base;
import com.qa.practice.utilities.PracticeUtils;

public class TestingFormPageOR extends Base{
	
	@FindBy(id="ts_first_name")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='ts_last_name']")
	WebElement lastName;
	
	@FindBy(name="ts_address")
	WebElement address;
	
	@FindBy(id="ts_country")
	WebElement country;
	
	@FindBy(xpath="//input[@name='ts_gender' and @value='female']")
	WebElement female;
	
	@FindBy(xpath="//input[@name='ts_gender' and @value='male']")
	WebElement male;
	
	@FindBy(xpath="//input[@id='ts_checkbox2' and @value='football']")
	WebElement footBall;
	

	@FindBy(xpath="//input[@id='ts_checkbox1' and @value='cricket']")
	WebElement cricket;
	
	@FindBy(xpath="//input[@id='ts_checkbox3' and @value='Hockey']")
	WebElement hockey;
	
	@FindBy(xpath="//input[@value='submit']")
	WebElement submit;
	
	@FindBy(linkText = "Here")
	WebElement returnLink;
	
	public TestingFormPageOR()
	{
		PageFactory.initElements(driver, this);
	}
	public HomePageOR fillForm(String firstNe,String lastNe,String addr,String nationality,String gender,String interest)
	{
		firstName.sendKeys(firstNe);
		lastName.sendKeys(lastNe);
		address.sendKeys(addr);
		PracticeUtils.selByVisibleText(country,nationality);
		if("female".equalsIgnoreCase(gender))
		{
			female.click();
		}
		else if("male".equalsIgnoreCase(gender))
		{
			male.click();
		}
		if("Cricket".equalsIgnoreCase(interest))
		{
			cricket.click();
		}
		else if("Football".equalsIgnoreCase(interest))
		{
			footBall.click();
		}
		else if("Hockey".equalsIgnoreCase(interest))
		{
			hockey.click();
		}
		submit.click();
		PracticeUtils.handleAlert("ok");
		//returnLink.click();
		return new HomePageOR();
	}
	

}
