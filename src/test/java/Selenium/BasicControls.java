package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicControls {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement FirstName = driver.findElement(By.xpath("//*[@id='firstName']"));
		FirstName.sendKeys("Nandhini");
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.xpath("//*[@id='lastName']"));
		lastName.sendKeys("Ramamoorthy");
		Thread.sleep(2000);
		
		WebElement RB = driver.findElement(By.xpath("//*[@id='femalerb']"));
		RB.click();
		Thread.sleep(2000);
		
		WebElement Lang = driver.findElement(By.xpath("//*[@id='englishchbx']"));
		Lang.click();
		Thread.sleep(2000);
		
		WebElement Link = driver.findElement(By.xpath("//*[contains(text(), 'Click here to navigate to the home page')]"));
		Link.click();
		

	}

}
