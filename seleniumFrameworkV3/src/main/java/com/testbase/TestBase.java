
package com.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver; //create an 
	public static Properties configProp;
	
	public TestBase() {
		//Reading config file
		try {
			configProp=new Properties();
			FileInputStream readConfigLoc=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\finalproject\\seleniumFrameworkV3\\src\\main\\java\\com\\config\\config");
			configProp.load(readConfigLoc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Initializing web browser
	@SuppressWarnings("deprecation")
	public static void initialization()  {
		String browserName=configProp.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(configProp.getProperty("URL"));
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
	}
}

