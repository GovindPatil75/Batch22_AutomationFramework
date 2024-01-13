package com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ExceldataProvider excel;
	public static ConfigdataProvider config;
	
	@BeforeSuite
	public void BS() throws Exception {
		excel=new ExceldataProvider();
		config=new ConfigdataProvider();
	}
	
	@Parameters("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName) {
		// Browser Open
		if(BrowserName.equalsIgnoreCase(config.getBrowsername())) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase(config.getBrowserEdge())) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(config.getBaseUrl());
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
