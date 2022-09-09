package com.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> atag = driver.findElements(By.tagName("a"));
		System.out.println("Total a tag is : " + atag.size());
		for (WebElement a : atag) {
			String value = a.getAttribute("href");
			// System.out.println(value);
			if (value==null || value.isEmpty()) {
				continue;

			}
			URL ab = new URL(value);
			URLConnection ab1 = ab.openConnection();
			HttpURLConnection a1 = (HttpURLConnection) ab1;
			a1.connect();
			int responseCode = a1.getResponseCode();
			String responseMessage = a1.getResponseMessage();
			if (responseCode >= 400) {
				System.out.println(
						"value : " + value + " Response code : " + responseCode + " Message : " + responseMessage);
			}
			a1.disconnect();
		}
	}
}
