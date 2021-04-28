package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("Create a")).click();	

	}

}
