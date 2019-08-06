package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SEIAAPages extends TestBase {
	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[8]")
	WebElement SEIAAlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'Environment and Clearance')]")
	WebElement Environment_clearance;

	public SEIAAPages() {
		PageFactory.initElements(driver, this);
	}

	public void validateSEIAAlink() {
		SEIAAlink.click();
	}

	public void validateEnvironment_clearancelink() {
		Environment_clearance.click();
	}
}
