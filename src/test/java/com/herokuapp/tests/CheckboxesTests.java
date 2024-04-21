package com.herokuapp.tests;

import com.herokuapp.pages.CheckboxesPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTests extends TestBase{
@BeforeMethod
public void precondition(){
	new HomePage (driver).selectCheckbox();
}

@Test
public void checkbox(){
	new CheckboxesPage (driver)
			.selectCheckbox(new String[]{" checkbox 1"});
}
}
