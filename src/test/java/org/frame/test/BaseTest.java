package org.frame.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.frame.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
Logger log;
	protected BaseTest() {

	}

	@BeforeMethod
	protected void setUp() throws Exception {
		Driver.initDriver();
		 log =Logger.getLogger("automationFramework");
		DOMConfigurator.configure("log4j.xml");
	}

	@AfterMethod()
	protected void tearDown() {
		Driver.quitDriver();
	}

}
