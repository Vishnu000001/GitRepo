package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TngDataProvider {
	
	
	@Test (dataProvider = "getData")
	public static void OpenBroswer(String name, String age) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//*[@id='ta1']")).sendKeys("Name is "+name+" Age is "+age);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Vishnu";
		data[0][1] = "27";
		
		data[1][0] = "NR";
		data[1][1] = "25";
		
		return data;
	}
	

}
