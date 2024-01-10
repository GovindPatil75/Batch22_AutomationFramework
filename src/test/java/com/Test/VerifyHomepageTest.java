package com.Test;

import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class VerifyHomepageTest extends BaseClass{

	
	@Test
	public void veriftTC_002() {
		
			String data=excel.getStringTestData("HomePageTest", 0, 0);
			System.out.println(data);
	}
}
