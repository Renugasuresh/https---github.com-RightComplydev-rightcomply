package com.rightcomply.UIAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectCompliance extends Page{

	public SelectCompliance(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	private final String prehiringcompliance="//a[@href='http://pre.rightcomply.com/resumeparse/prehiring']";
	
	private final String posthiringcompliance= "//a[@href='http://pre.rightcomply.com/login/posthiring']";
	
	
	@FindBy(how=How.XPATH,using=prehiringcompliance)
	private WebElement prehiring;
	
	@FindBy(how=How.XPATH,using=posthiringcompliance)
	private WebElement posthiring;
	
	public WebElement prehiringCompliance() {
		return prehiring;
	}
	public WebElement posthiringCompliance() {
		return posthiring;
	}
	
	
	
}
