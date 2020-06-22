package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Loginpage {
	
	@FindBy(id="username")
	private WebElement UNTextbox;
	
	@FindBy(name="pwd")
	private WebElement PWTextbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginButton;
	
	@FindBy(xpath="//div[@class='atLogoImg']")
	private WebElement LogoImg;
	
	@FindBy(xpath="//div[@class='atProductName']")
	private WebElement AppName;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Business Logic Method
	public void testLogin(String un, String pw)
	{
		UNTextbox.sendKeys(un);
		PWTextbox.sendKeys(pw);
		LoginButton.click();
	}
	
	public void testLogo()
	{
		if(LogoImg.isDisplayed())
		{
			Reporter.log("Logo Present- PASS", true);
		}
		else
		{
			Reporter.log("Logo not Present- FAIL", true);
		}
	}
	
	public void testAppName()
	{
		if(AppName.isDisplayed())
		{
			Reporter.log("AppName Present- PASS", true);
			Reporter.log(AppName.getText(), true);
		}
		else
		{
			Reporter.log("AppName not present- FAIL", true);
		}
	}

}
