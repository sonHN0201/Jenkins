package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC11 extends BaseTest{
    @Test(description = "User can't create account while password and PID fields are empty")
    public void TC11(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on Register tab");
        RegisterPage registerPage = new RegisterPage();
        registerPage.gotoRegisterPage();

        System.out.println("3. Enter valid email address and leave other fields empty");
        System.out.println("4. Click on Register button");
        registerPage.Register(Constant.EMAIL_REGISTER,Constant.PASSWORD_BLANK,Constant.CONFIRM_PASSWORD_BLANK,Constant.PID_BLANK);

        String actualMsg = registerPage.getRegister_Invalid_Pass_Length();
        String expectedMsg =Constant.ERROR_REGISTER_PASSWORD_LENGTH;
        Assert.assertEquals(actualMsg,expectedMsg,"The error message  Invalid password length not Displayed");

        String actual= registerPage.getRegister_Invalid_ID_Length();
        String expected =Constant.ERROR_REGISTER_ID_LENGTH;
        Assert.assertEquals(actual,expected,"Error message Invalid ID length not displayed");

        String actualMSG = registerPage.getRegisterErrorMsg_Blank();
        String expectedMSG = Constant.ERROR_REGISTER_BLANK;
        Assert.assertEquals(actualMSG,expectedMSG,"Message :There was an error in the form. Please correct the error and try again.Does not appear above the form.");
    }
}
