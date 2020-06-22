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
public class TaskListPage {
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomerBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customerNametBox;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionTbox;
	
	@FindBy(xpath="//div[.='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDropDown;
	
	@FindBy(xpath="//div[.='Our company' and  @class='itemRow cpItemRow ']")
	private WebElement selectOurCompany;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerBtn;
	
	/**
	 * Elements required for deleting the customer
	 */
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement SearchCustomer;
	
	@FindBy(xpath="//span[@class='highlightToken']")
	private WebElement selectSearchedCustomer;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']")
	private WebElement editButton;
	
	@FindBy(xpath="(//div[.='ACTIONS'])[1]")
	private WebElement actionsBtn;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deleteBtn;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletePermanentlybtn;
	
	@FindBy(xpath="//div[.='There are no customers or projects']")
	private WebElement isDeleted;
	
	@FindBy(xpath="//div[@class='node customerNode editable selected']//div[@class='editButton']")
	private WebElement editBtn;
	
	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getIsDeleted() {
		return isDeleted;
	}

	public WebElement getSearchCustomer() {
		return SearchCustomer;
	}
	
	public WebElement getSelectSearchedCustomer() {
		return selectSearchedCustomer;
	}

	public WebElement getEditButton() {
		return editButton;
	}

	public WebElement getActionsBtn() {
		return actionsBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getDeletePermanentlybtn() {
		return deletePermanentlybtn;
	}
	
	/**
	 * 
	 * @param driver
	 */
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * @return
	 */
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getCustomerNametBox() {
		return customerNametBox;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getDescriptionTbox() {
		return descriptionTbox;
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
	public WebElement getSelectOurCompany() {
		return selectOurCompany;
	}
	/**
	 * 
	 * @return
	 */
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	
	/*@FindBy(xpath="//div[.='"+value+"' and @class='title']")
	private WebElement checkCustomerCreated; */
}
