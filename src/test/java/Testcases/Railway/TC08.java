package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC08 extends BaseTest{
    @Test(description = "User can't login with an account hasn't been activated")
    public void TC08(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on Login tab");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();

        System.out.println("3. Enter username and password of account hasn't been activated.");
        loginPage.login(Constant.USERNAME2,Constant.PASSWORD2);

        String actualMsg =loginPage.getLoginErrorMsg();
        String expectedMsg= Constant.ERROR_LOGIN_USER;

        Assert.assertEquals(actualMsg,expectedMsg,"Message Invalid username or password. Please try again. not appear.");
    }
}
