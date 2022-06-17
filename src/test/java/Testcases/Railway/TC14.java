//package Testcases.Railway;
//
//import Common.Constant;
//import Common.JsonHelper;
//import Common.Utilities;
//import PageObjects.Railway.BookTicketPage;
//import PageObjects.Railway.HomePage;
//import PageObjects.Railway.LoginPage;
//import com.google.gson.JsonObject;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class TC14 extends BaseTest{
//    @Test(description = "User can book many tickets at a time", dataProvider = "data-provider-BookTicket")
//    public void TC14(String Depart_Date,String Depart_From,String Arrive_At,String Seat_Type,String Ticket_Amount){
//        HomePage homePage = new HomePage();
//        LoginPage loginPage = new LoginPage();
//        BookTicketPage bookTicketPage = new BookTicketPage();
//        System.out.println("Pre-condition: Create and activate a new account");
//        System.out.println("1. Navigate to QA Railway Website");
//        homePage.open();
//
//        System.out.println("2. Login with a valid account ");
//        loginPage.gotoLoginPage();
//        loginPage.login(Constant.USERNAME,Constant.PASSWORD);
//
//        System.out.println("3. Click on Book ticket tab");
//        bookTicketPage.gotoBookTicketPage();
//
//        System.out.println("4. Select a Depart date from the list");
//        System.out.println("5. Select Nha Trang for Depart from and Sài Gòn for Arrive at");
//        System.out.println("6. Select Soft seat with air conditioner for Seat type");
//        bookTicketPage.BookTicketProvider(Depart_Date,Depart_From,Arrive_At,Seat_Type,Ticket_Amount);
//
//
//        System.out.println("7. Select 5 for Ticket amount");
//        bookTicketPage.getBtn_BookTicket();
//
//        String actualMsg = bookTicketPage.getBookTicket_successfully();
//        String expectedMsg = Constant.BookTicket_successfully;
//
//        Assert.assertEquals(actualMsg,expectedMsg,"Message Ticket booked successfully! not displays");
//    }
//        @DataProvider(name = "data-provider-BookTicket")
//        public Object[][] dataProvider() {
////            String filePath = Utilities.getProjectPathJson();
//
////            JsonObject jsonObject =JsonHelper.getJsonObject(filePath);
//
//            JsonObject dataTC14 = jsonObject.getAsJsonObject("TC14");
//            String DepartDate14 = dataTC14.get("Depart_Date").getAsString();
//            String DepartFrom14 = dataTC14.get("Depart_From").getAsString();
//            String ArriverAt14 = dataTC14.get("Arrive_At").getAsString();
//            String SeatType14 = dataTC14.get("Seat_Type").getAsString();
//            String TicketAmount14 = dataTC14.get("Ticket_Amount").getAsString();
//
//            Object[][] object = new Object[][]{
//                    {DepartDate14, DepartFrom14, ArriverAt14,SeatType14,TicketAmount14}
//            };
//            return object;
//        }
//}
