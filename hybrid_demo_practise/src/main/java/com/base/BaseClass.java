package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.PropertyUtility;


public class BaseClass {
	
	public static WebDriver driver = null;
	
	public static ExtentReports report = null;
	public static ExtentSparkReporter spark = null;
	public static ExtentTest test = null;
	
		Logger log = Logger.getLogger(BaseClass.class);
		
	public void initialization() throws Exception {
		
		log.info("Reading property file for browser");
		String browserName = PropertyUtility.readProperty("browser");
		//reading browser name 
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ameyaathale/Documents/Selenium_Automation_Workspace/chromedriver-mac-x64/chromedriver");
		driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/ameyaathale/Documents/Selenium_Automation_Workspace/geckodriver-mac-x64/chromedriver");
		driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(PropertyUtility.readProperty("url"));
	}
	
	public void reportIn() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/Extentreports.html");
		report.attachReporter(spark);
	}

}