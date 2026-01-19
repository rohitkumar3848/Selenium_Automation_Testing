package stepDefination;

import Browser.browser;
import Browser.utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1 {

    @Given("User open the browser")
    public void user_open_the_browser() throws Exception{
        String browserType= utility.properties("browser");
        browser.openBrowser(browserType);

    }
    @When("User  will enters the URL")
    public void user_will_enters_the_url() throws Exception{
        browser.navigation("Google");
    }

    @Then("User verifies the title {string} title")
    public void user_verifies_the_title_title(String string) {
       System.out.println("Verifying the  title");
    }
}
