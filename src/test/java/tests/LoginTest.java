package tests;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Resourses.Browser;
import Resourses.LocatorsLinks;
import Resourses.LoginPage;



public class LoginTest extends Browser{
	WebDriver driver;

	@Test
	public void login() {
		
		WebDriver driver = Initialisedriver();
		
		LocatorsLinks LL = new LocatorsLinks();
		String Url = LL.url();
		driver.get(Url);
		
		String username = LL.username();
		String password = LL.password();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.account().click();
		loginpage.login().click();
		loginpage.username().sendKeys(username);
		loginpage.password().sendKeys(password);
		loginpage.submit().click();
		
		Assert.assertTrue(loginpage.validation().isDisplayed());
		
		
		
	}
	
	@AfterMethod
	public void Teardown() {
		driver.close();
	}
	
	
	
	
	

}
