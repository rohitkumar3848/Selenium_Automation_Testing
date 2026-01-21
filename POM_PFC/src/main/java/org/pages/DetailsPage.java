package org.pages;


import org.locators.DetailsLocator;
import org.locators.SearchPageLocator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.browser.Browser.driver;
import static org.browser.Browser.wait;

public class DetailsPage {
    DetailsLocator detailsLocator;


    public DetailsPage(){
        this.detailsLocator= new DetailsLocator();
        PageFactory.initElements(driver,this.detailsLocator);
    }

    public String getDetails(){
        wait.until(ExpectedConditions.visibilityOf(this.detailsLocator.productName));
        String name=this.detailsLocator.productName.getText();
        System.out.println("Product Name is --> "+name);
        wait.until(ExpectedConditions.visibilityOf(this.detailsLocator.productPrice));
        String price=this.detailsLocator.productPrice.getText();
        System.out.println("Product price is --> "+price);
        return price;
    }

}
