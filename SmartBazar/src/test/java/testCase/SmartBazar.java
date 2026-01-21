package testCase;

import org.browser.Browser;
import org.pages.DetailsPage;
import org.pages.HomePage;
import org.pages.ProductListPage;
import org.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utils.ExcelUtil;

import java.io.File;

public class SmartBazar extends BaseSmartBazar {

    @Test(
            dataProvider = "productData",
            dataProviderClass = SmartBazarDataProvider.class
    )
    public void getPriceTest(String testCase,
                             String searchItem,
                             String productName,
                             String expectedPrice) {

        System.out.println("Test Case --"+testCase);
        HomePage homepage = new HomePage();
        homepage.popUp1CloseBtn();

        SearchPage searchPage = new SearchPage();
        searchPage.searchItem(searchItem);

        ProductListPage productListPage = new ProductListPage();
        productListPage.getProduct(productName);

        DetailsPage detailsPage = new DetailsPage();
        String actualPrice = detailsPage.getDetails();
        Assert.assertEquals(actualPrice, expectedPrice);
    }



}
