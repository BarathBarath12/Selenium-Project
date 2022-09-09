package com.selenium.daily.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();
		//child
		//WebElement email = driver.findElement(By.xpath("//div[@class='form-group']//child::input"));
		//email.sendKeys("barathsjeyfbjugw@998");
		//parent
		//WebElement email = driver.findElement(By.xpath("//input[@type='text']//parent::div"));
		//email.sendKeys("barathsjeyfbjugw@998");
		//ancestor
		//input[@type='text']//ancestor::form[@id='login_form' and @class='box']
		//following with absolute x path
		//h3[@class='page-subheading']//following::div[@class='form_content clearfix']/p
}
}

