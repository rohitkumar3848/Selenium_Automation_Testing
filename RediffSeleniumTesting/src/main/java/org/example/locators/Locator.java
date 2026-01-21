package org.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locator {
    public @FindBy(xpath = "//button[@class='signin-btn']")
    WebElement signBtn;
}
