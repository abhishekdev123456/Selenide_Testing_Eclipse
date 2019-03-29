package com.selenide.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.codeborne.selenide.WebDriverRunner;

public class Base {
	public WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverRunner.setWebDriver(driver);
	}

	@AfterClass
	public void close() {
		driver.quit();
	}
}
