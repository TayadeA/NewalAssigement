package testpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		List<WebElement> allTags = driver.findElements(By.tagName("a"));
		System.out.println("all tags are "+ allTags);
		
		
		
		

	}

}