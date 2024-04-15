package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("newWindowBtn")).click();
		String CurrentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		for(String wh:windows) {
			if(!wh.equals(CurrentWindow)) {
				driver.switchTo().window(wh);
				driver.manage().window().maximize();
				Actions a = new Actions(driver);
				WebElement e = driver.findElement(By.xpath("(//*[contains(text(), 'Home')])[3]"));
				a.moveToElement(e);
				e.click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(CurrentWindow);
		
		System.out.println(driver.getTitle());

	}

}
