package Testcases.Railway;

import Common.Constant;
import PageObjects.Railway.BookTicketPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import PageObjects.Railway.MyTicketPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC16 extends BaseTest{
    @Test(description = "User can cancel a ticket")
    public void TC16(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        BookTicketPage bookTicketPage = new BookTicketPage();
        MyTicketPage myticketPage = new MyTicketPage();
        System.out.println("Pre-condition: Create and activate a new account");
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();

        System.out.println("2. Login with a valid account");
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);

        System.out.println("3. Book a ticket");
        bookTicketPage.gotoBookTicketPage();
        bookTicketPage.getBtn_BookTicket();

        System.out.println("4. Click on My ticket tab");
        myticketPage.gotoMyTicketPage();

        System.out.println("5. Click on Cancel button of ticket which user want to cancel.");
        myticketPage.getCancel();

        System.out.println("6. Click on OK button on Confirmation message Are you sure?");
        myticketPage.acceptAlert();

        String actualMsg =myticketPage.getCancel_Ticket();
        String expectedMsg= String.valueOf(myticketPage.BtnCancel_Displayed());
        Assert.assertEquals(actualMsg,expectedMsg,"The canceled ticket is not disappeared.");
    }
}
