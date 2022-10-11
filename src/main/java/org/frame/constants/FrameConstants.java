package org.frame.constants;

public class FrameConstants {

	private FrameConstants() {
		
	}
	
	private static String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static String DRIVERPATH = RESOURCESPATH+"/driver/chromedriver.exe";
	//private static String CONFIGFILEPATH = RESOURCESPATH+"/configuration/config.properties";
	private static String CONFIGFILEPATH = RESOURCESPATH+"/configuration/makeMyTrip.properties";
	private static int EXPLICITWAITTIME = 10;
	
	public static  int getExplicitTime() {
		return EXPLICITWAITTIME;
	}
	
	public static String getDriverPath()
	{
		return DRIVERPATH;
	}
	
	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
	
	
}
