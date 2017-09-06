package com.rightcomply.UIAutomation.pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

	HomePage homepage;
	SelectCompliance selectcomp;
	
	
	@BeforeClass
	public void testInit() {

		// Load the page in the browser
		webDriver.get(websiteUrl);
		homepage = PageFactory.initElements(webDriver, HomePage.class);
		selectcomp=PageFactory.initElements(webDriver, SelectCompliance.class);
	}

	@Test(description="To Verify Home page title",priority=1)
	public void verifyHomepageTitle() throws InterruptedException {
		Assert.assertTrue(homepage.getTitle().trim().equals("Right Comply"));
		System.out.println("Home page title is:  "+homepage.getTitle());
	}
	
	@Test(description="To Verify Rightcomply Image",priority=2)
	public void testImage() throws InterruptedException
	{
		//To locate rightcomply image and verify it.
		
		homepage.getImage().isDisplayed();
		System.out.println("Home page image is displayed.");
	}
	
	
	
	@Test(description="To verify Valid Login",priority=3)
	public void test_login() throws InterruptedException
	{
		homepage.getloginTextBox().sendKeys("rcvendor@berijam.com");
		homepage.getpasswordtext().sendKeys("welcome123");
		homepage.getlogin().click();
		Thread.sleep(5000);
		Assert.assertTrue(selectcomp.posthiringCompliance().isDisplayed());
		selectcomp.prehiringCompliance().isDisplayed();
		System.out.println("Login sucessfull");
		
	}
	
	
	
	

	
	
	
}
