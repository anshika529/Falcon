package com.atmecs.falconproject.testsuite;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.atmecs.falconproject.constant.FilePathConstants;


public class BaseTest {
	public static Properties properties;
	public static WebDriver driver;
	String baseUrl;
	String browser;

	@BeforeMethod
	public void invokeBrowser() {

	properties = PropertyReader.readProperties(FilePathConstants.TestData_file);

	baseUrl = properties.getProperty("url");
	browser = properties.getProperty("Browser");

	System.setProperty("webdriver.chrome.driver", FilePathConstants.Chrome_file );
	if (browser.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
	}

	driver.get(baseUrl);
	driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser() {
	driver.close();
	}
}
