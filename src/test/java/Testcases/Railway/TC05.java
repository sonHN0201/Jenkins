package Testcases.Railway;

import Common.Constant;
import Common.Utilities;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05 extends BaseTest{
    @Test(description = "System shows message when user enters wrong password several times")
    public void TC05(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on \"Login\" tab");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();

        System.out.println("3. Enter valid information into \"Username\" textbox except \"Password\" textbox");
        System.out.println("4. Click on \"Login\" button");
        loginPage.login(Constant.USERNAME,Constant.PASSWORD1);

        System.out.println("5. Repeat step 3 three more times.");


        String actualMsg =loginPage.getLoginErrorMsg() ;
        String expectedMsd =Constant.TC05;

        Assert.assertEquals(actualMsg,expectedMsd,"User can't login and says \"You've used 4 out of 5 login attempts. After using all 5 times, you won't be able to log in for 15 minutes.\" not appear.");
    }
}
