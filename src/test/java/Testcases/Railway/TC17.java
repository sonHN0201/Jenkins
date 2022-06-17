package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.BookTicketPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC17 extends BaseTest{
    @Test(description = "User can't book more than 10 tickets",dataProvider = "data-provider-book more than")
    public void TC17(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        BookTicketPage bookTicketPage = new BookTicketPage();
        System.out.println("Pre-condition: Create and activate a new account");
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Login with a valid account");
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        System.out.println("3. Click on Book ticket tab");
        bookTicketPage.gotoBookTicketPage();

        System.out.println("4. Book 10 tickets");
        bookTicketPage.getBook_10_Ticket();
        bookTicketPage.getBtn_BookTicket();

        System.out.println("5. Click on Book ticket tab again");
        bookTicketPage.gotoBookTicketPage();

        System.out.println("6. Book one more ticket");
        bookTicketPage.getBook_1_Ticket();

        String actualMsg=bookTicketPage.getError_BookTicket_1();
        String expectedMsg=Constant.ERROR_REGISTER_BLANK;
        Assert.assertEquals(actualMsg,expectedMsg,"Error message There're errors in the form. Please correct the errors and try again.  not displays");

        String actualMSG = bookTicketPage.getError_TicKetAmount_1();
        String expectedMSG = Constant.ERROR_TICKET_AMOUNT;
        Assert.assertEquals(actualMSG,expectedMSG,"Error message You have booked 10 tickets. You can book no more. not displays ");
    }

}
