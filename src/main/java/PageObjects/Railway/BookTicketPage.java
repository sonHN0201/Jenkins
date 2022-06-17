package PageObjects.Railway;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookTicketPage extends GeneralPage{
    //Locator
    public final By titleBookTicket = By.xpath("//form[@method=\"post\"]//legend");
    public final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    public final By lblBookTicket_successfully = By.xpath("//h1[@align='center']");
    public final By dbl_date = By.name("Date");
    public final By dbl_DepartStation = By.name("DepartStation");
    public final By dbl_ArriveStation= By.name("ArriveStation");
    public final By dbl_Seat_Type = By.name("SeatType");
    public final By dbl_Ticket_Amount = By.name("TicketAmount");
    public final By slt_Book_10_Ticket = By.xpath("//select[@name='TicketAmount']//option[@value='4']");
    public final By slt_Book_1_Ticket = By.xpath("//select[@name='TicketAmount']//option[@value='1']");
    public final By Error_BookTicket= By.xpath("//p[@class='message error']");
    public final By Error_TicKetAmount = By.xpath("//label[@class='validation-error']");
    public final WebDriverWait wait = new WebDriverWait(Constant.WEBDRIVER, 5);
    //Elements

    public WebElement getTitleBookTicket(){
        return Constant.WEBDRIVER.findElement(titleBookTicket);
    }
    public WebElement getBtnBookTicket(){
        return Constant.WEBDRIVER.findElement(btnBookTicket);
    }
    public WebElement getLblBookTicket_successfully(){
        return Constant.WEBDRIVER.findElement(lblBookTicket_successfully);
    }
    public Select getDbl_date()
    {
        Select departDate = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(dbl_date)));
        return departDate;
    }
    public Select getDbl_DepartStation()
    {
        Select DepartStation = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(dbl_DepartStation)));
        return DepartStation;
    }
    public Select getDbl_ArriveStation()
    {
        Select ArriveStation = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(dbl_ArriveStation)));
        return ArriveStation;
    }
    public Select getDbl_Seat_Type()
    {
        Select Seat_Type = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(dbl_Seat_Type)));
        return Seat_Type;
    }
    public Select getDbl_Ticket_Amount()
    {
        Select Ticket_Amount = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(dbl_Ticket_Amount)));
        return Ticket_Amount;
    }

    public WebElement getSlt_Book_10_Ticket(){
        return Constant.WEBDRIVER.findElement(slt_Book_10_Ticket);
    }
    public WebElement getSlt_Book_1_Ticket(){
        return Constant.WEBDRIVER.findElement(slt_Book_1_Ticket);
    }
    public WebElement getError_BookTicket(){
        return Constant.WEBDRIVER.findElement(Error_BookTicket);
    }
    public WebElement getError_TicKetAmount(){
        return Constant.WEBDRIVER.findElement(Error_TicKetAmount);
    }
    //Methods

    public String getBookTicket(){
        return this.getTitleBookTicket().getText();
    }
    public BookTicketPage getBtn_BookTicket(){
        this.getBtnBookTicket().submit();
        return new BookTicketPage();
    }
    public String getBookTicket_successfully(){
        return this.getLblBookTicket_successfully().getText();
    }
    public void getBook_10_Ticket(){
         this.getSlt_Book_10_Ticket().click();
    }
    public void getBook_1_Ticket(){
        this.getSlt_Book_1_Ticket().click();
    }
    public String getError_BookTicket_1(){
        return this.getError_BookTicket().getText();
    }
    public String getError_TicKetAmount_1(){
        return this.getError_TicKetAmount().getText();
    }
    public void BookTicketProvider(String Depart_Date, String Depart_From, String Arrive_At,
                                   String Seat_Type, String Ticket_Amount){
        getDbl_date().selectByVisibleText(Depart_Date);
        getDbl_DepartStation().selectByVisibleText(Depart_From);
        getDbl_ArriveStation().selectByVisibleText(Arrive_At);
        getDbl_Seat_Type().selectByVisibleText(Seat_Type);
        getDbl_Ticket_Amount().selectByVisibleText(Ticket_Amount);
        getBtnBookTicket().click();

    }
}
