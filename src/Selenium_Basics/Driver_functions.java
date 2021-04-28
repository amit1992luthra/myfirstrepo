package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_functions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Webdriver Commands
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//browser navigation commands
		
		driver.navigate().to("https://www.makemytrip.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	
		driver.quit();

	}

}
