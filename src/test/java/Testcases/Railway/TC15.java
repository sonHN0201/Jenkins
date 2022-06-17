package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import PageObjects.Railway.Timetable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC15 extends BaseTest{
    @Test(description = "Ticket price page displays with ticket details after clicking on check price link in Train timetable page")
    public void TC15(){
        System.out.println("Pre-condition: Create and activate a new account");
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Login with a valid account");
        LoginPage loginPage = new LoginPage();
        loginPage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        System.out.println("3. Click on Timetable tab");
        Timetable timetable = new Timetable();
        timetable.gotoTimetablePage();

        System.out.println("4. Click on check price link of the route from Đà Nẵng to Sài Gòn");
        timetable.clickLinkCheckPrice("Sài Gòn", "Đà Nẵng");

        String actualMsg=timetable.Title_DN_SG();
        String expectedMsg=Constant.TITLE_CHECK_PRICE_DN_SG;
        Assert.assertEquals(actualMsg,expectedMsg,"The fare table does not display  Fares from Da Nang to Saigon.");
    }
}
