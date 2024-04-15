import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement f = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(f);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("You made it VISHNU");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("Screenshot\\screenshot1.png"));
		
	    System.out.println("Screenshot captured and saved as screenshot.png");
	    
	    driver.quit();
		

	}

}
