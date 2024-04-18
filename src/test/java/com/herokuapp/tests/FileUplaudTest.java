package com.herokuapp.tests;

import com.herokuapp.pages.FileUploadPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUplaudTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFileUploadPage();

    }

    @Test
    public void fileUploadTest(){
        new FileUploadPage(driver)
                .uploadFile("C:/Tools/Screenshot.png")
                .verifySuccesTitle("File Uploaded!");
    }

}
