package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='drp1]//div[@class='dropdown']")).click();
		//product type :
		List<WebElement> producttype = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println("Number of producttype :" +producttype.size());
		
		for(WebElement ptype :producttype) {
			
			if (ptype.getText().equals("Watchlist")) {
				ptype.click();
				break;
				
				
			}
		}
		
	}

}
