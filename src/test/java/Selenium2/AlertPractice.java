package Selenium2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {
	@Test
	public static void AutoT() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='alert1']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		System.out.println("Alert Accepted");
		driver.quit();
	}

}
