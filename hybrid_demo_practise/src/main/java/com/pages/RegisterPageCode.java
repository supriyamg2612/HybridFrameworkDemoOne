package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageCode {

	 WebDriver driver = null;
	
	public RegisterPageCode(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name")
	WebElement username;
	
	@FindBy(id = "mobile")
	WebElement mobilenumber;
	
	@FindBy(id = "email")
	WebElement emailId;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//button")
	WebElement SignUpBtn;
	
	@FindBy(xpath= "//a[text()='I already have a membership']")
	WebElement alreaydMembership;
	
	public void registerationToApplication(String uname, String mob  , String email, String pass) {
		username.sendKeys(uname);
		mobilenumber.sendKeys(mob);
		emailId.sendKeys(email);
		password.sendKeys(pass);
		SignUpBtn.click();
	}
	
	public void navigateToLoginPage() {
		alreaydMembership.click();		
	}
}
