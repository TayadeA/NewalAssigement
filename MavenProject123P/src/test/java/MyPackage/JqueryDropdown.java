package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();
		
		 //selectChoicevalues(driver,"choice1");
		//selectChoiceValues(driver, "choice1",choice2", choice3");
		selectChoicevalues(driver,"all");
		
	}





	public static void selectChoicevalues(WebDriver driver,String... value) 
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		{
			if(!value[0].equalsIgnoreCase("all")) 
				for(WebElement item :choiceList) {
					String text =item.getText();
					for(String val:value) {
						if (text.equals(val)) {
							
							item.click();
							break;
							}
						
					}
				}		
			
	
		else
			
		{
			for(WebElement item : choiceList) 
			{
				
				item.click();
				
			}
		}
		}
		driver.close();
		
	}
	
	}
	


