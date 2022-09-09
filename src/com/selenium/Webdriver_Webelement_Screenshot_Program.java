package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Webelement_Screenshot_Program {

	public static void main(String[] args) throws IOException, UserName_Incorrect {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/log/s?k=log+in");
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		System.out.println("Size is : " + size);
		// Dimension d = new Dimension(700,233);
		// driver.manage().window().setSize(d);

		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		String url = driver.getCurrentUrl();
		System.out.println("Current Url is : " + url);
		// String pageSource = driver.getPageSource();
		// System.out.println("Page source is : " + pageSource);
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		driver.navigate().to("https://www.facebook.com/login/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().back();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Snap\\amazonSanp.jpg");
		FileUtils.copyFile(Source, Destination);
		WebElement e = driver.findElement(By.xpath("//span[contains(text(),'Hello')]"));
		System.out.println(e.getText());
		System.out.println(e.getTagName());
		e.click();
		WebElement a = driver.findElement(By.xpath("//input[@name = 'email']"));
		System.out.println("Element is enable or not : " + a.isEnabled());
		a.sendKeys("barathsmary993@gmail.com");
		System.out.println("Element is display or not : " + a.isDisplayed());
		System.out.println("Location is : " + a.getLocation());
		System.out.println("Element size is : " + a.getSize());
		System.out.println("Rectangle is : " + a.getRect());
		String f = a.getCssValue("font-size");
		System.out.println("Font sixe is : " + f);
		String g = a.getCssValue("background-color");
		System.out.println("Background color is : " + g);
		String h = a.getCssValue("border-right-width");
		System.out.println("Border of webelemet is : " + h);
		
		WebElement b = driver.findElement(By.xpath("//input[@id= 'continue']"));
		b.click();
		WebElement j = driver.findElement(By.xpath("//a[contains(@id,'create')]"));
		j.click();
		driver.get("https://www.facebook.com/login/");
		WebElement k = driver.findElement(By.xpath("//input[@name = 'email']"));

		WebElement l = driver.findElement(By.xpath("//input[@aria-label = 'Password']"));

		WebElement ab = driver.findElement(By.xpath("//button[@name = 'login']"));

		if (k.isEnabled() != l.isEnabled()) {
			k.sendKeys("Barath");
			l.sendKeys("BARATH@998");
			ab.click();

		} else {
			throw new UserName_Incorrect();
		}
	}

}
