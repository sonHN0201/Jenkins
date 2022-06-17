package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends BaseTest{
    @Test(description ="TC01 - User can't login with blank \"Username\" textbox" )
    public void TC02(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on \"Login\" tab");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();

        System.out.println("3. User doesn't type any words into \"Username\" textbox but enter valid information into \"Password\" textbox ");
        System.out.println("4. Click on \"Login\" button");
        loginPage.login(Constant.USERNAME1,Constant.PASSWORD);

        String actualMsg = loginPage.getLoginErrorMsg();
        String expectedMsg =Constant.ERROR_LOGIN;

        Assert.assertEquals(actualMsg,expectedMsg,"Error messages are not displayed as expected");
    }
}
