package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features",
        glue = {"stepdefinations","hooks"},
        tags = "@smoke",
        plugin = {"junit:target/junitReports/report.xml"},
        //we can craete reports using testunit or junit if we want to craete re[port using junit well so we have add junit dependency  and dont extend super class and run with cucucmber.class
        monochrome = true
)
public class TestRunnerJUnit  {

}
