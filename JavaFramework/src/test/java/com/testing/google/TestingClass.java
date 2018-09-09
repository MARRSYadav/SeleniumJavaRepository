package com.testing.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestingClass {
	private WebDriver driver;

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.edge.driver", "./Driver/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
	}
}