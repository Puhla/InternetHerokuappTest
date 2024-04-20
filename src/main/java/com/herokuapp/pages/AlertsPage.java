package com.herokuapp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage {
public AlertsPage (WebDriver driver) {
	super (driver);
}


@FindBy(css = "li:nth-child(1) button")
WebElement jsAlertButton;

public boolean isAlertPresent (String text) {
	Alert alert = new WebDriverWait (driver, Duration.ofSeconds (15))
			.until (ExpectedConditions.alertIsPresent ());
	if (alert == null) {
		return false;
	} else {
		driver.switchTo ().alert ();
		alert.accept ();    //клик на ОК
		return true;
	}
}


@FindBy(css = "li:nth-child(2) button")
WebElement jsConfirmButton;
public AlertsPage selectResult(String confirm){
	click (jsConfirmButton);
	if(confirm != null && confirm.equals ("OK")){
		driver.switchTo ().alert ().accept ();
	}else if (confirm !=null && confirm.equals ("Cancel")){
		driver.switchTo ().alert ().dismiss ();
	}
	return this;
}

@FindBy(id="result")
WebElement result;
public AlertsPage verifyResult(String text){
	Assert.assertTrue (result.getText ().contains (text));
	return this;
}

@FindBy(css = "li:nth-child(3) button")
WebElement jsPromptButton;
public AlertsPage sendMessageToAlert(String message) {
	click(jsPromptButton);
	
	if (message != null) {
		driver.switchTo().alert().sendKeys(message);
		driver.switchTo().alert().accept();
	}
	return this;
}
@FindBy(id="result")
WebElement messageResult;
public AlertsPage verifyMessage(String text) {
	Assert.assertTrue(messageResult.getText().contains(text));
	return this;
}


public AlertsPage jsAlertButton () {
	click (jsAlertButton);
	return this;
}


public AlertsPage jsConfirmButton () {
	click (jsConfirmButton);
	return this;
}

public AlertsPage jsPromptButton () {
	click (jsPromptButton);
	return this;
}



}


