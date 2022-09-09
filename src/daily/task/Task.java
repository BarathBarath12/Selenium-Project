package com.selenium.daily.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		String a = driver.getTitle();
		System.out.println("Title is : " + a);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();

	}

}
