package PageObjects.Railway;

import Common.Constant;

public class HomePage {
    public HomePage open(){
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
        return this;
    }
}
