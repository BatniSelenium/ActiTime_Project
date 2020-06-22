package QSpider;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildCloseSpecific {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://popuptest.com/popuptest1.html");
		String parentWH = driver.getWindowHandle();
		String expectedTitle = driver.getTitle();
		Set<String> allWH = driver.getWindowHandles();
		for(String wh: allWH)
		{
			driver.switchTo().window(wh);
			String actualTitle = driver.getTitle();
			if(expectedTitle.contains(actualTitle));
			driver.close();
		}
	
	}

}
