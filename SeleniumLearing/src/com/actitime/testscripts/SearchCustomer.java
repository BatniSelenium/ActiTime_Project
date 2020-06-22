package com.actitime.testscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;

public class SearchCustomer extends BaseClass{
	
	@Test(priority=3)
	public void testSearchCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(5000);
		for(int i=1;i<=4;i++)
		{
			WebElement searchBox = driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]"));
			searchBox.clear();
			String value = f.getExcelValue("SearchCustomer", i, 2, "./file_data/TestScript.xlsx");
			searchBox.sendKeys(value);
			String xpathvalue = "//span[contains(text(),'"+value+"')]";
			WebElement checkValue = driver.findElement(By.xpath(xpathvalue));
			if(checkValue.isDisplayed())
			{
				f.setExcelValue("SearchCustomer", i, 3, "Pass", "./file_data/TestScript.xlsx");
			}
			else
			{
				f.setExcelValue("SearchCustomer", i, 3, "Fail", "./file_data/TestScript.xlsx");
			}
			Reporter.log("Search Customer", true);
		}
	}
}
