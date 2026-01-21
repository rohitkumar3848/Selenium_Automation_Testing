package TestCase;

import BrowserCheck.browser;
import BrowserCheck.utility;
import Pages.page1;

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
