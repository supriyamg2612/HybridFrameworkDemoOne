package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPageCode {
	
	
	
	public static WebDriver driver = null;
	
	public DashBoardPageCode(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='LOGOUT']")
	WebElement logout;
	
	@FindBy(xpath = "//h3")  // 4 elements
	List<WebElement> courses;
	
	
	
	public ArrayList<String> verifyCourses() {
		
	ArrayList<String> actualCourses = new ArrayList<String>();
		
		for(WebElement course : courses) {
			 String text = course.getText();
			 actualCourses.add(text);
			
		}
		return actualCourses;
	}

		public LoginPageCode logoutTheApplication() {
			logout.click();
			return new LoginPageCode(driver);
		}
	

}
