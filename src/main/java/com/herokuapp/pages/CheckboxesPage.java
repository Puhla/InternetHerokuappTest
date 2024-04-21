package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{
public CheckboxesPage (WebDriver driver) {
	super (driver);
}


@FindBy(xpath="/form[@id='checkboxes']/input[1]")
WebElement check1;

@FindBy(css="input:nth-child(2)")
WebElement check2;
public CheckboxesPage selectCheckbox(String[] check) {
	for (int i = 0; i < check.length; i++) {
		if(check[i].equals("checkbox 1")){
			click(check1);
		}
		if(check[i].equals("checkbox 2")){
			click(check2);
		}
	}
	
	return this;
}
}
