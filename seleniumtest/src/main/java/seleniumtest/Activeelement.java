package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activeelement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		try {
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("Karolin");
		String attr=driver.switchTo().activeElement().getAttribute("title");
		System.out.println(attr);
		}
		finally {
			driver.quit();
		}
	}
}