package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import testpkg.WebElement;

public class CheckDropdownSortedOrNot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Live Posting')]\r\n")).click();
		WebElement drpele = (WebElement) driver.findElement(By.name("category_id"));
		
		
		
		
		
		

	}

}
