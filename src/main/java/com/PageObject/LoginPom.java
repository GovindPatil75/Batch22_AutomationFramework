package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement login;
	
	public WebElement getEmail() {
		return Email;
		
	}
	
	public WebElement getpassword() {
		return password;
		
	}
	
	public WebElement getlogin() {
		return login;
	}
}
