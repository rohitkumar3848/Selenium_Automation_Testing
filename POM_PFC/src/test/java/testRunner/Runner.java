package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src//test//resources//features",
        glue = {"stepDefination",},
        plugin = {"pretty","html:target/htmlreports.html"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
