package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver jdriver;
	
	public LandingPage(WebDriver rdriver){
		jdriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}

	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
}
