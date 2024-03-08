package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class open {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/selenium/web/web-form.html");
		String title=driver.getTitle();
		System.out.println("the title is:"+title);
		
		//Enter text in field 
		WebElement name=driver.findElement(By.id("my-text-id"));
		// helpful to clear data in html if any
		name.clear();
		name.sendKeys("Karolin");
		
		//Printing entered text in console
		String Enteredtext=name.getAttribute("value");
		System.out.println(Enteredtext);
		
		//switch to other tab
		driver.switchTo().newWindow(WindowType.TAB);
	}

}
