package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
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
		;
	}

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_6b31gegj9g_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486452179346&hvpos=&hvnetw=g&hvrand=3058127923172550198&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061981&hvtargid=kwd-49491430&hydadcr=14454_2154375&gclid=CjwKCAjw2rmWBhB4EiwAiJ0mterA6IzfQ-Zcs0Oo8rInmc9mCietfTAiGcts76k8DkSgrhIHVxjBnRoCpTwQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement bestSell = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Best Sellers']"));
		action1(bestSell, driver);
		robot();
		String handle = driver.getWindowHandle();
		System.out.println("Current window id : " + handle);
		Set<String> set = driver.getWindowHandles();
		System.out.println("Parent and child id : " + set);
		for (String a : set) {
			if (a.equals(handle)) {
				continue;
			} else {
				WebDriver window = driver.switchTo().window(a);
				System.out.println("Title is : " + driver.getTitle());

			}
		}
	}

}
