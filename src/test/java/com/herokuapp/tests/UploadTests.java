package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.UploadPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadTests extends TestBase{
@BeforeMethod
public void precondition(){
	new HomePage (driver).picUpload();
}

@Test
public void uploadPicture(){
	new UploadPage (driver).upload("/Users/karolina/Tools/картинкаQa.png");
	
}
}
