package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTest extends BaseClass{
	
	
	@Test
	public void verify_TC001() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
		String Username=excel.getStringTestData("LoginTest", 0, 0);
		String Password=excel.getStringTestData("LoginTest", 0, 1);
		
	    Library.custom_SendKeys(login.getEmail(), Username,"Email Id");
	    Library.custom_SendKeys(login.getpassword(), Password ,"Password");
		Library.custom_Click(login.getlogin() ,"Login Button");
		
	}
	

}
