package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsLocator {

    @FindBy(xpath = "//h1[@class='product_title entry-title']")
    public WebElement productName;

    @FindBy(xpath = "//p[@class='price']")
    public WebElement productPrice;



//    @FindBy(className = )
}
