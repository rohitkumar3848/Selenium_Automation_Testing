package Pages;

import Locators.Page1Object;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static BrowserCheck.browser.driver;

public class page1 {

    Page1Object page1obje;

    // ✅ Constructor
    public page1() {
        this.page1obje = new Page1Object();
    }

    // ✅ Instance method
    public void searchTextBox(String data) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page1obje.textEle));
        page1obje.textEle.sendKeys(data);
    }
}
