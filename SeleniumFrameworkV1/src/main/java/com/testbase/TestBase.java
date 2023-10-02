package com.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties configprop;
	
	public TestBase() {
		//Reading Config File.
		try {
			configprop = new Properties();
		    FileInputStream readConfigLoc = new FileInputStream(
		    	"C:\\Users\\SARANNIA\\OneDrive\\Desktop\\main project\\SeleniumFrameworkV1\\src\\main\\java\\com\\config\\config");
		    configprop.load(readConfigLoc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch  (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Initializing web browser
	@SuppressWarnings("deprecation")
	public static void initialization() {
		String browserName = configprop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
	    }else if (browserName.equalsIgnoreCase("firefox")) {
	    	driver = new FirefoxDriver();
	    }
		
		driver.manage().window().maximize();
		driver.get(configprop.getProperty("URL"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	    }
		
	}


