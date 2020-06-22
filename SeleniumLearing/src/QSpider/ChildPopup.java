package QSpider;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://popuptest.com/popuptest1.html");
		String parentWH = driver.getWindowHandle();
		Set<String> childWH = driver.getWindowHandles();
		int count = childWH.size();
		System.out.println(count);
		System.out.println(parentWH);
		for(String allWH: childWH) 
		{
			System.out.println(allWH);
		}
		
		driver.quit();
	}

}
