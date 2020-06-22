package QSpider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://login.globalglaze.in/");
		String title = driver.getTitle();
		if(title.equals("Privacy"))
		{
			driver.close();
		}
		else
		{
		driver.findElement(By.className("login")).click();
		//driver.findElement(By.id("adminpassword")).sendKeys("blablablaa"); //to check exception
		Alert pop= driver.switchTo().alert();
		System.out.println(pop.getText());
		pop.accept();
		driver.close();
		}
	}

}
