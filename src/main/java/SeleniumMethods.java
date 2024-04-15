import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMethods {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://omayo.blogspot.com/");
		String T = driver.getTitle();
		Set<String> WH = driver.getWindowHandles();
		
		WebElement Dd = driver.findElement(By.id("multiselect1"));
		Select s1 = new Select(Dd);
		s1.selectByValue("audix");
		
		WebElement DD = driver.findElement(By.xpath("//select[@id='drop1']"));
		Select s2 = new Select(DD);
		s2.selectByValue("def");
		
		driver.findElement(By.id("ta1")).sendKeys("Day1 is done. continue if you have interest");
		
		System.out.println(T);
		System.out.println(WH);
		
		

	}

}
