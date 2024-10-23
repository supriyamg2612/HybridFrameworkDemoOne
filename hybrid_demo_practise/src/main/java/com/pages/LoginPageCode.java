package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageCode {
	
	
	 WebDriver driver = null;
	
	public LoginPageCode(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy (id = "email")
		WebElement username;
		
		@FindBy(id = "password")
		WebElement password;
		
		@FindBy(xpath="//button")
		WebElement loginButton;
		
		@FindBy(xpath="//a[text()='Register a new membership']")
		WebElement registerPageLink;
	
		public void loginToApplication(String uname, String pass) {
			username.sendKeys(uname);
			password.sendKeys(pass);
			loginButton.click();
		}
		
		public RegisterPageCode navigationToRegisterPage() {
				registerPageLink.click();
				return new RegisterPageCode(driver);
			}
		
		
		public DashBoardPageCode validLogin() {
			username.sendKeys("kiran@gmail.com");
			password.sendKeys("123456");
			loginButton.click();
			return new  DashBoardPageCode(driver);
		}
}