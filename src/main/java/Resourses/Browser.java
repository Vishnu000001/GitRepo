package Resourses;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browser extends LocatorsLinks{

	WebDriver driver;
	@SuppressWarnings("deprecation")
	public WebDriver Initialisedriver() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the broswer name to start the browser");
		String Browser = s.next();
		s.close();
		
		String Chrome = "chrome";
		String Firefox = "firefox";
		String IE = "internet explorer";
		
		if(Browser.equalsIgnoreCase(Chrome)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase(Firefox)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase(IE)) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		return driver;
	}

}
