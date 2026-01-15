package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocator {

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchTextBox;


    @FindBy(className = "aws-search-btn_icon")
    public WebElement searchBtn;




}
