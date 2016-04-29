/**
 *   File Name: Locator.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 21, 2016
 *
 */

package com.sqa.mz.util.helpers;

import java.util.*;

import org.openqa.selenium.*;

public class Locator {

	public static List<WebElement> getByTagName(WebDriver driver, String tagName) {

		return driver.findElements(By.tagName(tagName));
	}

	public static List<WebElement> getCSS(WebDriver driver, String cssSelector) {
		return null;
	}

	public static List<WebElement> getLinks(WebDriver driver) {
		return getByTagName(driver, "a");
	}

	public static List<WebElement> getPictures(WebDriver driver) {
		return getByTagName(driver, "img");
	}

	public static List<WebElement> getTextElements(WebDriver driver, String text) {
		return null;
	}

}
