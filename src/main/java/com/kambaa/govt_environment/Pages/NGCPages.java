package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NGCPages extends TestBase {
	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[6]")
	WebElement NGClink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'NGC')]")
	WebElement NGC_Sublink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'ECO-Clubs')]")
	WebElement eco_clubslink;

	public NGCPages() {
		PageFactory.initElements(driver, this);
	}

	public void validateNGClink() {
		NGClink.click();
	}

	public void validateNGC_Sublink() {
		NGC_Sublink.click();
	}

	public void validateeco_clubslink() {
		eco_clubslink.click();
	}
}
