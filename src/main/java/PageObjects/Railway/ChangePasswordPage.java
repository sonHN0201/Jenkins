package PageObjects.Railway;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends GeneralPage {
    public final By txtCurrentPassword = By.id("currentPassword");
    public final By txtNewPassword = By.id("newPassword");
    public final By txtConfirmPassword = By.id("confirmPassword");
    public final By btnChangePassword = By.xpath("//input[@value='Change Password']");
    public final By lblChangePassword_success = By.xpath("//p[@class='message success']");
    public final By lblChangePasswordError = By.xpath("//p[@class='message error']");
    //Elements
    protected WebElement getTxtCurrentPassword() {
        return Constant.WEBDRIVER.findElement(txtCurrentPassword);
    }

    protected WebElement getTxtNewPassword() {
        return Constant.WEBDRIVER.findElement(txtNewPassword);
    }

    protected WebElement getTxtConfirmPassword() {
        return Constant.WEBDRIVER.findElement(txtConfirmPassword);

    }
    protected WebElement getBtnChangePassword(){
        return Constant.WEBDRIVER.findElement(btnChangePassword);
    }
    protected WebElement getLblChangePassword_success(){
        return Constant.WEBDRIVER.findElement(lblChangePassword_success);
    }
    protected WebElement getLblChangePasswordError(){
        return Constant.WEBDRIVER.findElement(lblChangePasswordError);
    }
    //Methods
    public HomePage changepassword(String currentPassword, String Newpassword, String ConfirmPassword){
        this.getTxtCurrentPassword().sendKeys(currentPassword);
        this.getTxtNewPassword().sendKeys(Newpassword);
        this.getTxtConfirmPassword().sendKeys(ConfirmPassword);
        this.getBtnChangePassword().click();

        return new HomePage();
    }
    public String getChangePassword_success(){
       return this.getLblChangePassword_success().getText();
    }
    public String getChangePasswordError(){
        return this.getLblChangePasswordError().getText();
    }
    }

