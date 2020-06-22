package QSpider;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Set<String> allTabs = driver.getWindowHandles();
		Iterator<String> is= allTabs.iterator();
		String parentTab = is.next();
		String childTab= is.next();
		driver.switchTo().window(childTab);
		
		List<WebElement> allHeadings = driver.findElements(By.xpath("//h2"));
		for(WebElement heading : allHeadings)
		{
			String text = heading.getText();
			System.out.println(text);
		}
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parentTab);
		driver.close();
		

	}

}
