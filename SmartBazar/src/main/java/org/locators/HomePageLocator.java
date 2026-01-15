package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocator {

    @FindBy(xpath = "//img[@class='sp-image __web-inspector-hide-shortcut__']")
    public WebElement overlay;

    @FindBy(className = "brave_popup__close__button")
    public WebElement popUp1closeBtn;




}
