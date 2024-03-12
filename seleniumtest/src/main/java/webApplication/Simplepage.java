package webApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simplepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/selenium/web/web-form.html");
		WebElement text=driver.findElement(By.id("my-text-id"));
		WebElement pass=driver.findElement(By.name("my-password"));
		WebElement textarea=driver.findElement(By.name("my-textarea"));
		
		text.sendKeys("Karolin");
		pass.sendKeys("pree");
		textarea.sendKeys("Study well");
		
//		WebElement disableinput=driver.findElement(By.name("my-disabled"));
//		WebElement readonlyinput=driver.findElement(By.name("my-readonly"));
//		
//		disableinput.sendKeys("yes");
//		readonlyinput.sendKeys("no");
		WebElement dropdown=driver.findElement(By.name("my-select"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("One");
		
		//dropdown datalist
		
		
		//uploading file
//		
//		WebElement file=driver.findElement(By.name("my-file"));
//		file.click();
//		file.sendKeys("C:\\Users\\Administrator\\Pictures\\nature.png");
//		String name=file.getAttribute("value");
//		System.out.println(name);
		
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();

	}

}
