package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	public static WebDriver driver;

	public static void m1() throws InterruptedException {
		Thread.sleep(2000);
		Actions ae = new Actions(driver);
		WebElement tShirt = driver.findElement(
				By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/descendant::li[14]/a"));
		ae.moveToElement(tShirt).perform();
		ae.clickAndHold().perform();
		Thread.sleep(3000);
		ae.release().perform();
		// ae.contextClick().build().perform();
		// ae.click(tShirt).build().perform();
	}

	public static void m2() throws InterruptedException {
		Actions ar = new Actions(driver);
		WebElement a = driver.findElement(
				By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/descendant::li[10]/a"));

		ar.moveToElement(a).build().perform();
		Thread.sleep(1000);
		WebElement casual = driver.findElement(By.xpath(
				"//ul[@class='submenu-container clearfix first-in-line-xs']/descendant::li[1]/a[@title='Casual Dresses']"));
		//ar.moveToElement(casual).build().perform();
		//ar.clickAndHold().perform();
		//ar.release().perform();
		// b.contextClick().build().perform();
		// b.click().build().perform();
	}

	public static void m3() throws InterruptedException {
		Actions a1 = new Actions(driver);
		Thread.sleep(1000);
		WebElement women = driver.findElement(By.xpath(
				"//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/descendant::li/a[@title='Women']"));
		a1.moveToElement(women).perform();
		//a1.contextClick().perform();
		a1.clickAndHold().perform();
		Thread.sleep(1000);
		WebElement summarDress = driver.findElement(
				By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/descendant::li[7]/a"));
		a1.moveToElement(summarDress).build().perform();
		// a1.click().perform();
		// a1.doubleClick().perform();
		// a1.contextClick().perform();
		a1.clickAndHold().perform();
		a1.release().perform();
		
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		m1();
	}
}
