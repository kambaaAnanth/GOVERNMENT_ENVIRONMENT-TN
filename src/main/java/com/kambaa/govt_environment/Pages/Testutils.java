package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testutils extends TestBase {
	public static Long IMPLICIT_WAIT = 100L;
	public static Long PAGELOADING_WAIT = 500L;
	public static Actions action;
    public static  WebDriverWait wait;
	public void action() {
		action = new Actions(driver);

	}
	public void webdriverwait(){
		 wait = new WebDriverWait(driver,10);
	}
}
