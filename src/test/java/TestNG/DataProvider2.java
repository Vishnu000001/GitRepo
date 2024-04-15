package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider2 {
@Test (dataProvider="getData")
	public static void EnterName(String name) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.xpath("//*[@id='ta1']")).sendKeys("Name is "+name);

	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][1];
		data[0][0]="Vishnu";
		
		return data;
		
	}

}


