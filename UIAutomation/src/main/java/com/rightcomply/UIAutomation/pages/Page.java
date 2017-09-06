package com.rightcomply.UIAutomation.pages;

import org.openqa.selenium.WebDriver;

/*
 *  Page object pattern
 * 
 * @author Renuga
 */
public abstract class Page {

	protected WebDriver webDriver;

	/*
	 * Constructor 
	 * 
	 * @param webDriver
	 */
	public Page(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public String getTitle() {
		return webDriver.getTitle();
	}

}
