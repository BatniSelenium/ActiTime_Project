package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pom.Loginpage;



public class LoginpageMainMethod {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Loginpage lp= new Loginpage(driver);
		lp.testLogo();
		lp.testAppName();
		lp.testLogin("admin1", "manager1");
		Thread.sleep(4000);
		lp.testLogin("admin", "manager");
	}
	
	
	
}
