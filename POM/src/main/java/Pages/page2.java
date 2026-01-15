package Pages;

import Locators.Page2object;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v141.page.Page;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static Browser.browser.driver;
import static Browser.browser.wait;

public class page2 {
    public static void enterFullName(String name){
        try{
            wait.until(ExpectedConditions.visibilityOf(Page2object.getFullName()));
            Page2object.getFullName().sendKeys(name);

        }catch (Exception e){
            System.out.println("Exception occur while enterFullname--");
        }
    }

    public static void enterRediffEmail(String mail){
        try{
            wait.until(ExpectedConditions.visibilityOf(Page2object.getRediffEmail()));
            Page2object.getRediffEmail().sendKeys(mail);
        }catch (Exception e){
            System.out.println("Exception occur while enterEmail--");
        }
    }

    public static void checkValidEmail(){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(Page2object.getAvailBtn()));
            System.out.println("error raised here 00");
            Page2object.getAvailBtn().click();
            System.out.println("error raised here 11");

            wait.until(ExpectedConditions.visibilityOfElementLocated(Page2object.succeedMsg));
            System.out.println(Page2object.getSucceedMsg().getText());
            //wait.until(ExpectedConditions.visibilityOf(Page2object.getExistMsg()));
//            if (wait.until(ExpectedConditions.presenceOfElementLocated(Page2object.existMsg)).isDisplayed()) {
//                System.out.println(driver.findElement(Page2object.existMsg).getText());
//            }
//
//            if (wait.until(ExpectedConditions.presenceOfElementLocated(Page2object.succeedMsg)).isDisplayed()) {
//                System.out.println(driver.findElement(Page2object.succeedMsg).getText());
//            }
        }catch (Exception e){
            System.out.println("Exception occur while checking valid email" +e);
        }
    }

//    public static void checkValidEmail() {
//        try {
//            wait.until(ExpectedConditions.elementToBeClickable(Page2object.getAvailBtn()));
//            System.out.println("error raised here 00");
//            Page2object.getAvailBtn().click();
//            System.out.println("error raised here 11");
//
//            // Try EXIST message
//            try {
//                WebElement existMsg = Page2object.getExistMsg();
//                wait.until(ExpectedConditions.visibilityOf(existMsg));
//                System.out.println(existMsg.getText());
//                return;
//            } catch (TimeoutException ignored) {}
//
//            // Try SUCCESS message
//            try {
//                WebElement successMsg = Page2object.getSucceedMsg();
//                wait.until(ExpectedConditions.visibilityOf(successMsg));
//                System.out.println(successMsg.getText());
//                return;
//            } catch (TimeoutException ignored) {}
//
//            System.out.println("No message displayed");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

}
