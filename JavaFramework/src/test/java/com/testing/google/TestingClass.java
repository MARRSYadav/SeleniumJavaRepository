package com.testing.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestingClass {
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		//Set Driver Path
		System.setProperty("", "");
		//launch browser
		driver = new ChromeDriver();
	}
	public void searchTextInGoogle() {
		
	}
	@AfterMethod
	public void TearDown() {
		
	}
}
