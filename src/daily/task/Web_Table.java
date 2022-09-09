package com.selenium.daily.task;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static WebDriver driver;

	public static void m1() {
		List<WebElement> count = driver.findElements(By.tagName("table"));
		System.out.println("Table count is : " + count.size());
		List<WebElement> age = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th"));
		int b = 0;
		for (int i = 0; i < age.size(); i++) {

			if (age.get(i).getText().equals("Age")) {
				b = i + 1;
				System.out.println(b);

			}
		}
		List<WebElement> age1 = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[" + b + "]"));
		for (int i = 0; i < age1.size(); i++) {

			String value = age1.get(i).getText();
			int a = Integer.parseInt(value);
			if (a >= 61) {
				System.out.println(age1.get(i).getText());
			}
		}
		List<WebElement> name = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th"));
		int value1 = 0;
		for (int j = 0; j < name.size(); j++) {
			if (name.get(j).getText().equals("Name")) {
				value1 = j + 1;
				System.out.println(value1);
				
			}
		}
		System.out.println("Afte we get age above 61 name");
		List<WebElement> name1 = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/th[" + value1 + "]"));
		for (int k = 0; k < name1.size(); k++) {
			String value2 = name1.get(k).getText();
			int value3 = Integer.parseInt(value2);
			if (value3 >= 61) {
				System.out.println(name1.get(k).getText());
			}
		}
	}

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		m1();

	}

}
