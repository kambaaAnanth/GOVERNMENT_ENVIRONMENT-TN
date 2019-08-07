package com.kambaa.govt_environment.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Publication_Pages extends TestBase {
	@FindBy(xpath = "//*[@class='nav navbar-nav my_menu']/li[10]")
	WebElement publicationlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'Reports')]")
	WebElement reportslink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'Poster')]")
	WebElement posterlink;
	@FindBy(xpath = "//ul[@class='nav navbar-nav my_menu']//li[@class='eco_pos_rel']//ul[@class='sub-menu']//li//a[contains(text(),'Books')]")
	WebElement bookslink;

	public Publication_Pages() {
		PageFactory.initElements(driver, this);
	}

	

	public void validatereportslink() {
		try{
		Testutils.action.moveToElement(publicationlink).build().perform();
		Testutils.action.clickAndHold(reportslink).build().perform();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
	}

	public void validateposterlink() {
		try{
		Testutils.action.moveToElement(publicationlink).build().perform();
		Testutils.action.clickAndHold(reportslink).build().perform();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}

	public void validatebookslink() {
		try{
		Testutils.action.moveToElement(publicationlink).build().perform();
		Testutils.action.clickAndHold(reportslink).build().perform();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}
}
