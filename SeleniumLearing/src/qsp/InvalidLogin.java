package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l= new LoginPage(driver);
		l.setUserName("admin1");
		l.setUserName("mnager1");
		l.clickLoginButton();
		Thread.sleep(5000);
		l.setUserName("admin");
		l.setUserName("manager");
		l.clickLoginButton();
	}

}
