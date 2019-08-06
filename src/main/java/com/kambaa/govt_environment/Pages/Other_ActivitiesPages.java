package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Other_ActivitiesPages extends TestBase {

	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[9]")
	WebElement otheractivitieslink;

	public Other_ActivitiesPages() {
		PageFactory.initElements(driver, this);
	}

	public void validateotheractivitieslink() {
		otheractivitieslink.click();
	}
}
