package testCase;

import org.browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSmartBazar {

    @BeforeMethod
    public void setUp(){
        Browser.openBrowser("Chrome");
        Browser.navigation("Smartbazaar - Home");
        System.out.println("Before SmartBazar");
    }

    @AfterMethod
    public void after(){
        Browser.closeBrowser();
        System.out.println("After SmartBazar");
    }
}
