package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explictit_Wait {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/signin");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@name='email']"));
		name.sendKeys("Barath");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("barath");
		WebElement login = driver.findElement(By.xpath("//button[text()='LOGIN']"));
		login.click();
		WebElement a = driver.findElement(By.xpath("//div[@id='toast-container']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(a));
		WebElement b = driver.findElement(By.xpath("//div[@class='buttons']/child::a[text()='Sign up']"));
		wait.until(ExpectedConditions.visibilityOf(b));
		b.click();
	}

}
