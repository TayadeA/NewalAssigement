package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PCS\\eclipse-workspace\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Select  sel = new Select (driver.findElement(By.name("country")));
		//sel.selectByValue("ARGENTINA");
		//sel.selectByIndex(9);
		sel.selectByVisibleText("ANGUILLA");
		driver.close();
		
		
		
		
		

	}

}
