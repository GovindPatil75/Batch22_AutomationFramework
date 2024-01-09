package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTest extends BaseClass{
	
	
	@Test
	public void verify_TC001() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
	    Library.custom_SendKeys(login.getEmail(), "Test");
	    Library.custom_SendKeys(login.getpassword(), "12345678");
		Library.custom_Click(login.getlogin());
		
	}
	

}
