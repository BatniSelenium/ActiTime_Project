package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.TaskListPage;

public class DeleteCustomer extends BaseClass {
	/**
	 * This is used to delete created customer in tasklist page
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test
	public void testDeleteCustomerMethod1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HomePage h=  new HomePage(driver);
		h.getTasksMenu().click();
		Thread.sleep(3000);
		TaskListPage t= new TaskListPage(driver);
		t.getSearchCustomer().sendKeys(f.getExcelvalue("DeleteCustomer", 1, 1));
		t.getSelectSearchedCustomer().click();
		Thread.sleep(3000);
		t.getEditButton().click();
		Thread.sleep(3000);
		t.getActionsBtn().click();
		t.getDeleteBtn().click();
		t.getDeletePermanentlybtn().click();
		
		t.getSearchCustomer().clear();
		t.getSearchCustomer().sendKeys(f.getExcelvalue("DeleteCustomer", 1, 1));
		if(t.getIsDeleted().isDisplayed())
		{
			f.setExcelValue("TestCases", 3, 6, "Pass");
			Reporter.log("Customer deleted successfully", true);
		}
		else
		{
			f.setExcelValue("TestCases", 3, 6, "Fail");
			Reporter.log("Unable to delete Customer", true);
		}
			
	}
	/**
	 * This is used to delete customer using first edit button in side bar
	 * @throws InterruptedException
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	@Test
	public void testDeleteCustomerMethod2() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage h=  new HomePage(driver);
		h.getTasksMenu().click();
		Thread.sleep(3000);
		TaskListPage t= new TaskListPage(driver);
		t.getSearchCustomer().sendKeys(f.getExcelvalue("DeleteCustomer", 2, 1));
		t.getSelectSearchedCustomer().click();
		t.getEditBtn().click();
		Thread.sleep(3000);
		t.getActionsBtn().click();
		t.getDeleteBtn().click();
		t.getDeletePermanentlybtn().click();
		
		t.getSearchCustomer().clear();
		t.getSearchCustomer().sendKeys(f.getExcelvalue("DeleteCustomer", 2, 1));
		if(t.getIsDeleted().isDisplayed())
		{
			f.setExcelValue("TestCases", 4, 6, "Pass");
			Reporter.log("Customer deleted successfully", true);
		}
		else
		{
			f.setExcelValue("TestCases", 4, 6, "Fail");
			Reporter.log("Unable to delete Customer", true);
		}
	
	}

}
