package stepdefinations;

import com.aventstack.extentreports.Status;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.pages.DetailsPage;
import org.pages.HomePage;
import org.pages.ProductListPage;
import org.pages.SearchPage;
import org.testng.Assert;

public class SmartBazarSteps {

//    @Given("User open the browser")
//    public void user_open_the_browser() throws Exception {
//        String browserType = utility.properties("browser");
//        browser.openBrowser(browserType);
//
//    }
//    @When("User  will enters the URL")
//    public void user_will_enters_the_url() throws Exception {
//        browser.navigation("Google");
//    }
//
//    @Then("User verifies the title {string} title")
//    public void user_verifies_the_title_title(String string) {
//        System.out.println("Verifying the  title");
//    }
//
//    @And("User enter the data {string} of the product")
//    public void user_enter_the_data_of_the_product(String string) {
//
//    }
//
//    @Then("User verify the search Result")
//    public void user_verify_the_search_result() {
//
//    }

    HomePage homePage;
    SearchPage searchPage;
    ProductListPage productListPage;
    DetailsPage detailsPage;
    @Given("User opens the browser and launches Smart Bazar")
    public void user_opens_the_browser_and_launches_smart_bazar() {
      // browser already handles using hooks
        Hooks.extentTest.log(Status.INFO,"Browser opened and Smart Bazar application launched");
    }
    @And("User closes the popUp on home page")
    public void closePopUp() {
        homePage=new HomePage();
       // homePage.popUp1CloseBtn();
        Hooks.extentTest.log(Status.INFO,"PopUp closed on Home Page");
    }
    @When("User searches product {string}")
    public void search_product(String product) {
        searchPage=new SearchPage();
        searchPage.searchItem(product);
        Hooks.extentTest.log(Status.PASS,"Search product:"+product);
    }
    @And("User selects product {string}")
    public void select_product(String productName) {
        productListPage=new ProductListPage();
        productListPage.getProduct(productName);
        Hooks.extentTest.log(Status.PASS,"Browser product productName");
    }
    @Then("User should see the price {string}")
    public void verify_price(String expectedPrice) {
       detailsPage=new DetailsPage();
       String actualPrice=detailsPage.getDetails();
        Hooks.extentTest.log(Status.INFO," Actual price displayed "+actualPrice);
        Hooks.extentTest.log(Status.INFO," Expected price displayed "+expectedPrice);
        Assert.assertEquals(actualPrice,expectedPrice);
        Hooks.extentTest.log(Status.PASS," Price verified successfully ");

    }

}