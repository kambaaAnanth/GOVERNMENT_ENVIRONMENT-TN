package com.kambaa.govt_environment.Pages;

import org.openqa.selenium.interactions.Actions;

public class Testutils extends TestBase{
	public	static Long IMPLICIT_WAIT=100L;
	 public static Long PAGELOADING_WAIT=500L;	
	 public static Actions action;
	 
	 public void action(){
	     action=new Actions(driver);
		 
	 }
	 }

