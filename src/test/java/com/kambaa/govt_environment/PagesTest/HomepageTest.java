package com.kambaa.govt_environment.PagesTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kambaa.govt_environment.Pages.Aboutus;
import com.kambaa.govt_environment.Pages.Homepage;
import com.kambaa.govt_environment.Pages.TestBase;

public class HomepageTest extends TestBase{
	Homepage homepage;
	@BeforeMethod
	 public void setup() throws IOException{
		initialize();
	 homepage=new Homepage();
	
	}
	@AfterMethod
	public void teardown(){
		driver.close();
	}
	@Test
	public void verifytitle(){
		String actulatitle=homepage.validatetitle();
		Assert.assertEquals(actulatitle, "Government of Tamil Nadu - Department of Environment", "Expected and Actual title are same");
	}
	@Test
	public void verifylogo(){
		boolean flag=homepage.validatelogo();
		Assert.assertTrue(flag);
	}
	@Test
	public void homelinkclicktest(){
		 homepage.homelinkclicktest();
		
	}

}
