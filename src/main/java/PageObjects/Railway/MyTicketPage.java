package PageObjects.Railway;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MyTicketPage extends GeneralPage{
    //Locator
    private final By btnCancel = By.xpath("//tr[@class='OddRow']//td//input[@onclick='DeleteTicket(4574);']");
    public final By  lblTicket_Cancel= By.xpath("//tbody//tr[@class='OddRow']//td");
    //Element
    protected WebElement getBtnCancel(){
        return Constant.WEBDRIVER.findElement(btnCancel);
    }
    public WebElement getLblCancel(){
        return  Constant.WEBDRIVER.findElement(lblTicket_Cancel);
    }
    //Methods
    public void getCancel(){
        this.getBtnCancel().sendKeys(Keys.ENTER);
    }
    public static void acceptAlert() {
        Constant.WEBDRIVER.switchTo().alert().accept();
    }
    public String getCancel_Ticket(){
        return this.getLblCancel().getText();
    }
    public boolean BtnCancel_Displayed(){
        return this.getLblCancel().isDisplayed();
    }
}
