package com.prasetio.apiTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
        glue = {"com.prasetio.apiTest"},
        features = {"src/test/resources/API"},
        plugin = {"pretty", "html:reports/cucumber.html", "json:reports/cucumber.json"}

)
public class CucumberTestAPI {
}
