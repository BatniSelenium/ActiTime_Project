package com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.FileLib;


public class demo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	FileLib f= new FileLib();
	WebDriver driver= new ChromeDriver();
@Test(priority = 1)
public void Login() throws IOException
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(f.getPropertyValue("url"));
	driver.findElement(By.id("username")).sendKeys(f.getPropertyValue("username"));
	driver.findElement(By.name("pwd")).sendKeys(f.getPropertyValue("password"));
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Reporter.log("TC_01 : Login", true);
}

@Test(priority=2)
public void Logout()
{
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	Reporter.log("TC_02 : LogOut", true);
}


}
