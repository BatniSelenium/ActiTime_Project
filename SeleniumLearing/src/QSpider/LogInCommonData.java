package QSpider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInCommonData {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("./file_data/CommonData.property");
		Properties p= new Properties();
		p.load(fis);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
