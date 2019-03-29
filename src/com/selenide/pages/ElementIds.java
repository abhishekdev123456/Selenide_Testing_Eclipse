package com.selenide.pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.codeborne.selenide.SelenideElement;

public class ElementIds {

	private static SelenideElement element = null;

	public static SelenideElement userName(WebDriver driver) {
		element = $(By
				.cssSelector("#root > div > div > div > div.Section__sectionBody___3DCrX > div:nth-child(2) > input"));
		return element;
	}

	public static SelenideElement password(WebDriver driver) {
		element = $(By
				.cssSelector("#root > div > div > div > div.Section__sectionBody___3DCrX > div:nth-child(3) > input"));
		return element;
	}

	public static SelenideElement signIn(WebDriver driver) {
		element = $(By.cssSelector(
				"#root > div > div > div > div.Section__sectionFooter___1QlDn > span.Section__sectionFooterPrimaryContent___36Gb1 > button"));

		return element;

	}

	public static SelenideElement appBtn(WebDriver driver) {
		element = $(By.cssSelector("#root > div > div.jss15 > header > div > div:nth-child(2) > div:nth-child(2)"));
		return element;
	}

}
