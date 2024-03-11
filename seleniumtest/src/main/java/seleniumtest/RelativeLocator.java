package seleniumtest;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/selenium/web/web-form.html");
//		WebElement d=driver.findElement(By.id("my-text-id"));
//		By res=RelativeLocator.with(By.tagName("input")).below(By.id("my-text-id"));
//		driver.findElement(res).sendKeys("karolin123");
//		
	}

	

}
