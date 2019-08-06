package com.kambaa.govt_environment.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CZMPages extends TestBase {
	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[3]")
	WebElement coastral_zone_managementlink;
	@FindBy(xpath = " //body/div[@class='eco_header']/div[@class='container']/div[@class='row']/div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 padding_lr']/nav[@class='navbar navbar-inverse']/div[@id='main-nav']/ul[@class='nav navbar-nav my_menu']/li[@class='eco_pos_rel']/ul[@class='sub-menu my_menu1']/li[2]/a[1]")
	WebElement CZM;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//a[contains(text(),'GIS')]")
	WebElement GISlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu my_menu1']//li[@class='eco_pos_rel1']//ul[@class='sub-menu1']//li//a[contains(text(),'CDRRP')] ")
	WebElement GIS_CDRRP;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//a[contains(text(),'ICZMP phase II')]")
	WebElement ICZMPlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu my_menu1']//li[@class='eco_pos_rel1']//ul[@class='sub-menu1']//li//a[contains(text(),'Blue flag Beach programme')]  ")
	WebElement ICZMP_BLUEFLAGBEACHPROGRAMME;

	public CZMPages() {
		PageFactory.initElements(driver, this);
	}

	public void validateczplink() {
		coastral_zone_managementlink.click();
		driver.manage().timeouts()
				.implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		CZM.click();
	}

	public void validatecdrrplink() {
		coastral_zone_managementlink.click();
		GISlink.click();
		driver.manage().timeouts()
				.implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		GIS_CDRRP.click();
	}

	public void validateiczmplink() {
		coastral_zone_managementlink.click();
		ICZMPlink.click();
		driver.manage().timeouts()
				.implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		ICZMP_BLUEFLAGBEACHPROGRAMME.click();
	}
}
