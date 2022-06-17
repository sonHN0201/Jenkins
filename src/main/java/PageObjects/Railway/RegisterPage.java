package PageObjects.Railway;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GeneralPage{
    //Locator
    private final By txtEmail = By.id("email");
    private final By txtPassword = By.id("password");
    private final By txtConfirmPassword = By.id("confirmPassword");
    private final By txtPID = By.id("pid");
    private final By lblRegisterErrorMsg = By.xpath("//div[@id='content']//p[@class='message error']");
    private final By btnRegister = By.xpath("//p[@class='form-actions']//input[@title='Register']");
    private final By lblRegister_Sign_Up_Success = By.xpath("//div[@id='content']//p");
    private final By lblRegisterErrorMSg_Used= By.xpath("//div[@id='content']//p[contains(text(),'This email address is already in use.')]");
    private final By lblRegister_Invalid_Pass_Length = By.xpath("//li[@class='password']//label[@class='validation-error']");
    private final By lblRegister_Invalid_ID_Length= By.xpath("//li[@class='pid-number']//label[@class='validation-error']");
    private final By lblRegisterErrorMsg_Blank= By.xpath("//div[@id='content']//p[contains(text(),\"There're errors in the form. Please correct the errors and try again.\")]");
    //Elements
    protected WebElement getTxtEmail(){
        return Constant.WEBDRIVER.findElement(txtEmail);
    }
    protected WebElement getTxtPassword(){
        return Constant.WEBDRIVER.findElement(txtPassword);
    }
    protected WebElement getTxtConfirmPassword(){
        return Constant.WEBDRIVER.findElement(txtConfirmPassword);
    }
    protected WebElement getTxtPID(){
        return Constant.WEBDRIVER.findElement(txtPID);
    }
    protected WebElement getLblRegisterErrorMsg(){
        return Constant.WEBDRIVER.findElement(lblRegisterErrorMsg);
    }
    protected WebElement getBtnRegister(){
        return Constant.WEBDRIVER.findElement(btnRegister);
    }
    protected WebElement getLblRegister_Sign_Up_Success(){
        return Constant.WEBDRIVER.findElement(lblRegister_Sign_Up_Success);
    }
    protected WebElement getLblRegisterErrorMSg_Used(){
        return Constant.WEBDRIVER.findElement(lblRegisterErrorMSg_Used);
    }
    protected WebElement getLblRegister_Invalid_Pass_Length(){
        return Constant.WEBDRIVER.findElement(lblRegister_Invalid_Pass_Length);
    }
    protected WebElement getLblRegister_Invalid_ID_Length(){
        return Constant.WEBDRIVER.findElement(lblRegister_Invalid_ID_Length);
    }
    protected WebElement getLblRegisterErrorMsg_Blank(){
        return Constant.WEBDRIVER.findElement(lblRegisterErrorMsg_Blank);
    }
    //Methods
    public HomePage Register(String email,String password,String Confirm_password,String PID){
        this.getTxtEmail().sendKeys(email);
        this.getTxtPassword().sendKeys(password);
        this.getTxtConfirmPassword().sendKeys(Confirm_password);
        this.getTxtPID().sendKeys(PID);
        this.getBtnRegister().submit();

        return new HomePage();
    }
    public String getRegisterErrorMsg(){
        return this.getLblRegisterErrorMsg().getText();
    }
    public String getRegister_Sign_Up_Success(){
        return this.getLblRegister_Sign_Up_Success().getText();
    }
    public String getRegisterErrorMSg_Used(){
        return this.getLblRegisterErrorMSg_Used().getText();
    }
    public String getRegister_Invalid_Pass_Length(){
        return this.getLblRegister_Invalid_Pass_Length().getText();
    }
    public String getRegister_Invalid_ID_Length(){
        return this.getLblRegister_Invalid_ID_Length().getText();
    }
    public String getRegisterErrorMsg_Blank(){
        return this.getLblRegisterErrorMsg_Blank().getText();
    }
}
