package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.BookTicketPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04 extends BaseTest{
    @Test(description = "User is redirected to Book ticket page after logging in")
    public void TC04() {
        System.out.println("1. Navigate to QA Railway Website");
        HomePage homePage = new HomePage();
        homePage.open();

        System.out.println("2. Click on \"Book ticket\" tab");
        BookTicketPage bookTicketPage = new BookTicketPage();
        bookTicketPage.gotoBookTicketPage();

        System.out.println("3. Login with valid account");
        LoginPage loginPage = new LoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        String actualMsg =bookTicketPage.getBookTicket();
        String expectedMsg =Constant.TITLE_BOOK_TICKET;

        Assert.assertEquals(actualMsg,expectedMsg,"User cannot navigate to book ticket page");
    }
}
