package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RSAFPwdpage {

	WebDriver driver;
	public RSAFPwdpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	By fpwd=By.linkText("Forgot Password?");
	By emailid=By.cssSelector("[type='email']");
	By sendme=By.name("commit");
	
	public WebElement fpwd()
	{
		return driver.findElement(fpwd);
	}
	public WebElement emailid()
	{
		return driver.findElement(emailid);
	}
	public WebElement sendme()
	{
		return driver.findElement(sendme);
	}
	
}
