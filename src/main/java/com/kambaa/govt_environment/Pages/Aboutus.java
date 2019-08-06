package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aboutus extends TestBase {

	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[2]")
	WebElement Aboutuslink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'DoE')] ")
	WebElement submodule1;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'Minister and Secretary')] ")
	WebElement submodule2;

	public Aboutus() {
		PageFactory.initElements(driver, this);
	}

	public void validateDOElink() {
		Aboutuslink.click();
		submodule1.click();

	}

	public void validatelink2() {
		Aboutuslink.click();
		submodule2.click();
	}
}
