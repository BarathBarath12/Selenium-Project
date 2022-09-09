package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
	public static WebDriver driver;

	public static void simple_Alert() throws InterruptedException {
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		a.click();
		Thread.sleep(2000);
		Alert sim_Alert = driver.switchTo().alert();
		sim_Alert.accept();
		

	}

	private static void confrim_Alert() throws InterruptedException {
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		b.click();
		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		c.click();
		Thread.sleep(2000);
		Alert confirm_Alert = driver.switchTo().alert();
		System.out.println(confirm_Alert.getText());
		confirm_Alert.accept();
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		simple_Alert();
		confrim_Alert();
	}

}
