package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ENVISPages extends TestBase {
	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[7]")
	WebElement ENVISlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'About ENVIS')]")
	WebElement About_ENVISlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'SoER')]")
	WebElement SOERlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'GSDP')]")
	WebElement GSDPlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'GRID')]")
	WebElement GRIDlink;

	public ENVISPages() {
		PageFactory.initElements(driver, this);
	}

	public void validateENVISLINK() {
		ENVISlink.click();
	}

	public void validateAbout_ENVISlink() {
		About_ENVISlink.click();
	}

	public void validateSOERlink() {
		SOERlink.click();
	}

	public void validateGSDPlink() {
		GSDPlink.click();
	}

	public void validateGRIDlink() {
		GRIDlink.click();
	}
}