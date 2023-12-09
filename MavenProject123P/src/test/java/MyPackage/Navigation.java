package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://snapdeal.com/");
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		//
		driver.navigate().back();	// this will goes to snapdeal page
		driver.navigate().forward();	//this will goes to again on amzaon.com
		driver.navigate().refresh();		//this command refresh or reload the page
		
		
	}

}
