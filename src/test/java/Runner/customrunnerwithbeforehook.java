package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features={"/Users/nkanikicharla/Library/CloudStorage/OneDrive-NisumTechnologiesInc/Desktop/TestNGCucumberProject/src/test/resources/Feature/Demo.feature"},
        tags="@smoke",
        plugin = {"json:cucumber.runtime.formatter.JSONFormatter", "json:target/cucumber_omsBPDOR.json",
                "html:target/cucumber-html-report"},
        glue="StepDefinition"
)
public class customrunnerwithbeforehook extends AbstractTestNGCucumberTests {


}


