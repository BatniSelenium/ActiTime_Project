package QSpider;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String ParentTab = driver.getTitle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();

		Set<String> allTabs = driver.getWindowHandles();
		for(String tabs: allTabs)
		{
			driver.switchTo().window(tabs);
			if(!(driver.getTitle().equals(ParentTab)))
			{
				driver.close();
			}
			
		}

	}

}
