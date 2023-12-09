package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		//how to used findelement() -----> Return the single WebElement
		
		//1
		//WebElement searchbox = driver.findElement(By.id("small-searchterms"));
		
		
		//2
		//WebElement ele = driver.findElement(By.name("footer-upper"));
		//System.out.println(ele.getText());
		
		//findelements()  ----> Returns multiple web element
		//1
		List<WebElement>links= driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of element captured:"+links.size());
		
		for (WebElement ele:links) {
			System.out.println(ele.getText());
		}
		
		//2
		//List<WebElement>logo=driver.findElements(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		//System.out.println("Number of element captured:"+logo.size());
		
		
		
		
		
		
		
	}

}
