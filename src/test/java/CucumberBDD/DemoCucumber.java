package CucumberBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCucumber {
	
	WebDriver driver = null;

@Given("Open the Broser")
public void open_the_broser() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.google.co.in/");
}

@When("I type the {string} in step")
public void i_type_the_in_step(String string) {
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/textarea[1]")).sendKeys(string);
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
}

@Then("verify the result in step")
public void verify() {
	String text = driver.findElement(By.xpath("//*[@class='gLFyf']")).getText();
	if(text.equalsIgnoreCase("best english songs list from 2000 - 2010")) {
		System.out.println("Passed");
	}
	else {
		System.out.println("Failed");
	}
}
	

}