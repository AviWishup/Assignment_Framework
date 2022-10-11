package org.frame.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private DriverManager(){
		
	}
	
	private static ThreadLocal <WebDriver> dr = new ThreadLocal<>();
	
	public static synchronized WebDriver getDriver() {
		return dr.get();
	}
	
	public static synchronized void setDriver(WebDriver driver) {
		dr.set(driver);
	}
	
	public static void unload() {
		dr.remove();
	}
}
