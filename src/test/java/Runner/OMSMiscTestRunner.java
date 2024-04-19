package com.safeway.api.automation.api.offerSearchRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
        "src/test/resources/features/OMS/SC/offerTypes/REWARDS_ACCUMULATION/",
        "src/test/resources/features/OMS/SC/offerTypes/REWARDS_FLAT/",
        "src/test/resources/features/OMS/SC/offerTypes/CUSTOM/",
        //"src/test/resources/features/OMS/SC/offerTypes/ENTERPRISE_INSTANT_WIN/",
        "src/test/resources/features/OMS/SC/offerTypes/FAB_5_OR_SCORE_4/",
        "src/test/resources/features/OMS/SC/offerTypes/STORECLOSURE/",
        "src/test/resources/features/OMS/SC/offerRequest/DayAndTimeCondition.feature",
        "src/test/resources/features/OMS/SC/History/OfferRequestHistory.feature",
        "src/test/resources/features/OMS/SC/History/OfferHistory.feature",
//        "src/test/resources/features/OMS/SC/events/Events.feature",
},
        glue = "StepDefinitions",
        plugin = {"json:cucumber.runtime.formatter.JSONFormatter", "json:target/cucumber_omsMisc.json",
                "html:target/cucumber-html-report"},
        tags = "not @ignore and not @wip",
        dryRun = false, monochrome = true,
        objectFactory =org.example.ApiContainer.class
)

public class OMSMiscTestRunner extends AbstractTestNGCucumberTests {


}