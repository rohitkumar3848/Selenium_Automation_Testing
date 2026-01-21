package testcase;

import org.example.browser.Browser;
import org.example.pages.Page;
import org.testng.annotations.Test;

public class Rediff {
    @Test
    public void testRediff(){
        Browser.openBrowser("Chrome");
        Browser.navigation("Rediffmail - Free Email for Login with Secure Access");
        Page p1=new Page();
        p1.actionOnData();
        Browser.closeBrowser();

    }
}
