package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
public HomePage (WebDriver driver) {
	super (driver);
}

@FindBy(css = "[href='/javascript_alerts']")
WebElement javaScriptAlertsLink;

public AlertsPage getJavaScriptAlertsLink () {
	click (javaScriptAlertsLink);
	return new AlertsPage (driver);
}


@FindBy(css="a[href='/javascript_alerts']")
WebElement javascriptAlerts;
public HomePage selectAlerts() {
	click(javascriptAlerts);
	return new HomePage(driver);
}

@FindBy(css="a[href*='/windows']")
WebElement newWindows;
public HomePage selectWindow() {
	click(newWindows);
	return new HomePage(driver);
}

@FindBy(css="a[href*='/checkboxes']")
WebElement checkbox;
public HomePage selectCheckbox() {
	click(checkbox);
	return new HomePage(driver);
}

@FindBy(css="a[href*='/dropdown']")
WebElement dropdown;
public HomePage selectDropdown() {
	click(dropdown);
	return new HomePage(driver);
}
@FindBy(css="a[href*='/upload']")
WebElement file;
public HomePage picUpload() {
	click(file);
	return new HomePage(driver);
}


@FindBy(css="a[href='/broken_images']")
WebElement brokenImages;
public HomePage checkBrokenImages() {
	click(brokenImages);
	return new HomePage(driver);
}

@FindBy(css="a[href='/drag_and_drop']")
WebElement dragAndDrop;

public HomePage selectDragAndDrop () {
	click (dragAndDrop);
	return new HomePage (driver);
}



}


