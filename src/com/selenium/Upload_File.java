package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/rio/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement resume = driver.findElement(By.xpath("//a[@title='Click to upload your resume']"));
		resume.click();
		WebElement uploadResume = driver
				.findElement(By.xpath("//div[@class='uploadResume pr tc']/child::input[@type='file']"));
		uploadResume.sendKeys("C:\\Users\\barat\\Resume.Barath.docx");
	}
}