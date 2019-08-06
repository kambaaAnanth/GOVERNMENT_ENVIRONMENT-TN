package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.Publication_Pages;
import com.kambaa.govt_environment.Pages.TestBase;

public class PublicationPageTest extends TestBase {
	Publication_Pages publication;

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		publication = new Publication_Pages();
	}

	@Test
	public void verifyreportslink() {
		publication.validatepublicationlink();
		publication.validatereportslink();
		System.out.println("The Reports link is clicked successfully");
	}

	@Test
	public void verifyposterlink() {
		publication.validatepublicationlink();
		publication.validateposterlink();
		System.out.println("The poster link is clicked successfully");
	}

	@Test
	public void verifybookslink() {
		publication.validatepublicationlink();
		publication.validatebookslink();
		System.out.println("The books link is clicked successfully");
	}
}
