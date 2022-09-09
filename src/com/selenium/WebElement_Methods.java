package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// WebElement forgot = driver.findElement(By.partialLinkText("password?"));
		// forgot.click();

		WebElement email = driver.findElement(By.id("email"));
		System.out.println("email is : " + email.isDisplayed());
		email.sendKeys("barathsmart992@gmail.com");
		 WebElement password = driver.findElement(By.id("pass"));
		 password.sendKeys("Barath98");
		 System.out.println(password.isDisplayed());
		 WebElement login = driver.findElement(By.name("login"));
		 System.out.println(login.isDisplayed());
		 login.click();

	}
}
