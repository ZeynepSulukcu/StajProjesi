package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;


@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFilles"},
        glue = {"StepDefinations"},
        dryRun = false,
        plugin = {

                        "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"

        }
)


public class _02_ExtendReport extends AbstractTestNGCucumberTests {



    @AfterClass
    public static void afterClass(){

        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("User Name","Zeynep Sulukcu");
        Reporter.setSystemInfo("Aplication Name", "BASQAR");
        Reporter.setSystemInfo("Operation System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber report");
    }
}
