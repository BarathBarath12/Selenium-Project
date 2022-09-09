package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Program {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		//WebElement s = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		//s.sendKeys("Barath");
		//WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		//pass.sendKeys("Barath@2");
		WebElement d = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
		System.out.println(d.getText());
		d.click();
		WebElement index1 = driver.findElement(By.xpath("(//a[contains(text(),'Sign')])[1]"));
		index1.getText();
		index1.click();
		
	//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	//login.click();
	
		
}
}