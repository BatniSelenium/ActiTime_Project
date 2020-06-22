package com.actitime.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class ModifyCustomer extends BaseClass{
	@Test(priority=2)
	public void testModifyCustomer() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		for(int i=1;i<=4;i++) 
		{
			driver.findElement(By.id("container_tasks")).click();
			Thread.sleep(3000);
			
			WebElement searchBox = driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]"));
			
			String value1 = f.getExcelValue("CreateCustomer", i, 2, "./file_data/TestScript.xlsx");
			searchBox.sendKeys(value1);
			driver.findElement(By.xpath("(//div[@class='title']//span[@class='highlightToken'])[1]")).click();
			Thread.sleep(3000);
			
			//driver.findElement(By.xpath("//div[@class='title']//div[.='"+value1+"']")).click();
			//Thread.sleep(7000);
			driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']//div[@class='editButton']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='nameLabel'])[1]"));
			WebElement tbox = driver.findElement(By.xpath("(//div[@class='nameInfo editable'])[1]"));
			String value = f.getExcelValue("ModifyCustomer", i, 3, "./file_data/TestScript.xlsx");
			Actions a= new Actions(driver);
			a.moveToElement(tbox).doubleClick().sendKeys(value).perform();
			Thread.sleep(3000);
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			driver.findElement(By.id("container_tt")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[.='Customer']")).click();
			Thread.sleep(7000);
			WebElement trow = driver.findElement(By.xpath("//tbody[@id='actualTTRows']//span[contains(text(),'"+value+"')]"));
			if(trow.isDisplayed())
			{
				f.setExcelValue("ModifyCustomer", i, 4, "Pass", "./file_data/TestScript.xlsx");
			}
			else
			{
				f.setExcelValue("ModifyCustomer", i, 4, "Fail", "./file_data/TestScript.xlsx");
			} 
			
			Reporter.log("Modify customer", true);
		
	}
	
	}	

}
