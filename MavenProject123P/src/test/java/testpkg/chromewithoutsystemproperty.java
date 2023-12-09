package testpkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromewithoutsystemproperty {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();	
		String Title = driver.getTitle();
		System.out.println("application title is :"+Title);
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println("application URL is :"+url);
		Thread.sleep(3000);
		String pagesource = driver.getPageSource();
		System.out.println("application page source is :"+pagesource);
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
