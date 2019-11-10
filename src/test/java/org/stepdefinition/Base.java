package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	static WebDriver driver;
	public static WebDriver getDriverAccess() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yumthang Valley\\Downloads\\ID card\\Cucumber\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void loadUrl(String a) {
		driver.get(a);
		
	}
	
	public static void fill(WebElement a,String b) {
		a.sendKeys(b);
	}
	
	public static void click(WebElement a) {
		a.click();
	}
	
	public static void sleep() {
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}

}
