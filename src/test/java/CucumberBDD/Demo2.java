package CucumberBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

		WebDriver driver = null;
		
		@Given ("Open the browser")
		public void Open_the_browser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
		}
		
	    @When("^I enter the (.*) and(.*)$")
	    public void enter_values(String name, String email) {
	    	driver.findElement(By.xpath("//*[@placeholder = 'First Name']")).sendKeys(name);
	    	driver.findElement(By.xpath("//*[@placeholder = 'Last Name']")).sendKeys(email);
	    	
	    }
		

	

	

}
