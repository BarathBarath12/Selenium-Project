package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
		driver.get("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement bestSel = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[text()='Best Sellers']"));
		Actions a = new Actions(driver);
		a.contextClick(bestSel).perform();
		a.sendKeys(Keys.PAGE_DOWN);
		a.sendKeys(Keys.PAGE_DOWN);
		a.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		a.perform();
		

	}

}
