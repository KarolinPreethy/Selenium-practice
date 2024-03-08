package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/selenium/web/web-form.html");
		
		// id
		WebElement name=driver.findElement(By.id("my-text-id"));
		name.sendKeys("Karolin");
		//name
		WebElement passname=driver.findElement(By.name("my-password"));
		passname.sendKeys("Karolin123");
		
		//xpath
		WebElement desc=driver.findElement(By.xpath("//textarea[@name='my-textarea']"));
		desc.sendKeys("Karolin123 hi helo how are u");
		
		//linktext
		WebElement link=driver.findElement(By.linkText("Return to index"));
		link.click();
	}

}
