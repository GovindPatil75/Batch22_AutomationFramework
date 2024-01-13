package com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {

	public static ExtentTest test;
	public static void custom_SendKeys(WebElement element ,String Value ,String fieldname) {
		
		try {
			element.sendKeys(Value);
			test.log(Status.PASS, fieldname+"=Value Successfully Send ="+Value);
			
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}
	
	
    public static void custom_Click(WebElement element,String fieldname ) {
		
		try {
			element.click();
			test.log(Status.PASS, "Clicked Successfully = "+fieldname);
			
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}
    
    public static void getExplicitWait(WebDriver driver,long time,WebElement element) {
    	
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    	
    }
    
    
    
    
    
    
    
}
