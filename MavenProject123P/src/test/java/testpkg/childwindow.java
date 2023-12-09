package testpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("windowButton")).click();
		WebElement text  = (WebElement) driver.findElement(By.id("sampleHeading"));
		System.out.println("child window text is:"+text);
		// get window handle method 
		String parentWindows  = driver.getWindowHandle();
		// handle child windows
		Set<String> parentsWindows =  driver.getWindowHandles();
		
		
		
		
		
	}

}
