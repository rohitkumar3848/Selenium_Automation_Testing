package org.pages;

import org.locators.HomePageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.browser.Browser.driver;
import static org.browser.Browser.wait;

public class HomePage {
    HomePageLocator homePageLocator;


    public HomePage(){
        this.homePageLocator= new HomePageLocator();
        PageFactory.initElements(driver,this.homePageLocator);
    }

    public void popUp1CloseBtn(){
        try{
            wait.until(ExpectedConditions.invisibilityOf(this.homePageLocator.overlay));
//            wait.until(ExpectedConditions.elementToBeClickable(this.homePageLocator.popUp1closeBtn));
//            this.homePageLocator.popUp1closeBtn.click();
        } catch (Exception e) {
            System.out.println("Exception while closing the popUp1");
        }
    }


}
