package com.qa.practice.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.practice.Base.Base;

public class PracticeUtils extends Base{
	
	public static void selByVisibleText(WebElement element,String val)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(val);
	}
	public static void handleAlert(String action)
	{
		Alert sa =driver.switchTo().alert();
		
		if("ok".equalsIgnoreCase(action))
		{
			sa.accept();
		}
	}
	public static Object[][] supplyData(String sheetName)
	{
		FileInputStream ip = null;
		Workbook book = null;
		Object[][] dataset = null;
		try {
			ip = new FileInputStream(System.getProperty("user.dir")+prop.getProperty("testDataSheet"));
			book = WorkbookFactory.create(ip);
			Sheet sheet = book.getSheet(sheetName);
			int rowNum = sheet.getLastRowNum();
			int colNum = sheet.getRow(0).getLastCellNum();
			dataset = new Object[rowNum][colNum];
			
			for(int i=0;i<rowNum;i++)
			{
				for(int j=0;j<colNum;j++)
				{
					dataset[i][j] = sheet.getRow(rowNum+1).getCell(colNum).toString();
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataset;
		
	}
	
	
	public static void captureScreenShot(String testSuite)
	{
		File ip = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ip, new File("./target/Screenshot/"+testSuite+"_"+System.currentTimeMillis()+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setExplicitWait(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
