package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
		//Using two way we can launch browser
		//first is by using key and value by system.setproperty
		//second is by using WebDriverManager-Api by adding dependency
	public static void main(String[] args) {
		//Chrome Browser
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");*/
		
		//Firefox Driver 
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\FirfoxDriver\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");*/
	
		//Edgedriver
		/*WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");*/

		// Using WebDriverManager- API -No need to manually path 
		
		//Chromedriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the webpage is:"+driver.getTitle());  		//get title of webpage 
		System.out.println("Current URL the webpage is:"+driver.getCurrentUrl());	// get title of current url
		//System.out.println(driver.getPageSource());
		
		
		//****using webdrivermanager ****///
		
		//chrome browser
		//WebDriverManager.chromedriver().setup();
		//Webdriver driver = new Chromedriver();
		
		//Firefox Browser
		//WebDriverManager.firefoxdriver().setup();
		//Webdriver driver = new FireFoxdriver();
		
		//EdgeDriver browser
		//WebDriverManager.chromedriver().setup();
		//Webdriver driver = new EdgeDriver();
		
		
	}

}
