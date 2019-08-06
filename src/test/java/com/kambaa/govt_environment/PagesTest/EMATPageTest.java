package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.*;

public class EMATPageTest extends TestBase {
	EMATPages EMATpage;

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		EMATpage = new EMATPages();
	}

	@Test
	public void verifyEMATlink1() {
		EMATpage.valideEMATLink1();
		System.out.println("The EMAT link clicked Suceessfully");
	}

	@Test
	public void verifyEPREDlink() {
		EMATpage.validateEPREDlink();
		System.out.println("The EPRED link clicked Suceessfully");
	}

	@Test
	public void verifyNLCPANDNRCPlink() {
		EMATpage.validateNRCP_NLCPLink();
		System.out.println("The NLCP&NRCP link clicked Suceessfully");
	}

	@Test
	public void verifyECORESTORATIONlink() {
		EMATpage.validateECORESTORATIONlink();
		System.out.println("The ECO-RESTORATION link clicked Suceessfully");
	}
	@AfterMethod
	public void teardown() {
		driver.close();
}
}