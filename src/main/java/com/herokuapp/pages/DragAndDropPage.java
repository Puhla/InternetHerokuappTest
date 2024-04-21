package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class DragAndDropPage extends BasePage{
public DragAndDropPage (WebDriver driver) {
	super (driver);
}

@FindBy(id ="column-a")
WebElement dragA;

@FindBy(id ="column-b")
WebElement dropB;
public DragAndDropPage actionDragA () {
	Actions actions= new Actions (driver);
	actions.dragAndDrop(dragA,dropB).perform();
	
	String text = dropB.getText();
	if (text.equals("A")) {
		System.out.println("PASS!");
	} else {
		System.out.println("FAIL!");
	}
	return this;
}

	
}

