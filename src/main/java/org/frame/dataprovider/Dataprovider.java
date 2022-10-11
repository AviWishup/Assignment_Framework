package org.frame.dataprovider;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name="LogIn_data")
	public static String[][] getData(){

		return new String[][] {

			{"monika.jadhav@wishup.co","wishup123"},
			{"avinash@gmail.com","wrongpassword@123"}
		};	
	}
	@DataProvider(name="Test_data")
	public static Object[][] getData1(){

			return new Object[][] {

				{"monika.jadhav@wishup.co","wishup123"},
			};
	}
}
