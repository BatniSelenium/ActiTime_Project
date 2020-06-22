package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Sanjana Batni
 *
 */
public class HomePage {
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="//span[.='New']")
	private WebElement newCreateCustomerLink;
	
	@FindBy(id="container_tasks")
	private WebElement tasksMenu;
	
	@FindBy(xpath="//div[.='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDropDown;
	
	@FindBy(xpath="//div[.='- New Customer -']")
	private WebElement selectNewCustomer;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement customerNameTbox;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	private WebElement projectNameTbox;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement taskNameTbox;
	
	@FindBy(xpath="//div[.='Create Tasks']")
	private WebElement createTaskBtn;
	
	/**
	 * 
	 * @param driver
	 */
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement getSelectCustomerDropDown() {
		return selectCustomerDropDown;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getSelectNewCustomer() {
		return selectNewCustomer;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getCustomerNameTbox() {
		return customerNameTbox;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getProjectNameTbox() {
		return projectNameTbox;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getTaskNameTbox() {
		return taskNameTbox;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getCreateTaskBtn() {
		return createTaskBtn;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getNewCreateCustomerLink() {
		return newCreateCustomerLink;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getTasksMenu() {
		return tasksMenu;
	}
}
