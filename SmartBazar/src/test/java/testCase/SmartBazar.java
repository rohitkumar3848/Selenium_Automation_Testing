package testCase;

import org.browser.Browser;
import org.pages.DetailsPage;
import org.pages.HomePage;
import org.pages.ProductListPage;
import org.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmartBazar {

    @BeforeMethod
    public void setUp(){
        Browser.openBrowser("Chrome");
        Browser.navigation("Smartbazaar - Home");
    }

    @Test
    public  void getPriceTest (){
        HomePage homepage=new HomePage();
        homepage.popUp1CloseBtn();
        SearchPage searchPage=new SearchPage();
        searchPage.searchItem("Rice");
        ProductListPage productListPage=new ProductListPage();
        productListPage.getProduct("Niru White Raw Rice (1kg)");
        DetailsPage detailsPage=new DetailsPage();
        String price=detailsPage.getDetails();
        Assert.assertEquals(price,"£2.59");
    }

    @AfterMethod
    public void after(){
        Browser.closeBrowser();
    }
}
