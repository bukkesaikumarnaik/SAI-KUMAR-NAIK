package com.example;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

	WebDriver driver;

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\naiks\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

	}

	public void searchProduct() throws InterruptedException {

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("JBL Speakers");

		driver.findElement(By.cssSelector("#gh-btn")).click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#gh-p-1 > a")).click();

		System.out.println("The title of the page is :" + driver.getTitle());

	}

	public void navigate() throws InterruptedException {

		Thread.sleep(2000);

		driver.navigate().to("https://www.simplilearn.com/");

		Thread.sleep(2000);

		driver.navigate().back();

	}

	public void closeBrowser() {

		driver.quit();

	}

	@Test
	public void f() {

		FirstSeleniumTest obj = new FirstSeleniumTest();
		try {
			obj.launchBrowser();

			obj.searchProduct();

			obj.navigate();

			obj.closeBrowser();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}