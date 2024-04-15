package CucumberBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivernDemo {
	
	WebDriver driver= null;
	@Given("Open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://famoid.com/get-free-instagram-likes/");
		driver.manage().window().maximize();
	    }
	@When("I give the {string} in the step")
	public void i_give_the_https_www_instagram_com_reel_c3au_z6sy_spy_utm_source_ig_web_copy_link_in_step(String url) {
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys(url);
	}
	@Then("I give the {string} in step")
	public void i_give_the_vishnusuriya619_gmail_com_in_step(String email) {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys(email);
	}
	@Then("click on ok")
	public void click_on_ok() {
		driver.findElement(By.xpath("(//*[contains(text(), 'Get Free')])[2]")).click();
	}




}
