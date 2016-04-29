package com.sqa.mz.util.helpers;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class BasicAutomationTest {
	private String baseUrl = "http://google.com";
	private Properties devProps;
	private String devPropsLocation = "src/main/resources/dev.properties";
	private Properties sharedMapUI;
	private String sharedMapUILocation = "src/main/resources/shared-map-ui.properties";

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void loadProperties() {
		this.sharedMapUI = ConProperties.loadProperties(this.devPropsLocation);
		this.devProps = ConProperties.loadProperties(this.devPropsLocation);
	}

	@Test(priority = 1)
	public void setUpLogin() {
		WebDriver driver = new FirefoxDriver();
		driver.get(this.baseUrl);

	}

	@Test(dataProvider = "dp")
	public void test(Integer n, String s) {
		System.out.println("Test " + n);

	}

	// @Test(priority = 0)
	// public void testLogin() {
	// // Test Logining into EBay...
	// }
}