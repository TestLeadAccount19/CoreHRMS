package com.Hrms.pages;

import java.util.Properties;

import org.openqa.selenium.By;

import com.Hrms.utils.CommonUtils;
import com.Hrms.utils.TestNGUtility;

public class LoginPage {

	public static Properties properties;

	// Web locators
	private final By by_username = By.xpath("//input[@name='txtUserName']");
	private final By by_password = By.xpath("//input[@name='txtPassword']");
	private final By by_signin = By.xpath("//input[@name='Submit']");
	private final By by_welcomepage = By.xpath("//li[text()='Welcome selenium']");

	// Helping functions
	public void login() {

		try {

			CommonUtils.enterValue(getUsername(), "selenium", true);

			CommonUtils.enterValue(getPassword(), "selenium", true);

			CommonUtils.clickElement(getSignIn());

		} catch (Exception e) {
			TestNGUtility.assertFail(e.getMessage());
		}
	}

	// Getter functions
	public By getUsername() {
		return by_username;
	}

	// Getter functions
	public By getPassword() {
		return by_password;
	}

	// Getter functions
	public By getSignIn() {
		return by_signin;
	}

	public By getWelcomePage() {
		return by_welcomepage;
	}

}
