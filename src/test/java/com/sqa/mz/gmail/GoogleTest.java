
package com.sqa.mz.gmail;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;
import org.testng.annotations.*;

public class GoogleTest {
	static WebDriver driver;

	@Test
	public static void searchTest() throws InterruptedException {
		String sfgExpected = "Official San Francisco Giants Website | MLB.com";
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#gs_htif0")).sendKeys("San Francisco Giants");
		Thread.sleep(2000);
		String sfgActual = driver
				.findElement(By.cssSelector("div.g h3.r a[href='http://sanfrancisco.giants.mlb.com/']")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(sfgActual, sfgExpected);
		// driver.findElement(By.xpath("//div[@id='rso']/div[4]/div[1]/div/h3/a")).getText();

	}

	@BeforeClass(alwaysRun = true)
	public static void setUpFirefox() throws InterruptedException {

		driver = new FirefoxDriver();
		String baseURL = "http://google.com/";

		driver.get(baseURL);

	}

	@AfterClass(alwaysRun = true)
	public static void tearDown() {
		driver.quit();
		System.out.println("quit is done");

	}
}
