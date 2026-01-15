package org.pages;

import org.locators.HomePageLocator;
import org.locators.ProductListLocator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.utils.ScrollUtil;

import java.util.List;

import static org.browser.Browser.driver;
import static org.browser.Browser.wait;

public class ProductListPage {
    ProductListLocator productListLocator;


    public ProductListPage(){
        this.productListLocator= new ProductListLocator();
        PageFactory.initElements(driver,this.productListLocator);
    }

    public void getProduct(String item){
        try{
            wait.until(ExpectedConditions.visibilityOf(this.productListLocator.productsWrapper));
            List<WebElement> allProducts=this.productListLocator.allProducts;

            for (WebElement product : allProducts) {
                WebElement productName = product.findElement(productListLocator.productText);
                //System.out.println("productName is--"+productName.getText().trim()+"==="+item);
                wait.until(ExpectedConditions.visibilityOf(productName));
                String actualName = productName.getText().trim();
                if (actualName.equalsIgnoreCase(item)) {
                    ScrollUtil.scrollToElement(product);
                    wait.until(ExpectedConditions.elementToBeClickable(product));
                    product.click();
                    return;
                }
            }

        }catch(Exception e){
            System.out.println("Exception occur in Product List Page");
        }
    }
}
