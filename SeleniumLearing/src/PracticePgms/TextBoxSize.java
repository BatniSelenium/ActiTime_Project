package PracticePgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxSize {
	
	WebDriver driver= new ChromeDriver();
	int h1;
	int h2;
	int w1;
	int w2;
	
	public void GetTextBoxHeightWidth_Email() {
		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	
		WebElement emailAddrTBX = driver.findElement(By.id("email"));
		h1 = emailAddrTBX.getSize().getHeight();
		w1= emailAddrTBX.getSize().getWidth();
		System.out.println("Email Text box height and width");
		System.out.println("Height="+ h1);
		System.out.println("Width="+ w1);
		System.out.println("____________________________________");
			
	}
	
	public void GetTextBoxHeightWidth_Pwd()
	{
		WebElement pwdTBX = driver.findElement(By.name("password"));
		h2 = pwdTBX.getSize().getHeight();
		w2 = pwdTBX.getSize().getWidth();
		System.out.println("Password Text box height and width");
		System.out.println("Height="+ h2);
		System.out.println("Width="+ w2);
		System.out.println("_____________________________________");
	}
	
	/*public void getCaptcha()
	{
		WebElement captchaTBX = driver.findElement(By.xpath("//div[@class='rc-anchor-content']"));
		int h1=captchaTBX.getSize().getHeight();
		int w1=captchaTBX.getSize().getWidth();
		System.out.println("Captcha box size");
		System.out.println("height="+ h1);
		System.out.println("width="+ w1);
	} */
	
	public void compareBoxes()
	{
		System.out.println("1-TEST CASE TO CHECK IFTEXT BOXES ARE OF EQUAL SIZE");
		if(h1==h2 && w1==w2)
		{
			System.out.println("PASS : Height and width of both the checkboxes are same");
		}
		else
		{
			System.out.println("FAIL : height and width are not same hence not alligned as expected");
		}
		System.out.println("____________________________________________________________________________");
	}



}
