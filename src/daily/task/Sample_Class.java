package com.selenium.daily.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Class {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement a = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook ')]"));
		System.out.println(a.getText());
		String d = "1283883";
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("" + Integer.parseInt(d));
		WebElement f =driver.findElement(By.xpath("//input[@type='password']"));
		f.sendKeys("barath33");
		System.out.println(f.getAttribute("value"));
		WebElement b = driver.findElement(By.xpath("//a[.='Create a Page']"));
		System.out.println(b.getText());
		
	}

}
