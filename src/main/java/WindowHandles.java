import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://preply.com/en/blog/english-pronunciation-practice/");
		driver.findElement(By.xpath("//div[@class='header__part']//a[contains(@class,'btn')][normalize-space()='Find 1-on-1 tutors']")).click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> Itr = wh.iterator();
		
		
		while(Itr.hasNext()) {
			String wid = Itr.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().equals("Online English tutors and teachers for private English lessons")){
				Thread.sleep(10000);
				driver.findElement(By.linkText("Get started")).click();
			}
		}

	}

}
