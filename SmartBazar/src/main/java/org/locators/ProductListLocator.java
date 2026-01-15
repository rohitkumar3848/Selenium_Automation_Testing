package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListLocator {

    @FindBy(xpath = "//*[@id='main']/ul")
    public WebElement productsWrapper;


    @FindAll(@FindBy(xpath = "//*[@id='main']/ul/li")) // using xpath (className | attribute)
    @CacheLookup
    public List<WebElement> allProducts;

    public By productText = By.tagName("h2");
}
