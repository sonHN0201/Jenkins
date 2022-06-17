package PageObjects.Railway;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends GeneralPage{
    //Locators
    private final By txtUsername = By.id("username");
    private final By txtPassword = By.id("password");
    private final By btnLogin = By.xpath("//input[@value='login']");
    private final By lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm']");

    //Elements

    public WebElement getTxtUsername(){
        return  Constant.WEBDRIVER.findElement(txtUsername);
    }
    public WebElement getTxtPassword(){
        return Constant.WEBDRIVER.findElement(txtPassword);
    }
    public WebElement getBtnLogin(){
        return  Constant.WEBDRIVER.findElement(btnLogin);
    }
    public WebElement getLblLoginErrorMsg(){
        return  Constant.WEBDRIVER.findElement(lblLoginErrorMsg);
    }

    //Methods
    public HomePage login(String username, String Password){
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(Password);
        this.getBtnLogin().click();

        return new HomePage();
    }
    public String getLoginErrorMsg(){
        return this.getLblLoginErrorMsg().getText();
    }
}
