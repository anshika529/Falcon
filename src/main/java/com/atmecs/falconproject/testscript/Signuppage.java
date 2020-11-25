package com.atmecs.falconproject.testscript;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.atmecs.falconproject.constant.FilePathConstants;
import com.atmecs.falconproject.runner.ElementHelpers;
import com.atmecs.falconproject.testsuite.PropertyReader;



public class Signuppage {
	Properties Loc_path;
	Properties Data_path;

	public void signupactions() {
		Loc_path = PropertyReader.readProperties(FilePathConstants.Locator_file);
		Data_path = PropertyReader.readProperties(FilePathConstants.TestData_file);
		WebDriver driver = null;
		ElementHelpers.clickElement(driver, Loc_path.getProperty("Signup"));
		ElementHelpers.sendkeys(driver, Loc_path.getProperty("SignupUsername"),
				Data_path.getProperty("SignupUsername"));
		ElementHelpers.sendkeys(driver, Loc_path.getProperty("SignupPassword"),
				Data_path.getProperty("SignupPassword"));
		ElementHelpers.clickElement(driver, Loc_path.getProperty("SignupButton"));
	}
}
