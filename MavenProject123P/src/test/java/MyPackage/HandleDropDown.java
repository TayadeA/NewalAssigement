package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		Thread.sleep(50000);
		WebElement drpcountryele  = driver.findElement(By.id("input-country"));
		
		Select drpcountry = new Select(drpcountryele);
		//drpcountry.selectByVisibleText("denmark");
		//drpcountry.selectByValue("10"); 	//argentina
		//drpcountry.selectByIndex(6);	//austrilia
		
		//selecting option from dropdown without using method
		List<WebElement>alloption = drpcountry.getOptions();
		for (WebElement option : alloption ) {
			
			if (option.getText().equals("cuba")) {
				option.click();
				break;
				
			}
		}
		
		
		
		
	}

}
