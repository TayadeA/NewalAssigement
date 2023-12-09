package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebelement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//isEnabled(), isDisplayed(),
		WebElement searchstore=driver.findElement(By.id("small-searchterms"));
		System.out.println ("Display status :" +searchstore.isDisplayed()); //true
		System.out.println ("Enabled status :" +searchstore.isEnabled());	//true
		
		// isSelected() : used for radio button, checkbox, dropdown,		
		WebElement  male = driver.findElement(By.id("gender-male"));
		WebElement female = driver.findElement(By.id("gender-female"));
		
		System.out.println(male.isSelected());		//false 		// if already is not selected then we get false status
		System.out.println(female.isSelected());	//false
		
		male.click();	//select male radio button
		System.out.println(male.isSelected()); 		//true 	//here , male radio button is selected so it is 
		System.out.println(female.isSelected());	//false
		
		female.click();	//select female radio button
		System.out.println(male.isSelected());		//false
		System.out.println(female.isSelected());	//true
		
		
		
		
	}

}
