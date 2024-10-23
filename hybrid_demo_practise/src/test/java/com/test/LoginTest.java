package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import  org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.DashBoardPageCode;
import com.pages.LoginPageCode;
import com.pages.RegisterPageCode;

public class LoginTest extends BaseClass{
	
	
 
	  LoginPageCode lp = null;
	 
	@BeforeSuite
		public void configuration() throws Exception {
		 initialization();
		 reportIn();
		 lp = new LoginPageCode(driver);
		 
		 }
	 
	 @Test(priority = 1)
	 
	 public void loginTest1() {
		 lp.loginToApplication("kiran@gmail.com", "123456");
		 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	 }
	 
	 @Test(priority = 2)
		public void test02() {
			Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard1");
			
		}
	 @Test(priority = 3)
	 public void loginTest3() {
		 
		throw new SkipException("Skip Test Case");
		
	 }
	 
}