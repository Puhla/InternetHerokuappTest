package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.WindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTests extends TestBase {
@BeforeMethod
public void precondition(){
	new HomePage(driver).selectWindow();
}

@Test
public void NewWindowTest(){
	new WindowsPage(driver)
			.switchToNextWindow(1)
			.verifyWindowsMessage ("New Window");
}
}
