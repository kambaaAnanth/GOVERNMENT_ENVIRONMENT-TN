package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.CZMPages;
import com.kambaa.govt_environment.Pages.TestBase;

public class CZMPageTest extends TestBase {
	CZMPages czm;

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		czm = new CZMPages();
	}

	@Test
	public void verifyCZMlink() {
		czm.validateczplink();
		System.out.println("The CZM Link is clicked successfully");
	}
    @Test
    public void verifyGISlink(){
    	czm.validateGISlink();
    	System.out.println("The GIS Link is clicked successfully");
    }
	@Test
	public void verifyCDRRPlink() {
		czm.validatecdrrplink();
		System.out.println("The CDRRP Link is clicked successfully");
	}

	@Test
	public void verifyICZMPlink() {
		czm.validateICZMPlink();
		System.out.println("The ICZMP Link is clicked successfully");
	}
    @Test
    public void verifyBLUEFLAGBEACHPROGRAMMElink(){
    	czm.validateBLUEFLAGBEACHPROGRAMMElink();
    	System.out.println("The BLUEFLAGBEACHPROGRAMME Link is clicked successfully");
    }
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}