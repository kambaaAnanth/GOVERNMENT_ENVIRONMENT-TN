package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMATPages extends TestBase {
@FindBy(xpath="//*[@class='nav navbar-nav my_menu']/li[4]")
WebElement EMATlink;
@FindBy(xpath="//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'EMAT')]")
WebElement EMATlink1;
@FindBy(xpath="//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'EPRED')]")
WebElement EPREDLINK;
@FindBy(xpath="//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'NRCP & NLCP')]")
WebElement NRCPNLCPLINK;
@FindBy(xpath="//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'Eco-restoration')]")
WebElement ECORESTORATION;

public EMATPages(){
	PageFactory.initElements(driver, this);
}
public void valideEMATLink1(){
	EMATlink.click();
	EMATlink1.click();
}
public void validateEPREDlink(){
	EMATlink.click();
	EPREDLINK.click();
}
public void validateNRCP_NLCPLink(){
	EMATlink.click();
	NRCPNLCPLINK.click();
}
public void validateECORESTORATIONlink(){
	EMATlink.click();
	ECORESTORATION.click();
}
}
