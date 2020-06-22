package QSpider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUp {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//div/label[@for='departure']")).click();
		WebElement arrow = driver.findElement(By.xpath("//div/span[@aria-label='Next Month']"));
		arrow.click();
		arrow.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Sat Jul 25 2020']")).click();
		driver.close();
	}

}
