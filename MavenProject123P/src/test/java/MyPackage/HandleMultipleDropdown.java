package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropdown {
		
		static WebDriver driver;

		public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/button")).click();
		
		//approch 1 :
		
		//Select countrydrp = new Select(driver.findElement(By.id("Form_getForm_Country")));
		//countrydrp.selectByVisibleText("arubia");
		
		//Select employeedrp = new Select(driver.findElement(By.id("Form_getForm_NoOfEmployees")));
		//employeedrp.selectByVisibleText("21 - 25");
		
		//Approach 2 :
		
		WebElement noOfEmployee = driver.findElement(By.name("NoOfEmployees"));
		Selectoptiondropdown(noOfEmployee,"21 - 25");
		WebElement country = driver.findElement(By.name("Country"));	
		Selectoptiondropdown(country,"arubia");
		
		
	}
	public static void Selectoptiondropdown(WebElement ele, String value) {
		
		Select drp = new Select(ele);
		
		List<WebElement>alloption = drp.getOptions();
		for (WebElement option : alloption ) {
			
			if (option.getText().equals(value)) {
				option.click();
				break;
				
			}
		}
	}

}
