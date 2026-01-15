package TestCase;

import Browser.browser;
import Browser.utility;
import Pages.page1;
import Pages.page2;
import Screenshot.capture;

public class app {
    public static void main(String args[])throws Exception{
        String browserType= utility.properties("browser");
        browser.openBrowser(browserType);
        browser.navigation("Google");
        // ✅ Create page object
        page1 googlePage = new page1();


        googlePage.searchTextBox("leetcode");



        //capture.screenShot("Message");
        //browser.closeBrowser();

    }
}
