package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement UNTextBox;
	private WebElement PWTextBox;
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver)
	{
		UNTextBox= driver.findElement(By.id("username"));
		PWTextBox= driver.findElement(By.name("pwd"));
		LoginButton= driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setUserName(String un)
	{
		UNTextBox.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		PWTextBox.sendKeys(pw);
	}
	public void clickLoginButton()
	{
		LoginButton.click();
	}	
}
