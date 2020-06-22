package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class MainMethodClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage lp= new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLoginButton();
		driver.findElement(By.id("logoutLink")).click();
		driver.close();

	}

}
