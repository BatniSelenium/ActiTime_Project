package RealTimeExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginImpl implements ICommonData{
	static
	{
		System.setProperty("webdriver.chrome.driver", path);
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
