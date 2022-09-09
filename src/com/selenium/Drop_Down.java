package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement d = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s = new Select(d);
		boolean a = s.isMultiple();
		System.out.println("Drop down is single or not : " + a);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("2");
		Thread.sleep(2000);
		s.selectByVisibleText("Pine Apple");
		WebElement firstSelect = s.getFirstSelectedOption();
		System.out.println("First selected option : " + firstSelect.getText());
		List<WebElement> allOptions = s.getOptions();
		System.out.println("Size is : " + allOptions.size());
		int index = allOptions.size() - 1;
		System.out.println("Index is : " + index);
		System.out.println("After for loop is :");
		for (int i = 0; i <= allOptions.size() - 1; i++) {
			System.out.println(allOptions.get(i).getText());
		}
		System.out.println("After for each loop is :");
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());
		}
		System.out.println("Double drop down is below");
		WebElement multiple = driver.findElement(By.xpath("//select[@id = 'superheros']"));
		Select s1 = new Select(multiple);
		if (s1.isMultiple()) {
			List<WebElement> d1 = s1.getOptions();
			System.out.println("Size is : " + d1.size());
			for (int i = 0; i < d1.size(); i++) {
			
				if (d1.get(i).getText().equals("The Avengers") 
						|| d1.get(i).getText().equals("Batwoman")) {
					String text = d1.get(i).getText();
					System.out.println(text);
				}

			}

		}
	}
}
