package com.selenium.daily.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		a.click();
		Alert s = driver.switchTo().alert();
		System.out.println(s.getText());
		Thread.sleep(3000);
		s.dismiss();
		WebElement b = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		b.click();
		Alert j = driver.switchTo().alert();
		System.out.println(j.getText());
		Thread.sleep(3000);
		j.dismiss();
		WebElement g = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		g.click();
		Alert h = driver.switchTo().alert();
		System.out.println(h.getText());
		h.sendKeys("Barath");
		Thread.sleep(3000);
		h.accept();

	}

}
