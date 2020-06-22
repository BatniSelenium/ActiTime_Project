package PracticePgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlignment extends TextBoxSize {
	
	public void checkAxisEmail()
	{
		WebElement emailAddrTBX = driver.findElement(By.id("email"));
		System.out.println("2-Test to check Location of text boxes");
		System.out.println("Location of email  text box");
		System.out.println("x:"+ emailAddrTBX.getLocation().getX());
		System.out.println("y:"+ emailAddrTBX.getLocation().getY());
		System.out.println("____________________________________________");
	}
	
	public void checkAxisPwd()
	{
		WebElement pwdTBX = driver.findElement(By.name("password"));
		System.out.println("Location of password text box");
		System.out.println("X:" +pwdTBX.getLocation().getX());
		System.out.println("y:"+ pwdTBX.getLocation().getY());
		System.out.println("____________________________________________");
	}
	


}
