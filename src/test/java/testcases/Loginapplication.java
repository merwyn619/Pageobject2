package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectrepository.RSAFPwdpage;
import objectrepository.RSALoginpage;

public class Loginapplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\merwynn\\Documents\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1");
		RSALoginpage rs=new RSALoginpage(driver);
		rs.email().sendKeys("Hello@abc.com");
		rs.password().sendKeys("123456");
		rs.login().click();		
		/*RSAFPwdpage rfp=new RSAFPwdpage(driver);
		rfp.fpwd().click();
		rfp.emailid().sendKeys("amit@abc.com");
		rfp.sendme().click();*/
		Assert.assertTrue(driver.getTitle().equals("Log In to Rahul Shetty Academy"));
	}
	
}
