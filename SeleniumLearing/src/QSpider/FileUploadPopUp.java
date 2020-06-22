package QSpider;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FileUploadPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li/a/div[.='Login']")).click();
		driver.findElement(By.xpath("//div[@class='form-row']/input[@type='text']")).sendKeys("sanjana21batni@gmail.com");
		driver.findElement(By.xpath("//div[@class='form-row']/input[@type='password']")).sendKeys("2sanjana123@");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.findElement(By.xpath("//div[@title='Sanjana S Batni']")).click();
		WebElement name = driver.findElement(By.xpath("//b[@class='truncate exten']"));
		String oldTitle = name.getAttribute("title");
		System.out.println(oldTitle);
		File f= new File("./file_data/SanjanaSBatni_QA_Resume_April20.pdf");
		String absolutePath = f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(absolutePath);
		Thread.sleep(10000);
		String newTitle = name.getAttribute("title");
		System.out.println(newTitle);
		
		if(newTitle.equals("SanjanaSBatni_QA_Resume_April20.pdf"))
		{
			System.out.println("Resume was uploaded successfully");
		}
		else
		{
			System.out.println("Resume upload failed");
		}
		
		
	}

}
