package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07 extends BaseTest{
    @Test(description = "User can create new account")
    public void TC07(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on Register tab");
        RegisterPage registerPage = new RegisterPage();
        registerPage.gotoRegisterPage();

        System.out.println("3. Enter valid information into all fields");
        registerPage.Register(Constant.EMAIL_REGISTER,Constant.PASSWORD_REGISTER,Constant.CONFIRM_PASSWORD,Constant.PID);

        String actualMsg=registerPage.getRegister_Sign_Up_Success();
        String expected =Constant.REGISTER;

        Assert.assertEquals(actualMsg,expected,"Message Thank you for registering an account does not appear.");
    }
}
