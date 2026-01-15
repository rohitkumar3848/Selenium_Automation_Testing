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
        browser.navigation("Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");
        if(page1.getTitle().contains("Rediff.com")){
            System.out.println("Title verification succeed");
        }
        else{
            System.out.println("Title verification failed");
        }
        page1.click("Create Account");
        page2.enterFullName("rohit Kumar");
        page2.enterRediffEmail("rohitkumar");
        page2.checkValidEmail();
        //capture.screenShot("Message");
        //browser.closeBrowser();

    }
}
