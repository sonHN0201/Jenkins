package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03 extends BaseTest {
    @Test(description ="TC03-User cannot log into Railway with invalid password ")
    public void TC03(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on \"Login\" tab");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();

        System.out.println("3. Enter valid Email and invalid Password");
        System.out.println("4. Click on \"Login\" button");
        loginPage.login(Constant.USERNAME,Constant.PASSWORD1);
        String actualMsg =loginPage.getLoginErrorMsg();
        String expectedMsg = Constant.ERROR_LOGIN;

        Assert.assertEquals(actualMsg,expectedMsg,"Error messages are not displayed as expected");
    }
}
