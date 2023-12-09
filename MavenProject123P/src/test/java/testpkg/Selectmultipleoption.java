package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmultipleoption {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PCS\\eclipse-workspace\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Select sel = new Select(driver.findElement(By.id("fruits")));
		//sel.deselectByValue("banana");
		//sel.deselectByIndex(3);
		sel.deselectByVisibleText("Orange");
		
		
		

	}

}
