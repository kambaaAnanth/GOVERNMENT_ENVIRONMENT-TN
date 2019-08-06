package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Climate_changePages extends TestBase {
	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[5]")
	WebElement climatechange;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'TNSAPCC')]")
	WebElement TNSAPCClink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'Climate Change Cell')]")
	WebElement climatechangecelllink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'NAFCC')]")
	WebElement NAFCClink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'GCF')]")
	WebElement GCFlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'NMSKCC')]")
	WebElement NMSKCClink;

	public Climate_changePages() {
		PageFactory.initElements(driver, this);
	}

	public void validateclimatechangelink() {
		climatechange.click();
	}

	public void validateTNSAPCClink() {
		TNSAPCClink.click();
	}

	public void validateCCClink() {
		climatechangecelllink.click();
	}

	public void validateNAFCClink() {
		NAFCClink.click();
	}

	public void validateGCFlink() {
		GCFlink.click();
	}

	public void validateNMSKCClink() {
		NMSKCClink.click();
	}
}
