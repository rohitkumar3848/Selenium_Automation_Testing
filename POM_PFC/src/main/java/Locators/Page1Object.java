package Locators;

import Browser.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class Page1Object extends browser {

    @FindBy(css = "textarea#APjFqb") //tagName#id
    public WebElement textEle;

    @FindBy(className="G43f7e") // using className
    public WebElement ulEle;

    @FindAll(@FindBy(xpath = "//ul[@class='G437e']/li")) // using xpath (className | attribute)
    @CacheLookup
    public List<WebElement> allLiEle;

    // Constructor
    public Page1Object() {
        PageFactory.initElements(driver, this);
    }

//    public Page1Object(){
//
//    }




}
