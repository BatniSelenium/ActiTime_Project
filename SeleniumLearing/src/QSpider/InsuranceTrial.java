package QSpider;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class InsuranceTrial {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
			driver.findElement(By.id("policynumber")).sendKeys("1234");
			Thread.sleep(3000);
			WebElement dob = driver.findElement(By.id("dob"));
			dob.click();
			WebElement MonthLB = driver.findElement(By.className("ui-datepicker-month"));
			Select s1= new Select(MonthLB);
			s1.selectByValue("11");
			Thread.sleep(3000);
			WebElement yearLB = driver.findElement(By.className("ui-datepicker-year"));
			Select s2= new Select(yearLB);
			s2.selectByVisibleText("1992");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//td/a[text()='20']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div/button[@class='submit-login']")).click();
			
			driver.close();
		}

	}


