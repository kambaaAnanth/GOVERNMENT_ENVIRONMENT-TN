package com.kambaa.govt_environment.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public Properties loadproperties() throws IOException {
		FileInputStream stream = new FileInputStream(
				"C:\\Users\\kavya\\Desktop\\TANHODA\\GOVERNMENT_ENVIRONMENT-TN\\src\\main\\java\\com\\kambaa\\govt_environment_configproperties\\config.properties");
		prop = new Properties();
		prop.load(stream);
		return prop;
	}

	public void initialize() throws IOException {
		loadproperties();
		String url = prop.getProperty("url");
		String location1 = prop.getProperty("chromelocation");
		String location2 = prop.getProperty("fflocation");
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.gecko.location", location1);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.location", location2);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts()
				.implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts()
				.pageLoadTimeout(Testutils.PAGELOADING_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
	}

}
