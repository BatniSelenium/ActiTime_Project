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
public class LoginPage {
	
	@FindBy(id="username")
	private WebElement UnTBox;
	
	@FindBy(name="pwd")
	private WebElement PwTBox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBtn;
	/**
	 * 
	 * @param driver
	 */
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/**
	 * 
	 * @param un
	 * @param pw
	 */
	//Business logic method
	public void setLogin(String un, String pw)
	{
		UnTBox.sendKeys(un);
		PwTBox.sendKeys(pw);
		LoginBtn.click();
	}
}
