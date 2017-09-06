package com.rightcomply.UIAutomation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.rightcomply.UIAutomation.util.*;
import com.rightcomply.UIAutomation.util.Xlreader;

/*
 * Home page
 * 
 * @author Renuga
 */
public class HomePage extends Page {
	

	static Xlreader read_xl;

	private final String imageright="//img[@alt='Right Comply']";
	private final String signup = "//a[@class='active']";
	private final String browserList = "photo";
	
	private final String emailtextid="email";
	private final String passwordtextid="password";
	private final String loginid="signIn";
	
	private final String homepageImage=".//img[@alt='Right Compl']";
	private final String forgotpass="Forgot Password?";
	private final String errorinvalidlogin="/html/body/div[1]/div/div/div[1]/p";
	
	@FindBy(how=How.LINK_TEXT,using=forgotpass)
	private WebElement forgotpasslink;
	
	@FindBy(how=How.XPATH,using=homepageImage)
	private WebElement homepageImagev;
	
	@FindBy(how=How.ID,using=emailtextid)
	//@CacheLookup
	private WebElement textBoxElement;
	
	@FindBy(how=How.ID,using=passwordtextid)
	private WebElement passwordtext;
	@FindBy(how=How.ID,using=loginid)
	private WebElement login;
	@FindBy(how=How.XPATH,using=signup)
	private WebElement signupbutton;
	
	
	@FindBy(how=How.XPATH,using=imageright)
	private WebElement imageRC;
	
	@FindBy(how=How.XPATH,using=errorinvalidlogin)
	private WebElement invaliderror;
	
		
	@FindBy(how=How.ID, using = browserList)
	@CacheLookup
	private WebElement browserElement;
	
	
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	
	public WebElement geterrormsg()
	{
		return invaliderror;
	}
	
	public WebElement getloginTextBox() {
		return textBoxElement;
	}
			
	public WebElement signup_button() {
		return signupbutton;
	}
	
	public WebElement getpasswordtext() {
		return passwordtext;
	}
	
	public WebElement getlogin() {
		return login;
	}
	
	public WebElement getBrowser(){
		return browserElement;
	}
	
	public WebElement getImage()
	{
		return imageRC;
	}
	
	public void getdata_send() throws IOException
	{
		String[][] getdata=Xlreader.read("C:/Data/rightcomply/login_vendor.xls", "Sheet1");
	    
	}
	public WebElement forgotpass()
	{
		return forgotpasslink;
	}
	

}
