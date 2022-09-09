package com.selenium.daily.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Relative_Xpath {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//div[@id='react-root']/section/main/div/div/div/div[2]/form/div/div/div/label/input"));
		a.sendKeys("Barath");
		WebElement v = driver.findElement(By.xpath("//input[@name='password']"));
		v.sendKeys("jdjd11");
		
}
}