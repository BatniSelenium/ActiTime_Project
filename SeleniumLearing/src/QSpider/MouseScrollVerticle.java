package QSpider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScrollVerticle {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.msn.com/en-in/");
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		j.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		j.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//h3[.='Thousands of movies and TV shows to watch, anytime, anywhere. Start now!']"));
		int y = e.getLocation().getY();
		j.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(9000);
		driver.close();

	}

}
