package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.*;

public class Climate_ChangePagesTest extends TestBase {
	Climate_changePages climatechange;

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		climatechange = new Climate_changePages();
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

	@Test
	public void verifyTNSAPCClink() {
		climatechange.validateclimatechangelink();
		climatechange.validateTNSAPCClink();
		System.out.println("The TNSAPCC link is clicked successfully ");
	}

	@Test
	public void verifyclimatechangecelllink() {
		climatechange.validateclimatechangelink();
		climatechange.validateCCClink();
		System.out
				.println("The Climate Change Cell link is clicked successfully ");
	}

	@Test
	public void verifyNAFCClink() {
		climatechange.validateclimatechangelink();
		climatechange.validateNAFCClink();
		System.out.println("The NAFCC link is clicked successfully ");
	}

	@Test
	public void verifyGCFlink() {
		climatechange.validateclimatechangelink();
		climatechange.validateGCFlink();
		System.out.println("The GCF link is clicked successfully ");
	}

	@Test
	public void verifyNMSKCClink() {
		climatechange.validateclimatechangelink();
		climatechange.validateNMSKCClink();
		System.out.println("The NMSKCC link is clicked successfully ");
	}
}
