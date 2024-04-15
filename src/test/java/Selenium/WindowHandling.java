package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		
		WebElement e = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]"));
		e.click();
		Set<String> Allwindows = driver.getWindowHandles();
		Iterator<String> Itr = Allwindows.iterator();
		
		while(Itr.hasNext()){
			String CurrentWindow = Itr.next();
			driver.switchTo().window(CurrentWindow);
			
			if(driver.getTitle().equalsIgnoreCase("Selenium")) {
				driver.findElement(By.id("navbarDropdown")).click();
			}
		}
		

	}

}
