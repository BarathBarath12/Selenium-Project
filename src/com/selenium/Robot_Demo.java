package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Demo {

	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {
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
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		// Open New Window - r.keyPress(KeyEvent.VK_DOWN);
		// Open New Window - r.keyRelease(KeyEvent.VK_DOWN);
		// open incognito window - r.keyPress(KeyEvent.VK_DOWN);
		// open incognito window -r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement mobile = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[text()='Mobiles']"));
		a.contextClick(mobile).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement deals = driver
				.findElement(By.xpath("//div[@id='nav-xshop']/child::a[contains(text(),'Today')]\r\n" + ""));
		a.contextClick(deals).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}
