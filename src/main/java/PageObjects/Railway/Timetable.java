package PageObjects.Railway;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Timetable extends GeneralPage{
    //Locator
    public final By Title_CheckPrice_DN_SG = By.xpath("//tr[@class='TableSmallHeader']//th[@colspan='7']");
    String linkCheckPrice = "//td[text()='%s']/following-sibling::td[text()='%s']/../td[count(//th[text()='Check Price']/preceding-sibling::th)+1]/a";
    //Element
    public WebElement getLblCheckPrice_DN_SG(){
        return Constant.WEBDRIVER.findElement(Title_CheckPrice_DN_SG);
    }
    public WebElement getLinkCheckPrice(String depart, String arrive){
        return Constant.WEBDRIVER.findElement(By.xpath(String.format(linkCheckPrice, depart, arrive)));
    }
    //Methods
    public String Title_DN_SG(){
        return this.getLblCheckPrice_DN_SG().getText();
    }
    public void clickLinkCheckPrice(String arrive, String depart){
        this.getLinkCheckPrice(depart, arrive).click();
    }
}
