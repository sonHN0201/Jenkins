package Common;

import org.openqa.selenium.WebDriver;

public class   Constant {

    public static WebDriver WEBDRIVER;
    public static final String RAILWAY_URL="http://www.railway.somee.com/Page/HomePage.cshtml";
    public static final String USERNAME="nguyenvana@gmail.com";
    public static final String PASSWORD="0901965659";
    public static final String USERNAME1="";
    public static final String PASSWORD1 = "2442145";

    //Register
    public static String EMAIL_REGISTER="nguyenvanb@gmail.com";
    public static String PASSWORD_REGISTER="123456789";
    public static String CONFIRM_PASSWORD="123456789";
    public static String PID="324323425";
    public static String PASSWORD_BLANK ="";
    public static String CONFIRM_PASSWORD_BLANK="";
    public static String PID_BLANK="";

    // account hasn't been activated
    public static String USERNAME2="nguyenvanc@gmail.com";
    public static String PASSWORD2="1236325";

    // Change Password
    public static String CURRENT_PASSWORD="0901965659";
    public static String NEW_PASSWORD="123456789";
    public static String CONFIRM_PASSWORD_CHANGE="123456789";

    //User can't create account with "Confirm password" is not the same with "Password"
    public static String USERNAME3 ="nguyenvand@gmail.com";
    public static String PASSWORD3 = "123123123";
    public static String CONFIRM_PASSWORD3 = "123123321";
    // change password when "New Password" and "Confirm Password" are different.
    public static String NEW_PASSWORD1="a123";
    public static String CONFIRM_PASSWORD_1="b456";

    //Error
    public static String TITLE_CHECK_PRICE_DN_SG ="Ticket price from Đà Nẵng to Sài Gòn";
    public static String BookTicket_successfully = "Ticket booked successfully!";
    public static String ERROR_CHANGE_PASSWORD="Password change failed. Please correct the errors and try again.";
    public static String ERROR_USED_MAIL ="This email address is already in use.";
    public static String ERROR_LOGIN_USER ="Invalid username or password. Please try again.";
    public static String REGISTER ="Thank you for registering your account";
    public static String WELCOME ="Welcome guest!";
    public static String ERROR_LOGIN = "There was a problem with your login and/or errors exist in your form.";
    public static String TITLE_BOOK_TICKET ="Book ticket form";
    public static String TC05="You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";
    public static String ERROR_REGISTER_PASSWORD_LENGTH ="Invalid password length";
    public static String ERROR_REGISTER_ID_LENGTH="Invalid ID length";
    public static String ERROR_REGISTER_BLANK="There're errors in the form. Please correct the errors and try again.";
    public static String ERROR_TICKET_AMOUNT="You have booked 10 tickets. You can book no more.";
}

