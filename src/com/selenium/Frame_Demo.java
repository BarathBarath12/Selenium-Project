package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("SingleFrame");
		WebElement b = driver.findElement(By.xpath("//input[@type='text']"));
		b.sendKeys("Barath");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement c = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		c.click();
		WebElement d = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(d);
		WebElement e = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(e);
		WebElement g = driver.findElement(By.xpath("//input[@type='text']"));
		g.sendKeys("Barath");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		WebElement h = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		h.click();
		
	}

}
