package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement f = driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		driver.switchTo().frame(f);
		driver.findElement(By.xpath("//*[@fdprocessedid='vwxpj7']")).sendKeys("Frame is textable");

	}

}
