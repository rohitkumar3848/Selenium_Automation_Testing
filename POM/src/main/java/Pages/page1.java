package Pages;

import Locators.Page1Object;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static Browser.browser.driver;
import static Browser.browser.wait;

public class page1 {
    public static String getTitle(){
        return driver.getTitle();
    }

    public static void  click(String text){
        try{
            wait.until(ExpectedConditions.visibilityOf(Page1Object.logo()));
            List<WebElement> elements=Page1Object.link();
            for(int i=0;i<elements.size();i++){
                if(elements.get(i).getText().equalsIgnoreCase(text)){
                    elements.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occur page1 account clicking--");
        }
    }


}
