package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.ENVISPages;
import com.kambaa.govt_environment.Pages.TestBase;

public class ENVISPagesTest extends TestBase {
	ENVISPages envispage;

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		envispage = new ENVISPages();
	}

	@Test
	public void verifyAbout_ENVISlink() {
		envispage.validateENVISLINK();
		envispage.validateAbout_ENVISlink();
		System.out.println("The About_ENVIS is clicked Successfully");
	}

	@Test
	public void verifySOERlink() {
		envispage.validateENVISLINK();
		envispage.validateSOERlink();
		System.out.println("The verifySOER is clicked Successfully");
	}

	@Test
	public void verifyGSDPlink() {
		envispage.validateENVISLINK();
		envispage.validateGSDPlink();
		System.out.println("The GSDP is clicked Successfully");
	}

	@Test
	public void verifyGRIDlink() {
		envispage.validateENVISLINK();
		envispage.validateGRIDlink();
		System.out.println("The GRID is clicked Successfully");
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}