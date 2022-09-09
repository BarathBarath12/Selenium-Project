package com.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prompt_Alert {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		driver.get("https://degges2.rssing.com/chan-11176716/latest.php");
		Thread.sleep(2000);
	}

}
