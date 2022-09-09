package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Window_Handling {
	public static WebDriver driver;

	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void action1(WebElement f, WebDriver e) {
		Actions a = new Actions(e);
		a.contextClick(f).perform();
		a.contextClick(f).perform();
		a.contextClick(f).perform();
		a.contextClick(f).perform();
		a.contextClick(f).perform();
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_6b31gegj9g_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486452179346&hvpos=&hvnetw=g&hvrand=3058127923172550198&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061981&hvtargid=kwd-49491430&hydadcr=14454_2154375&gclid=CjwKCAjw2rmWBhB4EiwAiJ0mterA6IzfQ-Zcs0Oo8rInmc9mCietfTAiGcts76k8DkSgrhIHVxjBnRoCpTwQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement bestSells = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Best Sellers']"));
		WebElement mobiles = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Mobiles']"));
		WebElement fashions = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Fashion']"));
		WebElement books = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Books']"));
		WebElement elctronics = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()=' Electronics ']"));
		action1(bestSells, driver);
		robot();
		action1(mobiles, driver);
		robot();
		action1(fashions, driver);
		robot();
		action1(books, driver);
		robot();
		action1(elctronics, driver);
		robot();
		// switch the particular index window
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		String id = list.get(4);
		driver.switchTo().window(id);
		// switch the particular window which is given window titile
		// String title = "Mobile Phones: Buy New Mobiles Online at Best Prices in India
		// | Buy Cell Phones Online - Amazon.in";
//		for (String a : set) {
//			Thread.sleep(5000);
//			if (driver.switchTo().window(a).getTitle().equals(title)) {
//				Thread.sleep(5000);
//				WebElement findElement = driver.findElement(By.xpath("//a[text()='About Us']"));
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				Thread.sleep(5000);
//				js.executeScript("arguments[0].click()", findElement);
//				break;
//			} 
//		}

	}
}
