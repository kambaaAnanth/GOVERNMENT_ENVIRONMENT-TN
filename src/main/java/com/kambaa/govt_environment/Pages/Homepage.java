package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends TestBase {
	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[1]")
	WebElement homelink;
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement imagelogo;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public String validatetitle() {
		return driver.getTitle();
	}

	public boolean validatelogo() {
		return imagelogo.isDisplayed();
	}

	public void homelinkclicktest() {
		homelink.click();
	}
}
