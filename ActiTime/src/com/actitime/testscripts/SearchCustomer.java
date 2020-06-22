package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.TaskListPage;
/**
 * 
 * @author Sanjana Batni
 *
 */
public class SearchCustomer extends BaseClass{
	/**
	 * This is used Successful Search Scenario
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	@Test
	public void testSearchCustomerPositive() throws EncryptedDocumentException, IOException
	{
		HomePage h= new HomePage(driver);
		TaskListPage t= new TaskListPage(driver);
		//click on Tasklist menu icon
		h.getTasksMenu().click();
		//enter customer name in search box
		t.getSearchCustomer().sendKeys(f.getExcelvalue("SearchCustomer", 1, 1));
		//check if customer is present 
		if(t.getIsDeleted().isDisplayed())
		{
				f.setExcelValue("TestCases", 5, 6, "Fail");
				Reporter.log("Customer not found", true);
		}
		else
		{
			f.setExcelValue("TestCases", 5, 6, "Pass");
			Reporter.log("Customer found", true);
		}
	}
	/**
	 * This is used for unsuccessful search
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	@Test
	public void testSearchCustomerNegative() throws EncryptedDocumentException, IOException
	{
		HomePage h= new HomePage(driver);
		TaskListPage t= new TaskListPage(driver);
		//click on Tasklist menu icon
		h.getTasksMenu().click();
		//enter customer name in search box
		t.getSearchCustomer().sendKeys(f.getExcelvalue("SearchCustomer", 2, 1));

		if(t.getIsDeleted().isDisplayed())
		{
				f.setExcelValue("TestCases", 6, 6, "Fail");
				Reporter.log("Customer found", true);
		}
		else
		{
			f.setExcelValue("TestCases", 6, 6, "Pass");
			Reporter.log("Customer not found", true);
		}
	}
	
}
