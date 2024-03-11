package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://selenium.dev/selenium/web/web-form.html");
		driver.get("https://demoqa.com/select-menu");
//		WebElement drop=driver.findElement(By.name("my-select"));
		WebElement drop=driver.findElement(By.name("cars"));
		Select s=new Select(drop);
//		s.selectByIndex(2);
//		s.selectByValue("1");
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Opel");
		List<WebElement> option=s.getOptions();
		for(WebElement o:option) {
			System.out.println(o.getText());
		}
		System.out.println("---------------------");
		List<WebElement> selected=s.getAllSelectedOptions();
		for(WebElement o:selected) {
			System.out.println(o.getText());
		}
		
		
	}
}
