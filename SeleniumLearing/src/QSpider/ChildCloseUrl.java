package QSpider;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class ChildCloseUrl {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://popuptest.com/popuptest1.html");
		Set<String> allWH = driver.getWindowHandles();
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			String actualURL = driver.getCurrentUrl();
			if(actualURL.contains("4")||(actualURL.contains("popuptest1")))
			{
				driver.close();
			}
		}

	}

}
