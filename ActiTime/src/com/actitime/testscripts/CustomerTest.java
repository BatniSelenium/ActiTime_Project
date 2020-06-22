package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
public class CustomerTest extends BaseClass{
	
	/**
	 * Used to Check Create customer from task list page
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test
	public void testCreateCustomerTaskListPage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HomePage h= new HomePage(driver);
		//click on task menu
		h.getTasksMenu().click();
		TaskListPage t= new TaskListPage(driver);
		//click on + Add New Button
		t.getAddNewBtn().click();
		//Select New Customer from Drop down 
		t.getNewCustomerBtn().click();
		// enter customer name in Enter customer name field
		String value = f.getExcelvalue("CreateCustomer", 1, 1);
		t.getCustomerNametBox().sendKeys(value);
		Thread.sleep(3000);
		//Enter description in description field
		t.getDescriptionTbox().sendKeys(f.getExcelvalue("CreateCustomer", 1, 3));
		Thread.sleep(3000);
		//Click on select customer dropdown
		t.getSelectCustomerDropDown().click();
		Thread.sleep(3000);
		//Select Our company from  the list
		t.getSelectOurCompany().click();
		//click on Create customer button
		t.getCreateCustomerBtn().click();
		Thread.sleep(5000);
		
		WebElement isCustomerCreated = driver.findElement(By.xpath("//div[.='"+value+"' and @class='title']"));
		if(isCustomerCreated.isDisplayed())
		{
			f.setExcelValue("TestCases", 1, 6, "Pass");
			Reporter.log("Customer Created Successfully", true);
		}
		else
		{
			f.setExcelValue("TestCases", 1, 6, "Fail");
			Reporter.log("Customer not Created", true);
		}
		
	} 
	
	@Test
	public void testCreateCustomerHomePage() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HomePage h= new HomePage(driver);
		//click on New link
		h.getNewCreateCustomerLink().click();
		Thread.sleep(3000);
		//click on select customer to get the drop down list
		h.getSelectCustomerDropDown().click();
		Thread.sleep(3000);
		//select new customer option from the dropdown list
		h.getSelectNewCustomer().click();
		//Read the value from excel sheet and enter it in customer name text box
		String value= f.getExcelvalue("CreateCustomer", 2, 1);
		h.getCustomerNameTbox().sendKeys(value);
		//Read the value from excel sheet and enter the value 
		h.getProjectNameTbox().sendKeys(f.getExcelvalue("CreateCustomer", 2, 2));
		//Read the value from excel sheet and enter the value 
		h.getTaskNameTbox().sendKeys(f.getExcelvalue("CreateCustomer", 2, 3));
		//Click on create task button
		h.getCreateTaskBtn().click();
		//check if customer is successfully created
		WebElement isCustomerCreated = driver.findElement(By.xpath("//span[.='"+value+"']"));
		if(isCustomerCreated.isDisplayed())
		{
			f.setExcelValue("TestCases", 2, 6, "Pass");
			Reporter.log("Customer Created Successfully", true);
		}
		else
		{
			f.setExcelValue("TestCases", 2, 6, "Fail");
			Reporter.log("Customer not Created", true);
		}
		
	}

}
