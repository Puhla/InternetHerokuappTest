package com.herokuapp.tests;

import com.herokuapp.pages.DropdownPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTests extends TestBase{
@BeforeMethod
public void precondition(){
	new HomePage (driver).selectDropdown();
}

@Test
public void dropdownTest(){
	new DropdownPage (driver).selectOption("Option 1");
}
}
