package hooks;

import Screenshot.capture;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.cucumber.java.*;
import org.apache.commons.math3.analysis.function.Exp;
import org.browser.Browser;
import org.utils.ExtentManager;

public class Hooks {

    public static ExtentReports extentReports = ExtentManager.getExtentReports();
    public static ExtentTest extentTest;

    // Runs ONCE before each scenario
    @Before("@smoke")
    public void setUp(Scenario scenario) {
        Browser.openBrowser("Chrome");
        Browser.navigation("Smartbazaar - Home");

        extentTest = extentReports.createTest(scenario.getName());
        extentTest.info("Browser opened and Smart Bazaar launched");
    }

    // Runs AFTER each scenario
    @After("@smoke")
    public void tearDown(Scenario scenario) {
        //String  scName=scenario.getName("","_");
        try{
//            capture.screenShot(scName);
//            String scPath=System.getProperty("user.dir")+"/target/Screenshot/"+scName+".png";
            if (scenario.isFailed()) {
                extentTest.fail("Scenario failed: " + scenario.getName());
                //MediaEntityBuilder.cra
            } else {
                extentTest.pass("Scenario passed successfully");
            }
        }catch (Exception ignored){

        }


        Browser.closeBrowser();   // ✅ close AFTER scenario only
        extentReports.flush();   // ✅ flush AFTER scenario only
    }

    @BeforeStep
    public void beforeStep() {
        extentTest.info("Starting step");
        System.out.println("Before every step like given, when, then");
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            extentTest.fail("Step failed");
        } else {
            extentTest.info("Step executed successfully");
        }
        System.out.println("After every step like given, when, then");
    }
}
