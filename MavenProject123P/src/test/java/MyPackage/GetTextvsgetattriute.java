package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextvsgetattriute {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement emailbox = driver.findElement(By.id("Email"));
		emailbox.clear();
		Thread.sleep(5000);

		emailbox.sendKeys("admin123@gmail.com");
		
		//capturing text from input box 
		
		System.out.println("result from getattribute ()method :"+emailbox.getAttribute("value"));
		System.out.println("result from gettext ()method :" +emailbox.getText());
		
		//gettext()---- return the innerText
		
		//login button 
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("class"));
		System.out.println(button.getText());
		
		//passwordbox
		WebElement passwordbox = driver.findElement(By.xpath("//input[@id='Password']"));
		System.out.println(passwordbox.getAttribute("value"));
		System.out.println(passwordbox.getAttribute("type"));
		System.out.println(passwordbox.getAttribute("class"));
		
		
		String Title = driver.findElement(By.xpath(" //h1[contains(text(),'Admin area demo')]")).getText();
		System.out.println(Title);
	
		
		
		
		
		
		

}
}

