package PageObjects.Railway;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class    GeneralPage {

    //locators
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//div[@id='menu']//a[@href='/Account/Logout']");
    private final By lblWelcomeMessage = By.xpath("//div[@class='account']/strong");
    private final By tabBookTicket = By.xpath("//div[@id='menu']//a[@href='/Page/BookTicketPage.cshtml']");
    private final By tabMyTicket = By.xpath("//div[@id='menu']//a[@href='/Page/ManageTicket.cshtml']");
    private final By tabRegister = By.xpath("//div[@id='menu']//a[@href='/Account/Register.cshtml']");
    private final By tabChangePassword = By.xpath("//div[@id='menu']//a[@href='/Account/ChangePassword.cshtml']");
    private final By tabContact = By.xpath("//div[@id='menu']//a[@href='/Page/Contact.cshtml']");
    private final By tabTimetable=By.xpath("//div[@id='menu']//a[@href='TrainTimeListPage.cshtml']");
    // Element
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }
    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }
    protected WebElement getLblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }
    protected WebElement getTabBookTicket(){
        return Constant.WEBDRIVER.findElement(tabBookTicket);
    }
    protected WebElement getTabMyTicket(){
        return Constant.WEBDRIVER.findElement(tabMyTicket);
    }
    protected WebElement getTabRegister(){
        return Constant.WEBDRIVER.findElement(tabRegister);
    }
    protected WebElement getTabChangePassword(){
        return Constant.WEBDRIVER.findElement(tabChangePassword);
    }
    protected WebElement getTabContact(){
        return Constant.WEBDRIVER.findElement(tabContact);
    }
    protected WebElement getTabTimetable(){
        return Constant.WEBDRIVER.findElement(tabTimetable);
    }
    //Methods
    public String getWelcomeMessage()
    {
        return this.getLblWelcomeMessage().getText();
    }

    public LoginPage gotoLoginPage(){
        this.getTabLogin().click();
        return new LoginPage();
    }
    public void gotoBookTicketPage(){
        this.getTabBookTicket().click();
    }
    public void gotoMyTicketPage(){
        this.getTabMyTicket().click();
    }
    public void gotoRegisterPage(){
        this.getTabRegister().click();
    }
    public void gotoChangePasswordPage(){
        this.getTabChangePassword().click();
    }
    public void gotoContactPage(){
        this.getTabContact().click();
    }
    public void gotoLogoutPage(){
        this.getTabLogout().click();
    }
    public void gotoTimetablePage(){
        this.getTabTimetable().click();
    }
}
