package PracticePgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginImpl implements ITestLogin{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	
	WebDriver driver= new ChromeDriver();
	
	public void testLogout()
	{
		driver.findElement(By.xpath("//b[@class='caret']")).click();
		driver.findElement(By.xpath("//a[@href='https://skillrary.com/user/logout']")).click();
		
		String str2 = "https://skillrary.com/user/login";
		if(str2.equals("https://skillrary.com/user/login"))
		{
			System.out.println("Logged out Successfully");
		}
		else
		{
			System.out.println("Failed to logout");
		}
	}
	
	@Override
	public void titleGet() {
		String url1 = driver.getCurrentUrl();
		String title1 = driver.getTitle();
		//System.out.println(url1+"  :  "+ title1);
	}
	
	@Override
	public void openURL() {
		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	}

	@Override
	public void enterCreds() {
		WebElement emailAddrTBX = driver.findElement(By.id("email"));
		emailAddrTBX.sendKeys("sanjana21batni@gmail.com");
		WebElement pwdTBX = driver.findElement(By.name("password"));
		pwdTBX.sendKeys("2sanjana123*");
		
	}

	@Override
	public void selectGroupCode() {
		driver.findElement(By.id("usertype_no"));
		
	}

	@Override
	public void clickSubmit() {
		WebElement sb = driver.findElement(By.xpath("//button[@type='submit']"));
		sb.click();
	}

	public static void main(String[] args) throws InterruptedException {
		
		LoginImpl li= new LoginImpl();
		li.openURL();
		li.titleGet();
		li.enterCreds();
		//li.captcha();
		li.selectGroupCode();
		//li.clickSubmit();
		Thread.sleep(30000);
		li.titleGet();
		
		String str= "https://skillrary.com/user/learning  :  SkillRary | My Courses";
		if(str.equals("https://skillrary.com/user/learning  :  SkillRary | My Courses"))
		{
			System.out.println("Login is successful");
		}
		else
		{
			System.out.println("Failed to login");
		}
		
		li.testLogout();
		li.titleGet();
		
		
	}

	

}
