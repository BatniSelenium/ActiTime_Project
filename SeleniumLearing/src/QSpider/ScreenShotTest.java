package QSpider;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ScreenShotTest {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testSS() throws IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot t= (TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dstn= new File("./Screenshot/google.png");
		FileUtils.copyFile(src, dstn);
		driver.close();
	}

}
