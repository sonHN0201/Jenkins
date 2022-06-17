package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC10 extends BaseTest{
    @Test(description = "User can't create account with an already in-use email")
    public void TC10(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on \"Register\" tab");
        RegisterPage registerPage = new RegisterPage();
        registerPage.gotoRegisterPage();

        System.out.println("3. Enter information of the created account in Pre-condition");
        System.out.println("4. Click on \"Register\" button");
        registerPage.Register(Constant.USERNAME,Constant.PASSWORD,Constant.PASSWORD,Constant.PID);

        String actualMsg=registerPage.getRegisterErrorMSg_Used();
        String expectedMsg=Constant.ERROR_USED_MAIL;

        Assert.assertEquals(actualMsg,expectedMsg,"Welcome message is not displayed as expected");
    }
}
