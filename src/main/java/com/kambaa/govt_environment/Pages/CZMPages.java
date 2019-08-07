package com.kambaa.govt_environment.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CZMPages extends TestBase {
	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[3]")
	WebElement coastral_zone_managementlink;
	@FindBy(xpath ="//*[@class='sub-menu my_menu1']//li[1]")
	WebElement CZM;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//a[contains(text(),'GIS')]")
	WebElement GISlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu my_menu1']//li[@class='eco_pos_rel1']//ul[@class='sub-menu1']//li//a[contains(text(),'CDRRP')]")
	WebElement GIS_CDRRP;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//a[contains(text(),'ICZMP phase II')]")
	WebElement ICZMPlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu my_menu1']//li[@class='eco_pos_rel1']//ul[@class='sub-menu1']//li//a[contains(text(),'Blue flag Beach programme')]")
	WebElement ICZMP_BLUEFLAGBEACHPROGRAMME;

	public CZMPages() {
		PageFactory.initElements(driver, this);
	}
     public void validatecoastral_zone_managementlink(){
    	 coastral_zone_managementlink.click();
     }
   public void validateczplink() {
		coastral_zone_managementlink.click();
		CZM.click();
	}
	public void validateGISlink(){
		coastral_zone_managementlink.click();
		GISlink.click();
	}

	public void validatecdrrplink() {
		coastral_zone_managementlink.click();
		driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		try{
		Testutils.action.moveToElement(GISlink).build().perform();
		Testutils.wait.until(ExpectedConditions.presenceOfElementLocated((By) GIS_CDRRP));
		Testutils.action.click(GIS_CDRRP).build().perform();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}
   public void validateICZMPlink(){
	   coastral_zone_managementlink.click();
	   ICZMPlink.click();
   }   
	public void validateBLUEFLAGBEACHPROGRAMMElink() {
		coastral_zone_managementlink.click();
		driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		try{
		Testutils.action.moveToElement(ICZMPlink).build().perform();
		Testutils.wait.until(ExpectedConditions.presenceOfElementLocated((By) ICZMP_BLUEFLAGBEACHPROGRAMME));
		Testutils.action.click(ICZMP_BLUEFLAGBEACHPROGRAMME).build().perform();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}
}
