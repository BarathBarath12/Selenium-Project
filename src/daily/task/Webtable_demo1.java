package com.selenium.daily.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_demo1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		WebElement partData = driver.findElement(By.xpath("//table[@id='table02']/tbody/tr[2]/td[3]"));
		System.out.println("particual data: " + partData.getText());
		System.out.println("Single row");
		List<WebElement> partRow = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[3]/td"));
		for (int i = 0; i < partRow.size(); i++) {
			System.out.println(partRow.get(i).getText());

		}
		System.out.println("Single coloumn");
		List<WebElement> partColoumn = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[3]"));
		for (int i = 0; i < partColoumn.size(); i++) {
			System.out.println(partColoumn.get(i).getText());

		}
		System.out.println("Entrie data");
		List<WebElement> entireData = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
		for (int i = 0; i < entireData.size(); i++) {
			System.out.println(entireData.get(i).getText());

		}
		System.out.println("Pariclar data for header");
		WebElement headerPartData = driver.findElement(By.xpath("//table[@id='table02']/thead/tr/th[3]"));
		System.out.println("particual data: " + headerPartData.getText());
		System.out.println("All data in headers");
		List<WebElement> allDataHeaders = driver.findElements(By.xpath("//table[@id='table02']/thead/tr/th"));
		for (int i = 0; i < allDataHeaders.size(); i++) {
			System.out.println(allDataHeaders.get(i).getText());

		}

	}
}
