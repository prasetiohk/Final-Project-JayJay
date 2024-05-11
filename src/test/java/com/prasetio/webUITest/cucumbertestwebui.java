package com.prasetio.webUITest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        glue = {"com.ryan.webUITest"},
        features = {"src/test/resources/web"},
        plugin = {"pretty", "html:reports/cucumber.html", "json:reports/cucumber.json"}

)

public class cucumbertestwebui {
}
