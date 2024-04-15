package CucumberBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DDT {
	

	static WebDriver driver = null;
	
	@Given("open the link")
		public static void OpenBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
			
		}
	
	@When("enter credentials \\\"(.*)\\\" and \\\"(.*)\\")
		public static void Login(String username, CharSequence[] password) {
		WebElement text = driver.findElement(By.id("ta1"));
		text.sendKeys(username);
		text.sendKeys(password);
	
	}
	
	@Then("I validate the outcomes")
		public static void Validate() {
		WebElement text = driver.findElement(By.id("ta1"));
		String Vtext = text.getText();
		if(Vtext.equalsIgnoreCase("Vishnu 12345")) {
			System.out.println("Test is validated");
		}
		else {
			System.out.println("Validation not successfull");
		}
	
}
}

