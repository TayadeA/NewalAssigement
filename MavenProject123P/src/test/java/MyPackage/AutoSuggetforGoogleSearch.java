package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggetforGoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("input")).sendKeys("java tutorial");
		List<WebElement> list= driver.findElements(By.id("//li[@class = 'sbct']//div[@role='option']//div[1]/span"));
		System.out.println("size of auto suggestion:"+list.size());
		
		for(WebElement listitem:list) {
			if(listitem.getText().contains("beginners")) {
				
				listitem.click();
				break;
				
				
			}
		}
		
		
		
	}



	}


