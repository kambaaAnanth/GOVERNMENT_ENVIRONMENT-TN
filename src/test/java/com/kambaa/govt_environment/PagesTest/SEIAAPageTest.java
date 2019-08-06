package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.*;

public class SEIAAPageTest extends TestBase {
	SEIAAPages seiaapage;

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		seiaapage = new SEIAAPages();
	}

	@Test
	public void verifyEnvironment_clearance() {
		seiaapage.validateSEIAAlink();
		seiaapage.validateEnvironment_clearancelink();
		System.out
				.println("The Environment_clearance link is clicked Successfully");
	}
}
