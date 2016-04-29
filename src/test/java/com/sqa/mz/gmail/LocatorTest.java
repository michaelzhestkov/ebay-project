package com.sqa.mz.gmail;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;
import org.testng.annotations.*;

import com.sqa.mz.util.helpers.*;

public class LocatorTest {

	private static String baseUrl;

	static WebDriver driver;

	@BeforeClass
	public static void setUpFirefox() throws Exception {
		driver = new FirefoxDriver();

	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();

	}

	@Test(priority = 1)
	public void test1() {
		String pageTitle = "MSN.com - Hotmail, Outlook, Skype, Bing, Latest News, Photos & Videos";
		driver.get("https://msn.com/");
		Assert.assertEquals(driver.getTitle(), pageTitle, "Page load was not successful");

	}

	@Test(priority = 2)
	public void test2() {
		List<WebElement> links = Locator.getLinks(this.driver);

		int i = 1;
		for (WebElement link : links) {
			String text = link.getText();
			if (text.isEmpty()) {
				text = "Non text element (" + i + " )";
				i++;
			}
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
	}

}
