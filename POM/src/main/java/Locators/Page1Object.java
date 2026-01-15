package Locators;

import Browser.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page1Object extends browser {
    static By Logo= By.xpath("//div[@class='logo']");
    static By createAccount =By.tagName("a");

    //Method to find or get element of create account and store it
    public static WebElement logo(){
        WebElement logo=driver.findElement(Logo);
        return  logo;
    }
    public static List<WebElement> link(){
        List<WebElement> links=driver.findElements(createAccount);
        return  links;
    }

}
