package com.test.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginParaPOM {
	
	//declaration
	
    @FindBy(xpath="//input[@type='text']") private WebElement email1;
	
	@FindBy(xpath="//input[@type='password']") private WebElement pass1;
	
	@FindBy(xpath="//button[@name='login']") private WebElement log;
	
	//initialization
	
	LoginParaPOM (WebDriver drivr){
		PageFactory.initElements(drivr, this);
	}
	
	//usage
	
	public void email(String mail) {
		email1.sendKeys(mail);
	}
	
	public void password(String pass) {
		pass1.sendKeys(pass);
	}
	
	public void login() {
		log.click();
	}

}
