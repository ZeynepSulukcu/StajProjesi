package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFilles"},
        glue = {"StepDefinations"},
        dryRun = false,
        plugin = { //basit rapor oluşturan plugin
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        }
)

public class _01_RegressionTest extends AbstractTestNGCucumberTests {

}
