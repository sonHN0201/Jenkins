package Testcases.Railway;

import Common.Constant;
import Common.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-Condition");

        System.setProperty("webdriver.chrome.driver", "D:\\LOGIGEAR\\SeleniumLevel1\\src\\main\\java\\Executables\\chromedriver.exe");
        Constant.WEBDRIVER = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Post-Condition");
        Constant.WEBDRIVER.quit();
    }
}
