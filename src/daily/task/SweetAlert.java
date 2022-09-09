package com.selenium.daily.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://pixinvent.com/materialize-material-design-admin-template/html/ltr/vertical-modern-menu-template/extra-components-sweetalert.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.xpath("(//button[text()='Try Me!'])[1]"));
		a.click();

		WebElement b = driver.findElement(By.xpath("//button[text()='OK']"));
		System.out.println(a.getText());
		b.click();
		Thread.sleep(1000);
		WebElement d = driver.findElement(By.xpath("(//button[text()='Try Me!'])[4]"));
		d.click();
		WebElement f = driver.findElement(By.xpath("//button[text()='OK']"));
		System.out.println(f.getText());
		f.click();
		Thread.sleep(1000);
		WebElement d1 = driver.findElement(By.xpath("(//button[text()='Try Me!'])[6]"));
		d1.click();
		WebElement f1 = driver.findElement(By.xpath("//button[text()='OK']"));
		System.out.println(f1.getText());
		f1.click();
		Thread.sleep(1000);
		WebElement d2 = driver.findElement(By.xpath("(//button[text()='Try Me!'])[8]"));
		d2.click();
		WebElement f2 = driver.findElement(By.xpath("//button[text()='Yes, Delete It']"));
		System.out.println(f2.getText());
		f2.click();
		Thread.sleep(1000);
		WebElement d3 = driver.findElement(By.xpath("(//button[text()='Try Me!'])[9]"));
		d3.click();
		WebElement f3 = driver.findElement(By.xpath("//button[text()='No, Please!']"));
		System.out.println(f3.getText());
		f3.click();
		WebElement f11 = driver.findElement(By.xpath("//button[text()='OK']"));
		f11.click();
		Thread.sleep(3000);
		WebElement d4 = driver.findElement(By.xpath("(//button[text()='Try Me!'])[13]"));
		d4.click();
		WebElement f4 = driver.findElement(By.xpath("//input[@class='swal-content__input']"));
		f4.sendKeys("jegar");
		WebElement f7 = driver.findElement(By.xpath("//button[text()='OK']"));
		f7.click();
		WebElement f14 = driver.findElement(By.xpath("//button[text()='OK']"));
		f14.click();
		Thread.sleep(1000);
		WebElement d8 = driver.findElement(By.xpath("(//button[text()='Try Me!'])[14]"));
		d8.click();
		WebElement f8 = driver.findElement(By.xpath("//input[@class='swal-content__input']"));
		f8.sendKeys("22");
		WebElement f9 = driver.findElement(By.xpath("//button[text()='Search!']"));
		f9.click();
		Thread.sleep(5000);
		WebElement f12 = driver.findElement(By.xpath("//button[text()='OK']"));
		f12.click();
	}
}


