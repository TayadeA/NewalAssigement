package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatebrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PCS\\eclipse-workspace\\TestSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.onlinesbi.com/");
		Thread.sleep(3000);
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tayderakshay@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("pass@123");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
