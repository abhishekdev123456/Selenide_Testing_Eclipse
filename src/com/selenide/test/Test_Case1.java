package com.selenide.test;

import org.openqa.selenium.WebDriver;

import com.selenide.pages.ElementIds;
import com.selenide.pages.InputValues;

import static com.codeborne.selenide.Selenide.open;

public class Test_Case1 {

	private static WebDriver driver = null;

	public static void login() {

		open(InputValues.url());

		ElementIds.userName(driver).setValue(InputValues.userName());
		ElementIds.password(driver).setValue(InputValues.password());
		ElementIds.signIn(driver).click();

	}
}
