package com.actitime.testscripts;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;


public class CreateCustomer extends BaseClass{
	
	
	@Test(priority = 1)
	public void testCreateClass() throws InterruptedException, EncryptedDocumentException, IOException
	
	{   
		for(int i=1;i<=4;i++)
		{
			driver.findElement(By.xpath("//span[.='New']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='comboboxButton'])[1]")).click();
			driver.findElement(By.xpath("//div[.='- New Customer -']")).click();
			String custName = f.getExcelValue("CreateCustomer", i, 2, "./file_data/TestScript.xlsx");
			driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys(custName);
			String projName= f.getExcelValue("CreateCustomer", i, 3, "./file_data/TestScript.xlsx");
			driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys(projName);
			String taskName = f.getExcelValue("CreateCustomer", i, 4, "./file_data/TestScript.xlsx");
			driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys(taskName);
			driver.findElement(By.xpath("//div[.='Create Tasks']")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//span[.='Project']")).click();
			Thread.sleep(5000);
			
			String value = f.getExcelValue("CreateCustomer", i, 3, "./file_data/TestScript.xlsx");
			WebElement newTask = driver.findElement(By.xpath("//tbody[@id='actualTTRows']//span[.='"+value+"']"));
			Thread.sleep(5000);
			
			if(newTask.isDisplayed())
			{
				f.setExcelValue("CreateCustomer", i, 6, "Pass", "./file_data/TestScript.xlsx");
			}
			else
			{
				f.setExcelValue("CreateCustomer", i, 6, "Fail", "./file_data/TestScript.xlsx");
			}
			Reporter.log(" Create Customer", true);
			
	}
	
}

}
