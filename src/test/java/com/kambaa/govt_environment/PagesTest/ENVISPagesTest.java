package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.kambaa.govt_environment.Pages.*;

public class ENVISPagesTest extends TestBase {
	ENVISPages envispage;

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		envispage = new ENVISPages();
	}

	public void verifyAbout_ENVISlink() {
		envispage.validateENVISLINK();
		envispage.validateAbout_ENVISlink();
		System.out.println("The About_ENVIS is clicked Successfully");
	}

	public void verifySOERlink() {
		envispage.validateENVISLINK();
		envispage.validateSOERlink();
		System.out.println("The verifySOER is clicked Successfully");
	}

	public void verifyGSDPlink() {
		envispage.validateENVISLINK();
		envispage.validateGSDPlink();
		System.out.println("The GSDP is clicked Successfully");
	}

	public void verifyGRIDlink() {
		envispage.validateENVISLINK();
		envispage.validateGRIDlink();
		System.out.println("The GRID is clicked Successfully");
	}
}
