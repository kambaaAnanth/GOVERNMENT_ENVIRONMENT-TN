package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.Aboutus;

import com.kambaa.govt_environment.Pages.TestBase;

public class AboutuslinkpageTest extends TestBase {
	 Aboutus about;
		@BeforeMethod
		 public void setup() throws IOException{
			initialize();
		about=new Aboutus();
		}		
	@Test
	public void verifyDOElink(){
		about.validateDOElink();
		System.out.println("The DOE Link clicked Successfully");
	}
	@Test
	public void verifylimk2(){
		about.validatelink2();
		System.out.println("The Master&secretary link clicked Successfully");
	}
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}
