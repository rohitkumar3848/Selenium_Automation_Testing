package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src//test//resources//features",
        glue = {"stepdefinations","hooks"},
        tags = "@smoke",
        plugin = {"pretty","html:target/htmlreports.html"},
        //we can craete reports using testunit or junit if we want to craete re[port using junit well so we have add junit dependency  and dont extend super class and run with cucucmber.class
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
