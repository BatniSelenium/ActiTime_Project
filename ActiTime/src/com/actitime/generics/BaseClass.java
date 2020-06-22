package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.LoginPage;
/**
 * 
 * @author Sanjana Batni
 *
 */
public class BaseClass {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public WebDriver driver;
	public FileLib f = new FileLib();
	//public CommonLibrary c= new CommonLibrary();

	@BeforeClass
	public void OpenBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
	
	@BeforeMethod
	/**
	 * Used for Logging into ActiTime Application
	 * @throws IOException
	 */
	public void LoginApp() throws IOException
	{
		driver.get(f.getPropertyValue("url"));
		LoginPage l= new LoginPage(driver);
		l.setLogin(f.getPropertyValue("username"), f.getPropertyValue("password"));
	}
	
	@AfterMethod
	/**
	 * used to Logging out from ActiTime Application
	 */
	public void LogoutApp()
	{
		HomePage h= new HomePage(driver);
		h.getLogoutLink().click();
	}

}
