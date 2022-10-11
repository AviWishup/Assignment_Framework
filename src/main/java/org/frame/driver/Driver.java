package org.frame.driver;

import java.util.Objects;

import org.frame.constants.FrameConstants;
import org.frame.enums.PropertyEnums;
import org.frame.utils.ReadProperties;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {

	private Driver() {
		
	}
	
	public static void initDriver() throws Exception {
		if(Objects.isNull(DriverManager.getDriver())) {
		System.setProperty("webdriver.chrome.driver", FrameConstants.getDriverPath());
		DriverManager.setDriver(new ChromeDriver());
		DriverManager.getDriver().get(ReadProperties.get(PropertyEnums.URL));
		
		}
	}
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())){
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
}
}