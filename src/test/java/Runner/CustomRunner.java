package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@CucumberOptions (
        features={"/Users/nkanikicharla/Library/CloudStorage/OneDrive-NisumTechnologiesInc/Desktop/TestNGCucumberProject/src/test/resources/Feature/Demo.feature"},
        tags="@smoke",
        plugin = {"pretty",
                "html:target/cucumber/report.html",
                "json:target/cucumber/report.json",
                "rerun:target/cucumber/cucumber-api-rerun.txt"},
        glue="StepDefinition",
        objectFactory =org.example.ApiContainer.class
)

public class CustomRunner extends AbstractTestNGCucumberTests {


}


