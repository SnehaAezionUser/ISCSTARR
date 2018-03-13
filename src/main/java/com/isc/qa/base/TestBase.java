package com.isc.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	static WebDriver driver;
	
	static Properties prop;
	
	// * Create constructor for Testbase class
	
	public TestBase(){
		
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\sneha\\workspace\\ISCStarrTest\\src\\main\\java\\com\\isc\\qa\\config\\config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
}
