package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElement_Commands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://corporate.olacabs.com/");
		
		driver.findElement(By.id("link-contact")).click();		
		
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input"));
		element.sendKeys("IBM");
		
		WebElement element1 = driver.findElement(By.xpath("//input[@value='Submit']"));
		element1.click();
		
		
		
		
		
		
		
	}

}
