package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions_Demo {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("barath");
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a");
		a.sendKeys("c");
		a.keyUp(Keys.CONTROL);
		a.sendKeys(Keys.TAB);
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v");
		a.keyUp(Keys.CONTROL);
		a.perform();

	}
}
