package QSpider;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(10000);
		//String parent = driver.getWindowHandle();
		Set<String> allWH = driver.getWindowHandles();
		System.out.println("using for loop");
		for(String wh: allWH)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			
		}
		
		System.out.println("using Iterator");
		Iterator<String> is= allWH.iterator();
		String parentWH = is.next();
		String childWH= is.next();
		driver.switchTo().window(parentWH);
		System.out.println("Parent Tab Title : "+ driver.getTitle());
		driver.switchTo().window(childWH);
		System.out.println("Child Tab Title : "+ driver.getTitle()); 
		driver.quit(); 
	}

}
