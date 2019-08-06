package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.Other_ActivitiesPages;
import com.kambaa.govt_environment.Pages.TestBase;

public class Other_activitiesPageTest extends TestBase {
	Other_ActivitiesPages otheractivity;

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		otheractivity = new Other_ActivitiesPages();

	}

	@Test
	public void verifyOther_Activitieslink() {
		otheractivity.validateotheractivitieslink();
		System.out.println("The other activity link is clicked successfully");
	}
}
