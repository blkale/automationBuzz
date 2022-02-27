package com.test.signup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.velo.config.Configuration;

public class Utility {
	
	public String readExelSheet(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(Configuration.sheetPath);
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = sh.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	
	public WebDriver initDriver() {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(Configuration.fbLogin);
		driver.manage().window().maximize();
		return driver;
		
	}

}
