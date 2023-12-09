package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionRightClass {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PCS\\eclipse-workspace\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ele= (WebElement) driver.findElement(By.xpath("//button[@name = 'login']"));
		Actions act = new Actions(driver);
		act.contextClick((org.openqa.selenium.WebElement) ele).perform();
		
		

	}

}
