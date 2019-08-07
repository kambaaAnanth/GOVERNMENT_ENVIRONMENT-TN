package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.NGCPages;
import com.kambaa.govt_environment.Pages.TestBase;

public class NGCPageTest extends TestBase {

	NGCPages ngcpage;

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		ngcpage = new NGCPages();
	}

	@Test
	public void verifyNGC_Sublink() {
		ngcpage.validateNGClink();
		ngcpage.validateNGC_Sublink();
		System.out.println("The NGC_Sublink is clicked Successfully");
	}

	@Test
	public void verifyeco_clubslink() {
		ngcpage.validateNGClink();
		ngcpage.validateeco_clubslink();
		System.out.println("The eco_clubs link is clicked Successfully");
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
