package com.selenium.daily.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		a.click();
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.xpath("//input[@name='username']"));
		b.sendKeys("BarathKumar");
		WebElement c = driver.findElement(By.xpath("//input[@name='password']"));
		c.sendKeys("Barath@998");
		WebElement j = driver.findElement(By.xpath("//input[@name='full_name']"));
		j.sendKeys("Barath");
		WebElement d = driver.findElement(By.xpath("//input[@name='re_password']"));
		d.sendKeys("Barath@998");
		WebElement e = driver.findElement(By.xpath("//input[@name='email_add']"));
		e.sendKeys("stylezzbarath992@gmail.com");

	}

}
