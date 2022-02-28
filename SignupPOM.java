package com.test.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignPOM {
	
	//Declaration
	
	@FindBy(xpath="//input[@name='firstname']") private WebElement first;
	
	@FindBy(xpath="//input[@name='lastname']") private WebElement last;
	
	@FindBy(xpath="//input[@name='reg_email__]") private WebElement mail;
	
	@FindBy(xpath="//select[@id='day']") private WebElement dday;
	
	@FindBy(xpath="//select[id='month']") private WebElement mmonth;
	
	@FindBy(xpath="//select[id='year']") private WebElement yyear;
	
	@FindBy(xpath="(//input[@type='radio'])[1]") private WebElement fmale;
	
	@FindBy(xpath="(//input[@type='radio'])[2]") private WebElement mmale;
	
	@FindBy(xpath="(//input[@type='radio'])[3]") private WebElement custa;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement ssubmit;
	
	
	//initialazation
	
	SignPOM(WebDriver drivr){
		PageFactory.initElements(drivr, this);
	}
	
	//usage
	
	public void firstname() {
		first.sendKeys("Nikss");
	}
	
	public void lastname() {
		last.sendKeys("Jadhoo");
	}
	
	public void email() {
		mail.sendKeys("nikss@gmail.com");
	}
	
	public void day() {
		Select s=new Select(dday);
		s.selectByVisibleText("12");
	}
	
	public void month() {
		Select s=new Select(mmonth);
		s.selectByVisibleText("Dec");
	}
	
	public void year() {
		Select s=new Select(yyear);
		s.selectByVisibleText("1984");
	}
	
	public void female() {
		fmale.click();
	}
	
	public void male() {
		mmale.click();
	}
	
	public void custom() {
		custa.click();
	}
	
	public void signup() {
		ssubmit.click();
	}
		
}
