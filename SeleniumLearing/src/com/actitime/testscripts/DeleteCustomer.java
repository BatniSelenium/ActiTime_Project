package com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class DeleteCustomer extends BaseClass {
	
	@Test(priority=4)
	public void testdeleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		for(int i=1;i<=4;i++)
		{
			driver.findElement(By.id("container_tasks")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			WebElement searchBox = driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]"));
			
			String value = f.getExcelValue("ModifyCustomer", i, 3, "./file_data/TestScript.xlsx");
			searchBox.sendKeys(value);
			
			driver.findElement(By.xpath("//span[@class='highlightToken']")).click();
			driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']//div[@class='editButton']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[.='ACTIONS'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[.='Delete'])[2]")).click();
			driver.findElement(By.xpath("//span[.='Delete permanently']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[.='Time-Track']")).click();
			
			f.setExcelValue("DeleteCustomer", i, 4, "Pass", "./file_data/TestScript.xlsx");
			Reporter.log("Customer deleted", true);
		}
	}


}
