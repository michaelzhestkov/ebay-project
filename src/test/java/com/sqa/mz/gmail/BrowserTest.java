package com.sqa.mz.gmail;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class BrowserTest {

	@Test
	public static void safariTest() throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://www.imdb.com/";

		driver.get(baseURL);
		Thread.sleep(3000);

		driver.quit();
		System.out.println("quit is done");
	}
}