package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage{
public UploadPage (WebDriver driver) {
	super (driver);
}
@FindBy(id="file-upload")
WebElement uploadPicture;
@FindBy(id="file-submit")
WebElement submitUpload;

public UploadPage upload(String path) {
	uploadPicture.sendKeys(path);
	click(submitUpload);
	return this;
}
}
