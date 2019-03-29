package com.selenide.test;

import org.openqa.selenium.WebDriver;

import com.selenide.pages.ElementIds;

public class Test_Case2 {
	private static WebDriver driver = null;

	public static void createNewApp() {
		ElementIds.appBtn(driver).click();

	}

}
