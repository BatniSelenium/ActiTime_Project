package QSpider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//before handling notification pop up
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://www.cleartrip.com/");
		Thread.sleep(9000);
		driver1.close();
		
		
		//after handling notification pop up
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://www.cleartrip.com/");
		driver.close();
	}

}
