package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {

@BeforeMethod
public void precondition () {
	new HomePage (driver).getJavaScriptAlertsLink ();
	
}

@Test
public void alertAccept() {
	new AlertsPage (driver).jsAlertButton();
	new AlertsPage(driver).isAlertPresent ("OK");
}


@Test
public void jsConfirm() {
	new AlertsPage (driver).jsConfirmButton ();
}
@Test
public void alertWithSelectTest() {
	new AlertsPage(driver)
			.selectResult("Cancel")
			.verifyResult("Cancel");
}


@Test
public void sendMessageToAlertTest() {
	new AlertsPage(driver)
			.sendMessageToAlert("Hello world!")
			.verifyMessage("Hello world!");
}
}



