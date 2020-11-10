package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RSALoginpagePF {

	WebDriver driver;
	public RSALoginpagePF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*By email=By.id("user_email");
	By password=By.name("user[password]");
	By login=By.name("commit");*/
	
	@FindBy(id="user_email")
	WebElement email;
	
	@FindBy(name="user[password]")
	WebElement password;
	
	@FindBy(name="commit")
	WebElement login;
	
	public WebElement email()
	{
		return email;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement login()
	{
		return login;
	}
		
}
