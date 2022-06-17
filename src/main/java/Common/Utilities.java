package Common;

import PageObjects.Railway.LoginPage;

public class Utilities {
    public static String getWorkingPath(){
        return System.getProperty("D:\\LOGIGEAR\\SeleniumLevel1\\src\\main\\java\\Executables\\chromedriver.exe");
    }
//    public static String MultipleTimes(){
//        for (int i=1; i<=3; i++){
//            LoginPage loginPage = new LoginPage();
//            loginPage.login(Constant.USERNAME,Constant.PASSWORD1);
//        }
//        return null;
//    }

    public static String getProjectPath() {
        return null;
    }
    public static String getProjectPathDataJson(){
        return System.getProperty("user.dir") + "/src/main/resource/dataset/data.json";
    }
}
