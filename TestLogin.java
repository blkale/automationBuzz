package com.test.signup;

import org.openqa.selenium.WebDriver;

import com.velo.config.Configuration;

import driver.SetUp;

public class TestPara {
	
	public static void main(String[] arg) {
		SetUp set=new SetUp();
		WebDriver driver = set.initDriver();
		
		driver.get(Configuration.fbLogin);
		driver.manage().window().maximize();
		
		LoginParaPOM lm=new LoginParaPOM(driver);
		lm.email("blkale@gmail.com");
		lm.password("owinc");
		lm.login();
		
	}

}
