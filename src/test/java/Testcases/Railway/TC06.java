package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.ContactPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import PageObjects.Railway.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06 extends BaseTest{
    @Test(description = "User is redirected to Home page after logging out")
    public void TC06(){
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Login with valid Email and Password");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        System.out.println("3. Click on \"Contact\" tab");
        ContactPage contactPage = new ContactPage();
        contactPage.gotoContactPage();

        System.out.println("4. Click on \"Log out\" tab");
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.gotoLogoutPage();

        String actualMsg=homePage.getWelcomeMessage();
        String expectedMsg=Constant.WELCOME;
        Assert.assertEquals(actualMsg,expectedMsg,"The homepage is not showing.The Log Out tab remains.");
    }
}
