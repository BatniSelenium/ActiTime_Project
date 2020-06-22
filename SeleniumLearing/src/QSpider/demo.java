package QSpider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo{
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}



}
