package org.pages;

import org.locators.HomePageLocator;
import org.locators.SearchPageLocator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.browser.Browser.driver;
import static org.browser.Browser.wait;

public class SearchPage {
    SearchPageLocator searchPageLocator;


    public SearchPage(){
        this.searchPageLocator= new SearchPageLocator();
        PageFactory.initElements(driver,this.searchPageLocator);
    }

    public void searchItem(String item){
        try{
            wait.until(ExpectedConditions.visibilityOf(this.searchPageLocator.searchTextBox));
            this.searchPageLocator.searchTextBox.sendKeys(item);
            wait.until(ExpectedConditions.elementToBeClickable(this.searchPageLocator.searchBtn));
            this.searchPageLocator.searchBtn.click();

        }catch (Exception e){
            System.out.println("Exception in search page");
        }
    }
}
