package com.atmecs.falconproject.constant;

import java.io.File;

public class FilePathConstants {
	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;

	public final static String RESOURCES_HOME = USER_HOME + "src" + File.separator + "main" + File.separator
			+ "resources" + File.separator;

	public final static String LOCATOR_HOME = RESOURCES_HOME + "locators" + File.separator;
	public final static String ATMECS_HOME = LOCATOR_HOME + "atmecs" + File.separator;

	public final static String LIB_HOME = USER_HOME + "lib" + File.separator;

	public final static String HOME_LOCATOR_PATH = ATMECS_HOME
			+ "HomeAtmecsIncDigitalSolutionsProductEngineeringServices.properties";
	// chrome path
	public static final String Chrome_file = "./lib/chromedriver.exe";
	// TestData File
		public static final String TestData_file = "./src/main/resources/TestData/TestData.properties";

		// Locator File
		public static final String Locator_file = "./src/main/resources/Locators/Locators.properties";
		

}
