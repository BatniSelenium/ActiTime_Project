package QSpider;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClose {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://popuptest.com/popuptest1.html");
		String parentwh = driver.getWindowHandle();
		String parentURL = driver.getCurrentUrl();
		System.out.println("Parent URL: "+ parentURL);
		Set<String> childwh = driver.getWindowHandles();
		for(String wh: childwh)
		{
			driver.switchTo().window(wh);
			String childURL = driver.getCurrentUrl();
			if(!(childURL.contains(parentURL)))
			{
				System.out.println("Child URL:"+ childURL);
			}
		}
		driver.quit();
	}

}
