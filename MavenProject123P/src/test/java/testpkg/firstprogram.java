package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//ID attribute 
		driver.findElement(By.id("u_0_3_jU")).sendKeys("test data");
		Thread.sleep(3000);
		//css selector 
		driver.findElement(By.cssSelector("#email")).sendKeys("test css data");
		
		
		driver.close();	

	}

}
