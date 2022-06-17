package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.ChangePasswordPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09 extends BaseTest{
    @Test(description = "User can't change password when \"New Password\" and \"Confirm Password\" are different.")
    public void TC09(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();
        System.out.println("2. Login with a valid account ");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        System.out.println("3. Click on \"Change Password\" tab");
        ChangePasswordPage changePasswordPage =new ChangePasswordPage();
        changePasswordPage.gotoChangePasswordPage();

        System.out.println("4. Enter valid information into \"Current Password\" textbox but enter \"a123:\"/{}!@$\\\" into \"New Password\" textbox and \"b456:\"/{}!@$\\\" into \"Confirm Password\" textbox.");
        changePasswordPage.changepassword(Constant.CURRENT_PASSWORD,Constant.NEW_PASSWORD1,Constant.CONFIRM_PASSWORD_1);

        String actualMsg=changePasswordPage.getChangePasswordError();
        String expectedMsg=Constant.ERROR_CHANGE_PASSWORD;
        Assert.assertEquals(actualMsg,expectedMsg,"Error Message: Password change failed. Please correct the error and try again. does not appear above the form.");
    }
}
