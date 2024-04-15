package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectPractice {
	
    @Test
	public static void method1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement a = driver.findElement(By.xpath("//*[@class='combobox']"));
		Select s = new Select(a);
		s.selectByValue("def");
		driver.quit();
		

	}
	@BeforeMethod
	public static void method2() {
		System.out.println("Selection has been started");
	}
	
	@AfterMethod
	public static void method3() {
		System.out.println("Selection is completed");
	}

}
