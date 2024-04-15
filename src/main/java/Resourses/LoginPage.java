package Resourses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[contains(text(),'My Account')])[1]")
	WebElement AccountButton;
	
	@FindBy(xpath="//*[contains(text(),'Login')]")
	WebElement LoginButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	WebElement Username;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	WebElement Password;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement Submit;
	
	@FindBy (xpath = "//*[contains(text(), 'New Customer')]")
	WebElement ValidationText;
	
	public WebElement account() {
		return AccountButton;
	}

	public WebElement login() {
		return LoginButton;
	}
	
	public WebElement username() {
		return Username;
	}
	
	public WebElement password() {
		return Password;
	}
	
	public WebElement submit() {
		return Submit;
	}
	
	public WebElement validation() {
		return ValidationText;
	}
}
